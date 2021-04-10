package ru.job4j.profession;

public class Programmer extends Engineer {
    private String hardSkills;
    private String jobOffers;

   public Programmer() {

    }

    public Programmer(String hardSkills, String jobOffers) {
        super();
        this.hardSkills = hardSkills;
        this.jobOffers = jobOffers;
    }

    public String getHardSkills() {
        return this.hardSkills;
    }

    public String getJobOffers() {
        return this.jobOffers;
    }
}
