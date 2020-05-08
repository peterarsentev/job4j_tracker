package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class DummyDicTest {

    @Test
    public void when123() {
        DummyDic word = new DummyDic();
        String text = "123";
        String testOut = word.endToRus(text);
        String expect = "Неизвестное слово. " + text;
        assertThat(testOut, is(expect));
    }
    @Test
    public void whenNull() {
        DummyDic word = new DummyDic();
        String text = null;
        String testOut = word.endToRus(text);
        String expect = "Неизвестное слово. " + text;
        assertThat(testOut, is(expect));
    }

    @Test
    public void whenFewWords() {
        DummyDic word = new DummyDic();
        String text = " New word";
        String testOut = word.endToRus(text);
        String expect = "Неизвестное слово. " + text;
        assertThat(testOut, is(expect));
    }
}