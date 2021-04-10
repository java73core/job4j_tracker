package ru.job4j.profession;

import ru.job4j.profession.Profession;

public class Doctor extends Profession {
    private String experience;
    private String license;
    private char sex;

    public Doctor() {
        super();
    }

    public String getExperience(){
        return this.experience;
    }
    public  String getLicense(){
        return this.license;
    }
    public char getSex(){
        return this.sex;
    }
    Doctor(String name, String education, String birthday, String experience, String license, char sex) {
        super(name, education, birthday);
        this.experience = experience;
        this.license = license;
        this.sex = sex;
    }

     public Diagnosis heal(Pacient pacient) {
        Diagnosis diag = new Diagnosis();
        diag.setAnalyzes(pacient.getDiagnose());
        return diag;
     }
}
