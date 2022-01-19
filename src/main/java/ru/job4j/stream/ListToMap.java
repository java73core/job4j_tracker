package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

    public static Map<String, Student> convert(List<Student> list) {
        Map<String, Student> collect = list.stream()
                .collect(Collectors
                        .toMap(Student::getSurname, student ->
                                student, (o1, o2) -> {
                            return o1;
                        }));
        return collect;
    }
}