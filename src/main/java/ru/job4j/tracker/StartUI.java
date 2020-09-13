package ru.job4j.tracker;

import java.util.ArrayList;

public class StartUI {

    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    /**
     * метод запукает работу CLI
     * */
    public void init(Input input, Tracker tracker, ArrayList<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.size()) {
                out.println("Wrong input, you can select: 0 .. " + (actions.size() - 1));
                continue;
            }
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    /**
     * Вывод меню
     * */
    private void showMenu(ArrayList<UserAction> actions) {
        out.println("Menu.");
        for (int index = 0; index < actions.size(); index++) {
            out.println(index + ". " + actions.get(index).name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        Tracker tracker = new Tracker();
        ArrayList<UserAction> actions = new ArrayList<UserAction>();
        actions.add(new CreateAction(output));
        actions.add(new DeleteAction(output));
        actions.add(new FindAllAction(output));
        actions.add(new FindByNameAction(output));
        actions.add(new FindByIdAction(output));
        actions.add(new ReplaceAction(output));
        actions.add(new Exit(output));

        new StartUI(output).init(input, tracker, actions);
    }
}
