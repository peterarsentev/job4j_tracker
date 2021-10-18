package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public  Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {

    }

    public void printdata() {
        System.out.println("Online " + active);
        System.out.println("Number " + status);
        System.out.println("Mail " + message);
    }

    public static void main(String[] args) {
        Error error = new Error(true, 50, "Hello");
        Error danger = new Error(false, 100, "STOP");
        Error wrong = new Error();
        Error reset = new Error();
        error.printdata();
        wrong.printdata();
        danger.printdata();
        reset.printdata();
    }
}
