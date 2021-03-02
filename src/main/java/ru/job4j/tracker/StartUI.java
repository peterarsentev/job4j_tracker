package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Выберете: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Создать новую заявку ====");
                System.out.print("Введите имя: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Посмотреть все заявки ====");
                for (Item item : tracker.findAll()) {
                    System.out.println(item);
                }
            } else if (select == 2) {
                System.out.println("=== Редактировать заявку ====");
                System.out.print("Введите id: ");
                int id = Integer.valueOf(scanner.nextLine());
                System.out.print("Введите имя: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Заявка отредактировна успешно");
                } else {
                    System.out.println("Ошибка, такой заявки не существует");
                }
            } else if (select == 3) {
                System.out.println("=== Удалить заявку ====");
                System.out.print("Введите id: ");
                int id = Integer.valueOf(scanner.nextLine());
                if (tracker.delete(id)) {
                    System.out.println("Заявка удалена успешно");
                } else {
                    System.out.println("Ошибка, такой заявки не существует");
                }
            } else if (select == 4) {
                System.out.println("=== Найти заявку по Id ====");
                System.out.print("Введите id: ");
                int id = Integer.valueOf(scanner.nextLine());
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item);
                } else {
                    System.out.println("Заявка с таким id не найдена");
                }
            } else if (select == 5) {
                System.out.println("=== Найти заявки по имени ====");
                System.out.print("Введите имя: ");
                String name = scanner.nextLine();
                Item[] items = tracker.findByName(name);
                if (items.length > 0) {
                    for (Item item : items) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println("Заявки с таким именем не найдена");
                }
            } else if (select == 6) {
                System.out.println("=== Выход ====");
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Меню.");
        System.out.println("0. Создать новую заявку");
        System.out.println("1. Посмотреть все заявки");
        System.out.println("2. Редактировать заявку");
        System.out.println("3. Удалить заявку");
        System.out.println("4. Найти заявку по Id");
        System.out.println("5. Найти заявки по имени");
        System.out.println("6. Выход");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
