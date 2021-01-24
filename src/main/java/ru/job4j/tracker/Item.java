package ru.job4j.tracker;

public class Item {
    private int id;
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Item() {
        super();
        System.out.println("load item");
    }

    public String getId() {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Bug bug = new Bug("jjj");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item = (Item) o;
        return Objects.equals(id, item.id)
                && Objects.equals(name, item.name);
    }

    @Override
    public String toString() {
        return "Id заявки = " + id + " name заявки = " + name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}