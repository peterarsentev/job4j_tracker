package ru.job4j.tracker;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Выберете: ");
            if (select < 0 || select >= actions.length) {
                out.println("Неправильный ввод вы должны ввести число от 0 до " + (actions.length - 1));
                continue;
            }
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {

        out.println("Меню.");
        for (int index = 0; index < actions.length; index++) {
            out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {new CreateAction(output), new FindAllAction(output), new ReplaceAction(output),
                new DeleteItemAction(output), new SearchItemIdAction(output), new SearchItemNameAction(output), new Exit()};
        new StartUI(output).init(input, tracker, actions);
    }
}
