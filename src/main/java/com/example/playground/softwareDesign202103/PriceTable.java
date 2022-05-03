package com.example.playground.softwareDesign202103;

import java.util.Map;
import java.util.Objects;

import static com.example.playground.softwareDesign202103.Category.CHILD;
import static com.example.playground.softwareDesign202103.Category.GENERAL;
import static com.example.playground.softwareDesign202103.DayType.HOLIDAY;
import static com.example.playground.softwareDesign202103.DayType.WEEKDAY;

public class PriceTable {
    Map<Pair,Integer> prices;

    { prices = Map.ofEntries(
            Map.entry(Pair.of(GENERAL, HOLIDAY), 1500),
            Map.entry(Pair.of(GENERAL, WEEKDAY), 1000),
            Map.entry(Pair.of(CHILD,   WEEKDAY), 400),
            Map.entry(Pair.of(CHILD,   HOLIDAY), 600));
    }

    Amount price(Pair pair) {
//        TODO: Cannot invoke "java.lang.Integer.intValue()" because the return value of "java.util.Map.get(Object)" is null
//        return new Amount(prices.get(pair));
        return new Amount(prices.getOrDefault(pair, 1000));
    }
}
