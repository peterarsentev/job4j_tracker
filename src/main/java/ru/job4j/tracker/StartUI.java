package ru.job4j.tracker;

public class StartUI {

    private final Output out;

    public StartUI(Output out) {
        this.out = out;
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
        out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output),
                new DeleteAction(output),
                new FindAllAction(output),
                new FindByNameAction(output),
                new FindByIdAction(output),
                new ReplaceAction(output),
                new Exit(output)

        };
        new StartUI(output).init(input, tracker, actions);
    }
}
