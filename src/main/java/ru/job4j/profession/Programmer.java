package ru.job4j.profession;

public class Programmer extends Engineer {
    private String hardSkills;
    private String jobOffers;

    Programmer(){

    }
    Programmer(String hardSkills, String jobOffers, String name, String education, String birthday, String knowledge, String skill, String motivation){
        super(name, education, birthday, knowledge, skill, motivation);
        this.hardSkills = hardSkills;
        this.jobOffers = jobOffers;
    }
    public String getHardSkills(){
        return this.hardSkills;
    }
    public String getJobOffers(){
        return this.jobOffers;
    }
}
