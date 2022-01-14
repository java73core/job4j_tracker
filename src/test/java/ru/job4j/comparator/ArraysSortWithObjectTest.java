package ru.job4j.comparator;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.profession.comparator.ArraysSortWithObject;

public class ArraysSortWithObjectTest {

    @Test
    public void test() {
        String[] input = {"a", "b", "c"};
        String[] result = ArraysSortWithObject.sort(input);
        String[] expect = {"c", "b", "a"};
        Assert.assertArrayEquals(expect, result);
    }

}