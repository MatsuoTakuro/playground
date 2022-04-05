package com.example.playground.fee;

import com.example.playground.Money;

public interface Fee {
    Money money();
    String label();
}
