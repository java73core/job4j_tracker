package ru.job4j.profession;

import ru.job4j.profession.Profession;

public class Engineer extends Profession {
    private String knowledge;
    private String skill;
    private String motivation;

    public Engineer(String name, String education, String birthday,
                    String knowledge, String skill, String motivation) {
        super(name, education, birthday);
        this.knowledge = knowledge;
        this.motivation = motivation;
        this.skill = skill;
    }

    public Engineer() {
    }

    public String getKnowledge() {
        return this.knowledge;
    }

    public String getSkill() {
        return this.skill;
    }

    public String getMotivation() {
        return this.motivation;
    }
}
