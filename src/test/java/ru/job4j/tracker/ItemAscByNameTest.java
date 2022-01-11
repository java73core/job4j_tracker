package ru.job4j.tracker;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemAscByNameTest {

    @Test
    public void ItemAscByName() {
              List<Item> items = List.of(
                      new Item(5, "five"),
                      new Item(2, "two"),
                      new Item(4, "four"),
                      new Item(10, "ten"));
              List<Item> expected = List.of(
                      new Item(5, "five"),
                      new Item(4, "four"),
                      new Item(10, "ten"),
                      new Item(2, "two")
                      );
              List<Item> result = new ItemAscByName().sorted(items);
              assertThat(expected, is(result));
    }
}