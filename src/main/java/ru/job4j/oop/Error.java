package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Logic - " + active);
        System.out.println("Int - " + status);
        System.out.println("Text - " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error parameterFirst = new Error(true, 14, "Hi");
        parameterFirst.printInfo();
        Error parameterSecond = new Error(true, 1, "Второй вариант");
        parameterSecond.printInfo();
        Error parameterThird = new Error(true, 32, "Третий вариант");
        parameterThird.printInfo();
    }
}