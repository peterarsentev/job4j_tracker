package ru.job4j.tracker;

public class StartUI {
    public static final String NL = System.lineSeparator();

    private static void showMenu() {
        System.out.println(NL + "Menu.");
        System.out.println("0. Add new Item.");
        System.out.println("1. Show all items.");
        System.out.println("2. Edit item.");
        System.out.println("3. Delete item.");
        System.out.println("4. Find item by Id.");
        System.out.println("5. Find items by name.");
        System.out.println("6. Exit Program.");
    }

    public static void createItem(Input input, Tracker tracker) {
        String name = input.askStr("=== Create a new Item ===" + NL + "Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Created a new " + item);
    }

    public static void showAllItems(Tracker tracker) {
        Item[] resultFindAll = tracker.findAll();
        System.out.println(NL + "Total items: " + resultFindAll.length);
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

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new ShowAllItems(),
                new ReplaceAction(),
                new DeleteItem(),
                new FindById(),
                new FindByName(),
                new ExitProgram()
        };
        new StartUI().init(input, tracker, actions);
    }
}