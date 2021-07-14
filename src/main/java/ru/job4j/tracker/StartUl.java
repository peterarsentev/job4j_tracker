package ru.job4j.tracker;

public class StartUl {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Добавленная заявка: " + item);
    }

    public static void showAllItems(Tracker tracker) {
        System.out.println("=== Show all items ====");
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Хранилище еще не содержит заявок");
        }
    }

    public static void EditItem(Tracker tracker, Input input) {
        System.out.println("=== Edit item ====");
        int id = Integer.parseInt(input.askStr("Enter id: "));
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Заявка изменена успешно.");
        } else {
            System.out.println("Ошибка замены заявки.");
        }
    }

    public static void deleteItem(Tracker tracker, Input input) {
        System.out.println("=== Delete item ====");
        int id = Integer.parseInt(input.askStr("Enter id: "));
        if (tracker.delete(id)) {
            System.out.println("Заявка удалена успешно.");
        } else {
            System.out.println("Ошибка удаления заявки.");
        }
    }

    public static void findItemId(Tracker tracker, Input input) {
        System.out.println("=== Find item by id ====");
        int id = Integer.parseInt(input.askStr("Enter id: "));
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Заявка с введеным id: " + id + " не найдена.");
        }
    }

    public static void findItemName(Tracker tracker, Input input) {
        System.out.println("=== Find items by name ====");
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Заявки с именем: " + name + " не найдены.");
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            int select = Integer.parseInt(input.askStr("Select: "));
            if (select == 0) {
                StartUl.createItem(input, tracker);
            } else if (select == 1) {
                StartUl.showAllItems(tracker);
            } else if (select == 2) {
                StartUl.EditItem(tracker, input);
            } else if (select == 3) {
                StartUl.deleteItem(tracker, input);
            } else if (select == 4) {
                StartUl.findItemId(tracker, input);
            } else if (select == 5) {
                StartUl.findItemName(tracker, input);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        String[] menu = {"Add new Item", "Show all items", "Edit item",
            "Delete item", "Find item by id", "Find items by name",
            "Exit Program"};
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + "." + menu[i]);
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUl().init(input, tracker);

    }
}