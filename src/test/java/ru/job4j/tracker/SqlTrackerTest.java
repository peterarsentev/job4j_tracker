package ru.job4j.tracker;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.job4j.tracker.model.Item;
import ru.job4j.tracker.store.SqlTracker;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class SqlTrackerTest {

    private static Connection connection;

    @BeforeClass
    public static void initConnection() {
        try (InputStream in = SqlTrackerTest.class.getClassLoader().
                getResourceAsStream("test.properties")) {
            Properties config = new Properties();
            config.load(in);
            Class.forName(config.getProperty("driver-class-name"));
            connection = DriverManager.getConnection(
                    config.getProperty("url"),
                    config.getProperty("username"),
                    config.getProperty("password")
            );
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @AfterClass
    public static void closeConnection() throws SQLException {
        connection.close();
    }

    @After
    public void wipeTable() throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement("delete from items")) {
            statement.execute();
        }
    }

    @Test
    public void createItem() {
        SqlTracker tracker = new SqlTracker(connection);
        tracker.add(new Item("name"));
        assertThat(tracker.findByName("name").size(), is(1));
    }

    @Test
    public void replaceItem() {
        SqlTracker tracker = new SqlTracker(connection);
        Item item = new Item("name");
        tracker.add(item);
        tracker.replace(item.getId(), new Item("replaced"));
        assertThat(tracker.findById(item.getId()).getName(), is("replaced"));
    }

    @Test
    public void deleteItem() {
        SqlTracker tracker = new SqlTracker(connection);
        Item item = new Item("delete");
        tracker.add(item);
        tracker.delete(item.getId());
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void findByNameItems() {
        SqlTracker tracker = new SqlTracker(connection);
        Item item = new Item("name1");
        tracker.add(item);
        List<Item> result = tracker.findByName("name1");
        assertThat(result, is(List.of(item)));
    }

    @Test
    public void findByIdItems() {
        SqlTracker tracker = new SqlTracker(connection);
        Item item = new Item("name");
        tracker.add(item);
        assertThat(tracker.findById(item.getId()), is(item));
    }
}