package ru.job4j.finalProd;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

//StreamJob4j.of(..).filter(...).map(..).collect(...)
public class Streamjob<T> {
    private List<T> list = new ArrayList<>();

    public Streamjob(T[] list) {
        this.list.addAll(Arrays.asList(list));
    }

    public Streamjob(List<T> list) {
        this.list = list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public static <T> Streamjob of(T... tses) {
        return new Streamjob(tses);
    }

    public Streamjob<T> filter(Predicate<T> predicate) {
        List<T> newList = new ArrayList<>();
        for (T t : this.list) {
            if (predicate.test(t)) {
                newList.add(t);
            }
        }
        return new Streamjob<>(newList);
    }

    public <R> Streamjob<T> map(Function<T, R> func) {
        List<R> newList = new ArrayList<>();
        for (T t : this.list) {
            newList.add(func.apply(t));
        }
        return new Streamjob<T>((List<T>) newList);
    }

    public Collection<T> collect(String arg) {
        switch (arg) {
            case "List":
                return new ArrayList<>(this.list);
            case "Set":
                return new TreeSet<>(this.list);
            default:
        }
        return null;
    }
}
