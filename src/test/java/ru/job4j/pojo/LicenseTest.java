package ru.job4j.pojo;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class LicenseTest {

    @Test
    public void checkCode() {
        License first = new License();
        first.setCode("audio");
        License second = new License();
        second.setCode("audio");
        assertThat(first, is(second));
    }

    @Test
    public void checkModel() {
        License first = new License();
        first.setModel("122333");
        License second = new License();
        second.setModel("122333");
        assertThat(first, is(second));
    }

    @Test
    public void checkOwner() {
        License first = new License();
        first.setOwner("Mike");
        License second = new License();
        second.setOwner("Mike");
        assertThat(first, is(second));
    }
}