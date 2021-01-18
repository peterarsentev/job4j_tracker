package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.parseInt(input.askStr("Select: "));
            if (select == 0) {
                String name = input.askStr("=== Create a new Item ===" + "\nEnter name: ");
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Created a new " + item);
            } else if (select == 1) {
                Item[] resultFindAll = tracker.findAll();
                System.out.println("\nTotal items: " + resultFindAll.length);
                for (Item item : resultFindAll) {
                    System.out.println(item);
                }
            } else if (select == 2) {
                int id = Integer.parseInt(input.askStr("Enter id for edit item: "));
                Item newItem = new Item(input.askStr("Enter new name: "));
                if (tracker.replace(id, newItem)) {
                    System.out.println("Good. Edit end");
                } else {
                    System.out.println("Error. Edit end");
                }
            } else if (select == 3) {
                int id = Integer.parseInt(input.askStr("Enter id for delete item: "));
                if (tracker.delete(id)) {
                    System.out.println("Good. Deleted id: " + id);
                } else {
                    System.out.println("Error. Not delete id: " + id);
                }
            } else if (select == 4) {
                int id = Integer.parseInt(input.askStr("Enter id for find item: "));
                Item resultFind = tracker.findById(id);
                if (tracker.findById(id) != null) {
                    System.out.println("Result find by id: " + resultFind);
                } else {
                    System.out.println("Error. Not found id: " + id);
                }
            } else if (select == 5) {
                String newName = input.askStr("Enter name for find: ");
                Item[] resultFind = tracker.findByName(newName);
                if (resultFind.length > 0) {
                    for (Item item : resultFind) {
                        System.out.println("Result find by name: " + item);
                    }
                } else {
                    System.out.println("Error. Not found name: " + newName);
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("\nMenu.");
        System.out.println("0. Add new Item.");
        System.out.println("1. Show all items.");
        System.out.println("2. Edit item.");
        System.out.println("3. Delete item.");
        System.out.println("4. Find item by Id.");
        System.out.println("5. Find items by name.");
        System.out.println("6. Exit Program.");
    }

    public static void main(String[] args) {
        Item time = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = time.getCreated().format(formatter);
        System.out.println("Текущие дата и время после форматирования: "
                + currentDateTimeFormat);
        Tracker track = new Tracker();
        Item item = new Item();
        Item findItem = track.add(item);
        int temp = 5;
        Item findId = track.findById(temp);
        System.out.println(findId);
        Item user = new Item(1, "Gordon");
        System.out.println("Item: "
                        + user.getId() + " "
                        + user.getName() + " ");
        //выше другие задания
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}