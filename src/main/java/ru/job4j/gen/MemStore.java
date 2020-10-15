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
        T tmp = null;
        int number = 0;
        for (int i = 0; i < mem.size(); i++) {
            T temp = mem.get(i);
            if (temp.getId().equals(id)) {
                tmp = temp;
                number = i;
                break;
            }
        }
        if (tmp != null) {
            mem.set(number, model);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(String id) {
        for (int i = 0; i < mem.size(); i++) {
            if (mem.get(i).getId().equals(id)) {
                mem.remove(i);
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
