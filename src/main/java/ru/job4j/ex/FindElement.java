package ru.job4j.ex;

public class FindElement {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                result = index;
                break;
            }
        }

        if (result == -1) {
            throw new ElementNotFoundException("Element '" + key + "' not found.");
        }

        return result;
    }

    public static void main(String[] args) {
        try {
            indexOf(new String[]{"Petr", "Stas", "Igor", "Matvey"}, "Pavel");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
