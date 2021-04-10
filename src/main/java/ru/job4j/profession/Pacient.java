package ru.job4j.profession;

public class Pacient {
    private String name;
    private String surname;
    private int years;
    private String diagnose;

    public Pacient() {

    }

    public Pacient(String name, String surname, int years) {
        this.name = name;
        this.surname = surname;
        this.years = years;
    }

    public String getDiagnose() {
       return this.diagnose;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }
}
