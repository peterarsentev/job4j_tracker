package ru.job4j.gen;

import java.util.ArrayList;
import java.util.List;

public final class MemStore<T extends Base> implements Store<T> {

    private List<T> mem = new ArrayList<>();

    @Override
    public void add(T model) {
        mem.add(model);
    }

    private int search(String id) {
        for (int i = 0; i < mem.size(); i++) {
            if (mem.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean replace(String id, T model) {
        int number = search(id);
        if (number != -1) {
            mem.set(number, model);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(String id) {
        int number = search(id);
        if (number != -1) {
            mem.remove(number);
            return true;
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
