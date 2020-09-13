package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;

public class FindAllAction implements UserAction {
    private final Output out;

    public FindAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find all";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("== Find all ==");
        ArrayList<Item> items = tracker.findAll();
        if (items.size() > 0) {
            for (Item iter
                    : items) {
                out.println(iter.toString());
            }
        } else {
            out.println("0 objects with same name");
        }
        return true;
    }
}
