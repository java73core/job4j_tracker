package ru.job4j.tracker;

import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.Assert.*;

public class ItemDescByNameTest {

        @Test
        public void itemDescend() {
            List<Item> items =  Arrays.asList(
                    new Item(5, "five"),
                    new Item(2, "two"),
                    new Item(4, "four"),
                    new Item(10, "ten"));
            List<Item> expected =  Arrays.asList(
                    new Item(2, "two"),
                    new Item(10, "ten"),
                    new Item(4, "four"),
                    new Item(5, "five")
                    );
            Collections.sort(items, new ItemDescByName());
            assertEquals(expected, items);
        }
    }
