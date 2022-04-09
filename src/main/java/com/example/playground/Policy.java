package com.example.playground;

import java.util.Set;

public class Policy {
    Set<Rule> rules;

    boolean complyWithAll(Value value) {
        for (Rule each : rules) {
            if (each.ng(value)) return false;
        }
        return true;
    }

    boolean complyWithSome(Value value) {
        for (Rule each: rules) {
            if (each.ok(value)) return true;
        }
        return false;
    }

    void addRule(Rule rule) {
        rules.add(rule);
    }
}
