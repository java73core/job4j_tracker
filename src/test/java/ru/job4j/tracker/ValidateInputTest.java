package ru.job4j.tracker;

import org.junit.Test;
//import ru.job4j.list.tracker.*;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                   new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenMultiValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                   new String[] {"5", "2", "4"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(5));
        selected = input.askInt("Enter menu:");
        assertThat(selected, is(2));
        selected = input.askInt("Enter menu:");
        assertThat(selected, is(4));

    }

    @Test
    public void whenValidInputMinus() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"-1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(-1));
    }
}