package ru.job4j.finaltask;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AnalizeTest {

    @Test
    public void testInitNoDiff() {
        List<User> old = List.of(new User(1,"marina"), new User(2,"kolya"),
        new User(3,"olya"), new User(4,"igor"));
        List<User> fresh = List.of(new User(1,"marina"), new User(2,"kolya"),
                new User(3,"olya"), new User(4,"igor"));
        int[] rsl = new Analize().diff(old, fresh).results();
        assertArrayEquals(rsl, new int[]{0,0,0});
    }

    @Test
    public void testOneChanged() {
        List<User> old = List.of(new User(1,"marina"), new User(2,"kolya"),
                new User(3,"olya"), new User(4,"igor"));
        List<User> fresh = List.of(new User(1,"marina"), new User(2,"kolya"),
                new User(3,"olya"), new User(4,"vinceslav"));
        int[] rsl = new Analize().diff(old, fresh).results();
        assertArrayEquals(rsl, new int[]{0,1,0});
    }

    @Test
    public void testDeleted() {
        List<User> old = List.of(new User(1,"marina"), new User(2,"kolya"),
                new User(3,"olya"), new User(4,"igor"));
        List<User> fresh = List.of(new User(1,"marina"), new User(2,"kolya"),
                new User(3,"olya"));
        int[] rsl = new Analize().diff(old, fresh).results();
        assertArrayEquals(rsl, new int[]{0,0,1});
    }

    @Test
    public void testOneAdded() {
        List<User> old = List.of(new User(1,"marina"), new User(2,"kolya"),
                new User(3,"olya"), new User(4,"igor"));
        List<User> fresh = List.of(new User(1,"marina"), new User(2,"kolya"),
                new User(3,"olya"), new User(4,"igor"),new User(5,"igor"));
        int[] rsl = new Analize().diff(old, fresh).results();
        assertArrayEquals(rsl, new int[]{1,0,0});
    }
}