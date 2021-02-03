package ru.job4j.tracker;

import java.util.Scanner;

public class Koren {

    static int num() {
        Scanner sc = new Scanner(System.in);
        String[] s1 = sc.nextLine().split(" ");
        int a = Integer.parseInt(s1[0]);
        int b = Integer.parseInt(s1[1]);
        String[] s2 = sc.nextLine().split(" ");
        int c = Integer.parseInt(s2[0]);
        int d = Integer.parseInt(s2[1]);

        double r = (double) (a / b);
        double l = (double) (c / d);
        int rsl = 0;
        double s = Math.ceil(r * r);
        double f = l * l;
        for (; s < f; f--) {
            double f1 = Math.sqrt(f);
            if (f1 <= l && f1 >= r) {
                rsl++;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(Koren.num());
    }
}