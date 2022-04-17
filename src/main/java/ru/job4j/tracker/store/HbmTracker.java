package ru.job4j.tracker.store;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import ru.job4j.tracker.model.Item;
import ru.job4j.tracker.react.Observe;

import java.util.List;

public class HbmTracker implements Store, AutoCloseable {
    private final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
            .configure().build();
    private final SessionFactory sf = new MetadataSources(registry)
            .buildMetadata().buildSessionFactory();

    @Override
    public Item add(Item item) {
        Session session = sf.openSession();
        session.beginTransaction();
        session.save(item);
        session.getTransaction().commit();
        session.close();
        return item;
    }

    @Override
    public boolean replace(int id, Item item) {
        Session session = sf.openSession();
        session.beginTransaction();
        int result = session.createQuery("update Item set name=:name where id=:id")
                .setParameter("name", item.getName())
                .setParameter("id", id).executeUpdate();
        session.getTransaction().commit();
        System.out.println(result);
        return result == 1;
    }

    @Override
    public boolean delete(int id) {
        Session session = sf.openSession();
        session.beginTransaction();
        int result = session.createQuery("delete Item where id=:id")
                .setParameter("id", id).executeUpdate();
        session.getTransaction().commit();
        System.out.println(result);
        return result == 1;
    }

    @Override
    public List<Item> findAll() {
        Session session = sf.openSession();
        session.beginTransaction();
        List result = session.createQuery("from Item").list();
        session.getTransaction().commit();
        session.close();
        return result;
    }

    @Override
    public List<Item> findByName(String key) {
        Session session = sf.openSession();
        session.beginTransaction();
        Query query = session.createQuery("from Item  where name=:key");
        query.setParameter("key", key);
        List result = query.list();
        session.getTransaction().commit();
        session.close();
        return result;
    }

    @Override
    public Item findById(int id) {
        Session session = sf.openSession();
        session.beginTransaction();
        Item result = session.get(Item.class, id);
        session.getTransaction().commit();
        session.close();
        return result;
    }

    @Override
    public void findAllByReact(Observe<Item> observe) {

    }

    @Override
    public void close() throws Exception {
        StandardServiceRegistryBuilder.destroy(registry);
    }

    public static void main(String[] args) {
        Store tracker = new HbmTracker();
        Item item1 = new Item("item1");
        Item item2 = new Item("item2");
        Item item3 = new Item("item3");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item2);
        tracker.add(item3);
        System.out.println(tracker.findAll());
        System.out.println(tracker.findByName("item2"));
        System.out.println(tracker.findById(10));
        tracker.delete(10);
        System.out.println(tracker.findAll());
        tracker.replace(12, new Item("item12"));
        System.out.println(tracker.findAll());
    }
}
