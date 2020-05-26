package ru.job4j.tracker;

public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.parseInt(input.askStr("Select: "));
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.allItems(tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deteleItem(input, tracker);
            } else if (select == 4) {
                StartUI.findIdItem(input, tracker);
            } else if (select == 5) {
                StartUI.findNameItems(input, tracker);
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

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void deteleItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        String id = input.askStr("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ====");
        String id = input.askStr("Enter id: ");
        String name = input.askStr("Enter name: ");
        Item item = new Item(id, name);
        if (tracker.replace(id, item)) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
    }

    public static void allItems(Tracker tracker) {
        System.out.println("=== Show all items ====");
        Item[] rsl = tracker.findAll();
        for (Item item : rsl) {
            System.out.println(item);
        }
    }

    public static void findNameItems(Input input, Tracker tracker) {
        System.out.println("=== Show items by name ====");
        String name = input.askStr("Enter name: ");
        Item[] rsl = tracker.findByName(name);
        if (rsl.length > 0) {
            for (Item item : rsl) {
                System.out.println(item);
            }
        } else System.out.println("Заявки с данным именем отсутствуют");

    }

    public static void findIdItem(Input input, Tracker tracker) {
        System.out.println("=== Show items by id ====");
        String id = input.askStr("Enter id: ");
        Item idItem = tracker.findById(id);
        if (idItem != null) {
            System.out.println("Id заявки" + idItem);
        } else System.out.println("Заявка с данным id отсутствует");
    }


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
        StartUI.createItem(input, tracker);
    }
}
