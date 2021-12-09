package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for (int[] row: list) {
            for (int cell : row) {
                rsl.addAll(Arrays.asList(cell));
            }
        }
        return rsl;
    }
}