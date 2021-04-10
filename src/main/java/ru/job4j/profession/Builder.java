package ru.job4j.profession;

import ru.job4j.profession.Engineer;

public class Builder extends Engineer {
    private String goodReviews;
    private String softSkills;

    Builder(){

    }
    Builder(String goodReviews, String softSkills, String name, String education, String birthday, String knowledge, String skill, String motivation){
        super(name, education, birthday, knowledge, skill, motivation);
        this.goodReviews = goodReviews;
        this.softSkills = softSkills;
    }
    public String getGoodReviews(){
        return this.goodReviews = goodReviews;
    }
    public String getSoftSkills(){
        return this.softSkills = softSkills;
    }
}
