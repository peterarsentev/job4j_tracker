package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ValidateInputTest {

    @Test
    public void whenValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one"}
        );
            ValidateInput input = new ValidateInput(out, in);
            int selected = input.askInt("Enter menu:");
            assertThat(selected, is(1));
    }

    @Test
    public void whenValidOutput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        input.askInt("Enter menu:");
        assertThat(out.toString(), is("Please enter validate data again." + System.lineSeparator()));
    }
}