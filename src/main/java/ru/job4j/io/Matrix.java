package ru.job4j.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Matrix {
    public void writeM() {
        try (FileOutputStream file = new FileOutputStream("result.txt")) {
            for (int i = 1; i < 10; i++) {
                for (int j = 1; j < 10; j++) {
                    int rsl = i * j;
                    file.write((String.valueOf(rsl) + " ").getBytes());
                }
                file.write("\n".getBytes());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Matrix mat = new Matrix();
        mat.writeM();
    }
}
