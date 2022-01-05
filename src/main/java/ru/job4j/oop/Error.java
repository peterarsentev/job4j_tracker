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
        System.out.println("active: " + this.active + " status: "
                + this.status + " message: " + this.message);
    }

    public static void main(String[] args) {
        Error error1 = new Error(true, 1, "ОК");
        Error error2 = new Error(false, 2, "not ОК");
        Error error3 = new Error();
        error1.printInfo();
        error2.printInfo();
        error3.printInfo();
    }
}
