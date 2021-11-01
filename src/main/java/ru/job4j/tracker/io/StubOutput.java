package ru.job4j.tracker.io;

import ru.job4j.tracker.io.Output;

public class StubOutput implements Output {
    private final StringBuilder buffer = new StringBuilder();

    @Override
    public void println(Object obj) {
        if (obj != null) {
            buffer.append(obj.toString());
        } else {
            buffer.append("null");
        }
        buffer.append(System.lineSeparator());
    }

    public String toString() {
        return buffer.toString();
    }
}
