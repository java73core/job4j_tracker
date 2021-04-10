package ru.job4j.profession;

public class Diagnosis {
    private String analyzes;
    private String result;
    private String healing;

    Diagnosis(){

    }
    Diagnosis(String analyzes, String result, String healing){
        this.analyzes = analyzes;
        this.healing = healing;
        this.result = result;
    }
    public void setAnalyzes(String analyzes){
        this.analyzes = analyzes;
    }

}
