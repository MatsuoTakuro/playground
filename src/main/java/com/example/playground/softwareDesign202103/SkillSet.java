package com.example.playground.softwareDesign202103;

import java.util.HashSet;
import java.util.Set;

public class SkillSet {
    Set<Skill> set;

    private SkillSet(Set<Skill> set) {
        this.set = set;
    }

    boolean hasMatch(SkillSet other) {
        Set<Skill> result = new HashSet<>(set);
        result.retainAll(other.set);
        return result.size() > 0;
    }

    static SkillSet of(Skill... skills) {
        return new SkillSet(Set.of(skills));
    }
}
