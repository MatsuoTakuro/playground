package com.example.playground.softwareDesign202103;

import java.util.HashSet;
import java.util.Set;

public class SkillSet {
    Set<Skill> skills = new HashSet<>();

    public  SkillSet() {}

    private SkillSet(Set<Skill> skills) {
        this.skills = skills;
    }

    boolean isEmpty() {
        return skills.isEmpty();
    }

    boolean contains(Skill skill) {
        return skills.contains(skill);
    }

    boolean hasSkill(Skill skill) {
        return skills.contains(skill);
    }

    boolean hasMatch(SkillSet other) {
        Set<Skill> result = new HashSet<>(skills);
        result.retainAll(other.skills);
        return result.size() > 0;
    }

    static SkillSet of(Skill... skills) {
        return new SkillSet(Set.of(skills));
    }
}
