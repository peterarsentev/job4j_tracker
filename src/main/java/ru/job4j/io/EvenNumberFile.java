package ru.job4j.io;

import java.io.FileInputStream;
import java.util.Arrays;

public class EvenNumberFile {


    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("result.txt")) {
            in.readAllBytes() ;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
