package ru.job4j.tracker;

import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.Assert.*;

public class ItemAscByNameTest {

        @Test
        public void itemAsced() {
              List<Item> items =  Arrays.asList(
                      new Item(5, "five"),
                      new Item(2, "two"),
                      new Item(4, "four"),
                      new Item(10, "ten"));
              List<Item> expected = Arrays.asList(
                      new Item(5, "five"),
                      new Item(4, "four"),
                      new Item(10, "ten"),
                      new Item(2, "two")
                      );
               Collections.sort(items, new ItemAscByName());
               assertEquals(expected, items);
        }
}