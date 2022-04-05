package com.example.playground;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StateTransitions {
    Map<State, Set<State>> allowed;

    {
        allowed = new HashMap<>();

        allowed.put(State.UNDER_REVIEW, EnumSet.of(State.APPROVED, State.SENT_BACK));
        allowed.put(State.SENT_BACK, EnumSet.of(State.UNDER_REVIEW, State.CLOSED));
        allowed.put(State.APPROVED, EnumSet.of(State.IN_PROGRESS, State.CLOSED));
        allowed.put(State.IN_PROGRESS, EnumSet.of(State.SUSPENDED, State.CLOSED));
        allowed.put(State.SUSPENDED, EnumSet.of(State.IN_PROGRESS, State.CLOSED));
    }

    boolean canTransit(State from, State to) {
        Set<State> allowedStates = allowed.get(from);
        return allowedStates.contains(to);
    }
}
