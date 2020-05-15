package ru.job4j.tracker;
import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.println("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);

            } else if (select == 1) {
                System.out.println("=== Show all items ====");
                tracker.findAll();

            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(id, name);
                if (tracker.replace(id, item)) {
                    System.out.print("Success");
                } else {
                    System.out.print("Fail");
                }

            } else if (select == 3) {
                System.out.println("=== Delete item ====");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                if (tracker.delete(id)) {
                    System.out.print("Success");
                } else {
                    System.out.print("Fail");
                }
            } else if (select == 4) {
                System.out.println("=== Show items by id ====");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                tracker.findByName(id);

            } else if (select == 5) {
                System.out.println("=== Show items by name ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                tracker.findByName(name);

            } else if (select == 6) {
                System.out.println("=== Exit from program ====");
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
