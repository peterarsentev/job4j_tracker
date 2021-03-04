package ru.job4j.tracker;

public class StartUI {
    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Выберете: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {

        System.out.println("Меню.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Редактировать заявку ====");
        System.out.print("Введите id: ");
        int id = input.askInt("Введите id: ");
        String name = input.askStr("Введите имя: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Заявка отредактировна успешно");
        } else {
            System.out.println("Ошибка, такой заявки не существует");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Удалить заявку ====");
        int id = input.askInt("Введите id: ");
        if (tracker.delete(id)) {
            System.out.println("Заявка удалена успешно");
        } else {
            System.out.println("Ошибка, такой заявки не существует");
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {new CreateAction(), new FindAllAction(), new ReplaceAction(), new DeleteItemAction(),
                new SearchItemIdAction(), new SearchItemNameAction(), new ExitActions()};
        new StartUI().init(input, tracker, actions);
    }
}
