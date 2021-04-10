package ru.job4j.profession;

import ru.job4j.profession.Doctor;

public class Dentist extends Doctor {
    private String qualityOfWork;
    private String frequentCustomer;

    public Dentist() {
    }

    public Dentist(String frequentCustomer, String qualityOfWork) {
       super();
        this.frequentCustomer = frequentCustomer;
        this.qualityOfWork = qualityOfWork;
    }

    public String getQualityOfWork() {
        return  this.qualityOfWork;
    }

    public String getFrequentCustomer() {
        return this.frequentCustomer;
    }
}
