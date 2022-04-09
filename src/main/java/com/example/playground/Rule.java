package com.example.playground;

public interface Rule {
    boolean ok(Value value);

    default boolean ng(Value value) {
        return !ok(value);
    }
}
