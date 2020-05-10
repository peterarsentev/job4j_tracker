package ru.job4j.oop.task3;

public class Surgeon extends Doctor {
    private int operation;
    private int countSuccess;

    public int getOperation() {
        return operation;
    }

    public void setOperation(int operation) {
        this.operation = operation;
    }

    public int getCountSuccess() {
        return countSuccess;
    }

    public void setCountSuccess(int countSuccess) {
        this.countSuccess = countSuccess;
    }

    public int countSuccess (){
        return countSuccess;
    }
}
