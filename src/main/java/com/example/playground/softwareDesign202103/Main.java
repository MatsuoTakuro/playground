package com.example.playground.softwareDesign202103;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//    https://gihyo.jp/magazine/SD/archive/2021/202103
        type();
        range();
        skill();
        price();
    }

    static void type() {
        Category general = Category.valueOf("GENERAL");
        System.out.println(general);
        Category[] categories = Category.values();
        for (Category each: categories) {
            System.out.println(each);
        }
    }

    static void range() {
        DateRange base = new DateRange(LocalDate.now(), LocalDate.now().plusWeeks(1));
        System.out.println(base.contains(LocalDate.now().plusDays(1)));
        DateRange other = new DateRange(LocalDate.now().plusDays(2), LocalDate.now().plusWeeks(2));
        System.out.println(base.isOverlap(other));
    }

    static void skill() {
        SkillSet skillSet = SkillSet.of(Skill.Java, Skill.Go, Skill.SQL);
        SkillSet other = SkillSet.of(Skill.Go, Skill.Python);
        System.out.println(skillSet.hasMatch(other));
    }

    static void price() {
        Pair pair = Pair.of(Category.GENERAL, DayType.WEEKDAY);
        Amount amount = new PriceTable().price(pair);
        System.out.println(amount.value);
    }
}
