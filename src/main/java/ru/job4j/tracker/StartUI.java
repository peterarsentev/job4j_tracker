package ru.job4j.tracker;

public class StartUI {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("Для добавления введите id и название: ");
        int id = input.askInt("Введите id: ");
        String name = input.askStr("Введите название: ");
        Item item = new Item(name, id);
        tracker.add(item);
        System.out.println("Объект добавлен в трекер!");
    }

    public static void showAll(Input input, Tracker tracker) {
        System.out.println("~~~Вывод всех элементов трекера~~~");
        Item[] all = tracker.findAll();
        for (Item iter
                : all) {
            System.out.println(iter.toString());
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println(" === Update item ====");
        int id = input.askInt("Enter id:");
        String name = input.askStr("Enter a new name of item: ");
        Item item = new Item(name);
        item.setId(id);
        tracker.replace(id, item);
    }

    public static void deleteItem(Input input, Tracker tracker) {
        int id = input.askInt("Введите id удаляемого элемента");
        boolean valid = tracker.delete(id);
        if (valid) {
            System.out.println("Заявка была удалена!");
        } else {
            System.out.println("Ошибка удаления");
        }
    }

    public static void searchIdItem(Input input, Tracker tracker) {
        int id = input.askInt("input id");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("searched: " + item.toString());
        } else {
            System.out.println("was not found");
        }
    }

    public static void nameSearch(Input input, Tracker tracker) {
        String name = input.askStr("input name: ");
        Item[] searched = tracker.findByName(name);
        if (searched.length > 0) {
            for (Item iter
                    : searched) {
                System.out.println(iter.toString());
            }
        } else {
            System.out.println("0 objects with same name");
        }
    }

    /**
     * метод запукает работу CLI
     * */
    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    /**
     * Вывод меню
     * */
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
                new CreateAction()
        };
        new StartUI().init(input, tracker, actions);
    }
}
