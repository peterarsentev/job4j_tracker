package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Метод init() - инициализирует приложение и запускает выполнение различных
 * пользовательских действий;
 * Метод showMenu() - выводит на экран меню доступных пользовательских действий;
 * main() просто запускает наше приложение. В методе main() создается объект Scanner,
 * который позволит получать данные с консоли от пользователя, Tracker будет служить хранилищем заявок.
 */

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Введите пункт меню ");
            UserAction action = actions[select];
            run = action.execute(input,tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        out.println("Menu:");
        for (int i = 0; i < actions.length; i++) {
            out.println(i + ". " + actions[i].name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output), new ShowAll(output), new EditItem(output),
                new DeleteItem(output), new FindItemByID(output), new FindItemByNAME(output),
                new ExitProgram(output)

        };
        new StartUI(output).init(input, tracker, actions);
    }
}
