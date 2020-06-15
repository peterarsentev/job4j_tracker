package ru.job4j.oop.task3;

public class Engineer extends Profession {
    private String taskCount;

    public String getTaskCount() {
        return taskCount;
    }

    public void setTaskCount(String taskCount) {
        this.taskCount = taskCount;
    }

    public String taskDone() {
        return taskCount;
    }
}
