package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Item {
    private LocalDateTime created = LocalDateTime.now();
    private int id;
    private String name;
    private static final DateTimeFormatter FORMATTER
            = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id && Objects.equals(created, item.created)
                && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(created, id, name);
    }

    public void setId(int id) {
        this.id = id;
    }

    public Item(String name) {
        this.name = name;
    }

    public  Item() {
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Item{" +
                "created=" + created.format(FORMATTER) +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}