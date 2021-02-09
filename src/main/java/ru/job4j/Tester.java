package ru.job4j;

import ru.job4j.collection.Job;
import ru.job4j.collection.JobDescByName;
import ru.job4j.collection.JobDescByPriority;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Tester {
    public static class Task {
        private final String name;
        private final long spent;

        public Task(String name, long spent) {
            this.name = name;
            this.spent = spent;
        }

        @Override
        public String toString() {
            return "Task{" +
                    "name='" + name + '\'' +
                    ", spent=" + spent +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Task> tasks = List.of(
                new Task("Bug #1", 100),
                new Task("Task #2", 100),
                new Task("Bug #3", 100)
        );
        List<Task> bugs = tasks.stream().filter(
                task -> task.name.contains("Bug")
        ).collect(Collectors.toList());
        bugs.forEach(System.out::println);
    }
}
