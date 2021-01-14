package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Created a new " + item);
            } else if (select == 1) {
                Item[] resultFindAll = tracker.findAll();
                for (Item item : resultFindAll) {
                    System.out.println(item);
                }
            } else if (select == 2) {
                System.out.print("Enter id for edit request: ");
                int id = scanner.nextInt();
                Item nameRequest = tracker.findById(id);
                System.out.println(nameRequest);
                System.out.print("Enter new name: ");
                String newName = scanner.nextLine();
                Item newItem = new Item(scanner.nextLine());
                if (tracker.replace(id, newItem)) {
                    System.out.println("Good. Edit end");
                } else {
                    System.out.println("Error. Edit end");
                }
            } else if (select == 3) {
                System.out.print("Enter id for delete request: ");
                int id = scanner.nextInt();
                Item newItem = new Item(scanner.nextLine());
                if (tracker.delete(id)) {
                    System.out.println("Good. Deleted id: " + id);
                } else {
                    System.out.println("Error. Not delete id: " + id);
                }
            } else if (select == 4) {
                System.out.print("Enter id for find request: ");
                int id = scanner.nextInt();
                Item newItem = new Item(scanner.nextLine());
                Item resultFind = tracker.findById(id);
                if (tracker.findById(id) != null) {
                    System.out.println("Result find by id: " + resultFind);
                } else {
                    System.out.println("Error. Not found id: " + id);
                }
            } else if (select == 5) {
                System.out.print("Enter name for find: ");
                String newName = scanner.nextLine();
                Item[] resultFind = tracker.findByName(newName);
                if (resultFind.length > 0) {
                    System.out.println("Result find by name: " + 1);
                } else {
                    System.out.println("Error. Not found name: " + newName);
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
