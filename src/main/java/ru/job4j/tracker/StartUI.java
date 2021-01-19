package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    static String nLn = System.lineSeparator();

    private static void showMenu() {
        System.out.println(nLn + "Menu.");
        System.out.println("0. Add new Item.");
        System.out.println("1. Show all items.");
        System.out.println("2. Edit item.");
        System.out.println("3. Delete item.");
        System.out.println("4. Find item by Id.");
        System.out.println("5. Find items by name.");
        System.out.println("6. Exit Program.");
    }

    public static void createItem(Input input, Tracker tracker) {
        String name = input.askStr("=== Create a new Item ===" + nLn + "Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Created a new " + item);
    }

    public static void showAllItems(Tracker tracker) {
        Item[] resultFindAll = tracker.findAll();
        System.out.println(nLn + "Total items: " + resultFindAll.length);
        for (Item item : resultFindAll) {
            System.out.println(item);
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        int id = Integer.parseInt(input.askStr("Enter id for edit item: "));
        Item newItem = new Item(input.askStr("Enter new name: "));
        if (tracker.replace(id, newItem)) {
            System.out.println("Good. Edit end");
        } else {
            System.out.println("Error. Edit end");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        int id = Integer.parseInt(input.askStr("Enter id for delete item: "));
        if (tracker.delete(id)) {
            System.out.println("Good. Deleted id: " + id);
        } else {
            System.out.println("Error. Not delete id: " + id);
        }
    }

    public static void findById(Input input, Tracker tracker) {
        int id = Integer.parseInt(input.askStr("Enter id for find item: "));
        Item resultFind = tracker.findById(id);
        if (resultFind != null) {
            System.out.println("Result find by id: " + resultFind);
        } else {
            System.out.println("Error. Not found id: " + id);
        }
    }

    public static void findByName(Input input, Tracker tracker) {
        String newName = input.askStr("Enter name for find: ");
        Item[] resultFind = tracker.findByName(newName);
        if (resultFind.length > 0) {
            for (Item item : resultFind) {
                System.out.println("Result find by name: " + item);
            }
        } else {
            System.out.println("Error. Not found name: " + newName);
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            StartUI.showMenu();
            int select = Integer.parseInt(input.askStr("Select: "));
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showAllItems(tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findById(input, tracker);
            } else if (select == 5) {
                StartUI.findByName(input, tracker);
            } else if (select == 6) {
                run = false;
            } else {
                System.out.println(nLn + "Select number between 0 and 6");
            }
        }
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