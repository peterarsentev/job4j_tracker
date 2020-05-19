package ru.job4j.tracker;

public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.parseInt(input.askStr("Select: "));
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);

            } else if (select == 1) {
                System.out.println("=== Show all items ====");
                Item[] rsl = tracker.findAll();
                for (Item item : rsl) {
                    System.out.println("Id заявки = " + item.getId() + " name заявки = " + item.getName());
                }

            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                String id = input.askStr("Enter id: ");
                String name = input.askStr("Enter name: ");
                Item item = new Item(id, name);
                if (tracker.replace(id, item) == true) {
                    System.out.println("Success");
                } else {
                    System.out.println("Fail");
                }

            } else if (select == 3) {
                System.out.println("=== Delete item ====");
                String id = input.askStr("Enter id: ");
                if (tracker.delete(id) == true) {
                    System.out.println("Success");
                } else {
                    System.out.println("Fail");
                }
            } else if (select == 4) {
                System.out.println("=== Show items by id ====");
                String id = input.askStr("Enter id: ");
                System.out.println("Id заявки" + tracker.findById(id));

            } else if (select == 5) {
                System.out.println("=== Show items by name ====");
                String name = input.askStr("Enter name: ");
                Item[] rsl = tracker.findByName(name);
                for (Item item : rsl) {
                    System.out.println("Id заявки = " + item.getId() + " name заявки = " + item.getName());
                }

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
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
