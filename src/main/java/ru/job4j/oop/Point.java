package ru.job4j.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

        private int x;
        private int y;
        private int z;

    public Point(int first, int second) {
            this.x = first;
            this.y = second;
        }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

        public double distance(Point that) {
            return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
        }

        public double distance3d(Point that) {
            return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
        }

        public static void main(String[] args) {
            Point a = new Point(0, 0);
            Point b = new Point(0, 2);
            double dist = a.distance(b);
            System.out.println(dist);
            Point a3D = new Point(0, 0, 1);
            Point b3D = new Point(0, 2, 0);
            double dist3D = a3D.distance3d(b3D);
            System.out.println(dist3D);
        }
    }
