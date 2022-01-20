package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> predicateName = (p) -> p.getName().contains(key);
        Predicate<Person> predicateSurName = (p) -> p.getSurname().contains(key);
        Predicate<Person> predicatePhone = (p) -> p.getPhone().contains(key);
        Predicate<Person> predicateAddress = (p) -> p.getAddress().contains(key);
        Predicate<Person> combine = predicateName
                                .or(predicateSurName)
                                .or(predicatePhone)
                                .or(predicateAddress);
        ArrayList<Person> result = new ArrayList<>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}