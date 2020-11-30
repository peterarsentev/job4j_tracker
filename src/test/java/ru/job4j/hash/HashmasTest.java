package ru.job4j.hash;

import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class HashmasTest {
    @Test
    public void test1() {
        Hashmas<String, String> hash = new Hashmas<>(5);
        hash.insert("1", "one");
        hash.insert("2", "two");
        hash.insert("3", "three");
        hash.insert("3", "three");
        System.out.println(hash.toString());
    }

    @Test
    public void del() {
        Hashmas<String, String> hash = new Hashmas<>(5);
        hash.insert("1", "one");
        hash.insert("2", "two");
        hash.delete("1");
        System.out.println(hash.toString());
    }

    @Test
    public void iter() {
        Hashmas<String, String> hash = new Hashmas<>(5);
        hash.insert("1", "one");
        hash.insert("2", "two");
        for (Hashmas.Entry s : hash) {
            System.out.println(s);
        }
    }
}