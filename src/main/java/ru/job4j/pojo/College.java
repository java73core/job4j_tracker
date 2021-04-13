package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivan");
        student.setSurname("Sidorov");
        student.setGroupe("EconomFack");
        student.setDate(2010);
        System.out.println("name: " + student.getName() + System.lineSeparator() + "surname: " + student.getSurname());
        System.out.println("Groupe: " + student.getGroupe() + System.lineSeparator() + "data: " + student.getDate());
    }
}
