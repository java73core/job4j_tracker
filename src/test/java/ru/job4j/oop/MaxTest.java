package ru.job4j.oop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax3() {
        int result = Max.max(Max.max(1, 2), 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax8() {
        int result = Max.max(Max.max(6, 1), 8);
        assertThat(result, is(8));
    }

    @Test
    public void whenMax0() {
        int result = Max.max(Max.max(-7, 0), -4);
        assertThat(result, is(0));
    }

    @Test
    public void whenMax4() {
        int result = Max.max(Max.max(1, 2), Max.max(3, 4));
        assertThat(result, is(4));
    }

    @Test
    public void whenMax1() {
        int result = Max.max(Max.max(0, -2), Max.max(1, -4));
        assertThat(result, is(1));
    }
}