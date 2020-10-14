package ru.job4j.gen;

import java.util.ArrayList;
import java.util.List;

public final class MemStore<T extends Base> implements Store<T> {

    private List<T> mem = new ArrayList<>();

    @Override
    public void add(T model) {
        mem.add(model);
    }

    @Override
    public boolean replace(String id, T model) {
        T tmp = mem.stream()
                .filter(e -> e.getId()
                        .equals(id))
                .findFirst()
                .orElse(null);
        if (mem.contains(tmp)) {
            mem.set(mem.indexOf(tmp), model);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(String id) {
        for (T t : mem) {
            if (t.getId().equals(id)) {
                t = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public T findById(String id) {
        return mem.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
