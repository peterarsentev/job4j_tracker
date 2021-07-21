package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
        this.message = "empty";
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Error: " + "active= " + active + ", status= " + status + ", message= " + message;
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error error1  = new Error(false, 102, "Processing");
        Error error2  = new Error(true, 226, "IM Used");
        System.out.println(error);
        System.out.println(error1);
        System.out.println(error2);
    }
}
