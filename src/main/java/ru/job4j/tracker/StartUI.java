package ru.job4j.tracker;
import java.util.Scanner;

public class StartUI {
    /**
     * метод запукает работу CLI
     * */
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int choice;
            do {
                choice = scanner.nextInt();
            } while ((choice > 6) || (choice < 0));
                if (choice == 0) {
                    System.out.println("Для добавления введите id и название: ");
                    System.out.println("Введите id: ");
                    int id = scanner.nextInt();
                    System.out.println("Введите название: ");
                    String name = scanner.nextLine();
                    Item item = new Item(name, id);
                    tracker.add(item);
                    System.out.println("Объект добавлен в трекер!");
                } else if (choice == 1) {   //+
                    System.out.println("~~~Вывод всех элементов трекера~~~");
                    Item[] all = tracker.findAll();
                    for (Item iter
                            : all) {
                        System.out.println(iter.toString());
                    }
                } else if (choice == 2) {
                    System.out.println("Для добавления введите название: ");
                    String name = scanner.nextLine();
                    System.out.println("Введите id заменяемого элемента");
                    int id2 = scanner.nextInt();
                    Item item = new Item();
                    item.setName(name);
                    boolean valid = tracker.replace(id2, item);
                    if (valid) {
                        System.out.println("Объект добавлен в трекер!");
                    } else {
                        System.out.println("Ошибка добавления");
                    }

                } else if (choice == 3) {
                    System.out.println("Введите id удаляемого элемента");
                    int id = scanner.nextInt();
                    boolean valid = tracker.delete(id);
                    if (valid) {
                        System.out.println("Заявка была удалена!");
                    } else {
                        System.out.println("Ошибка удаления");
                    }
                } else if (choice == 4) {
                    System.out.println("input id");
                    int id = scanner.nextInt();
                    Item item = tracker.findById(id);
                    if (item != null) {
                        System.out.println("searched: " + item.toString());
                    } else {
                        System.out.println("was not found");
                    }

                } else if (choice == 5) {
                    System.out.println("input name: ");
                    String name = scanner.nextLine();
                    Item[] searched = tracker.findByName(name);
                    if (searched.length > 0) {
                        for (Item iter
                                : searched) {
                            System.out.println(iter.toString());
                        }
                    } else {
                        System.out.println("0 objects with same name");
                    }
                } else {
                    System.out.println("Exit...");
                    break;
                }

        }
    }

    /**
     * Вывод меню
     * */
    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        System.out.println("Select: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
