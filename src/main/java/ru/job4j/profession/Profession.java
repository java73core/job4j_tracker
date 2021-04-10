package ru.job4j.profession;

public class Profession {
    private String name, surname;
    private String education;
    private String birthday;

    public Profession() {

    }

    public String getName(){
        return this.name;
    }
    public String getEdu(){
        return this.education;
    }
    public String getBirth(){
        return this.birthday;
    }
    Profession(String name, String education, String birthday){
    this.name = name;
    this.education = education;
    this.birthday = birthday;
    }

}
