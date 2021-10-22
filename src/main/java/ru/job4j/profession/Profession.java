package ru.job4j.profession;

public class Profession {
    private String name, surname;
    private String education;
    private String birthday;

    public Profession() {
    }

    public Profession(String name, String education, String birthday) {
        this.name = name;
        this.education = education;
        this.birthday = birthday;
    }

    public Profession(String name, String surname, String education, String birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.education = education;
    }

    public String getName() {
        return this.name;
    }

    public String getEdu() {
        return this.education;
    }

    public String getBirth() {
        return this.birthday;
    }

}
