package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        map.put("parsentev@mail.ru", "Petr Arsentev");
        map.put("parsentev@gmail.com", "Petr Arsentev");
        for (String key: map.keySet()) {
            System.out.println(key);
        }
    }
}
