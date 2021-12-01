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
        System.out.println("Menu:");
        for (int i = 0; i < actions.length; i++) {
            System.out.println(i + ". " + actions[i].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(), new ShowAll(), new EditItem(),
                new DeleteItem(), new FindItemByID(), new FindItemByNAME(),
                new ExitProgram()

        };
        new StartUI().init(input, tracker, actions);
    }

}
