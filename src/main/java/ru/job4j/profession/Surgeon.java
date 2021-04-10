package ru.job4j.profession;

public class Surgeon extends Doctor {
    private String clinicName;
    private String awards;

    public Surgeon() {
    }

    public Surgeon(String clinicName, String awards, String name, String education, String birthday, String experience, String license, char sex) {
        super(name, education, birthday, experience, license, sex);
        this.awards = awards;
        this.clinicName = clinicName;
    }

    public String getClinicName() {
       return this.clinicName;
    }

    public String getAwards() {
       return this.awards;
    }
}
