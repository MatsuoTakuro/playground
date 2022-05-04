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
        lines();
        schedule();
        pricingCategory();
    }

    static void type() {
        System.out.println("\n" + new Object(){}.getClass().getEnclosingMethod().getName());

        Category general = Category.valueOf("GENERAL");
        System.out.println(general);
        Category[] categories = Category.values();
        for (Category each: categories) {
            System.out.println(each);
        }
    }

    static void range() {
        System.out.println("\n" + new Object(){}.getClass().getEnclosingMethod().getName());

        DateRange base = new DateRange(LocalDate.now(), LocalDate.now().plusWeeks(1));
        System.out.println(base.contains(LocalDate.now().plusDays(1)));
        DateRange other = new DateRange(LocalDate.now().plusDays(2), LocalDate.now().plusWeeks(2));
        System.out.println(base.isOverlap(other));
    }

    static void skill() {
        System.out.println("\n" + new Object(){}.getClass().getEnclosingMethod().getName());

        SkillSet skillSet = SkillSet.of(Skill.Java, Skill.Go, Skill.SQL);
        SkillSet other = SkillSet.of(Skill.Go, Skill.Python);
        System.out.println(skillSet.hasMatch(other));
        System.out.println(skillSet.contains(Skill.Go));

        SkillSet skillSet2 = new SkillSet();
        System.out.println(skillSet2.isEmpty());
    }

    static void price() {
        System.out.println("\n" + new Object(){}.getClass().getEnclosingMethod().getName());

        Pair pair = Pair.of(Category.GENERAL, DayType.WEEKDAY);
        Amount amount = new PriceTable().price(pair);
        System.out.println(amount.value);
    }

    static void lines() {
        System.out.println("\n" + new Object(){}.getClass().getEnclosingMethod().getName());

        List<String> initialized = List.of("1st", "2nd");
        MultiLineText lines = new MultiLineText(initialized);
        List<String> add = List.of("3rd", "4th");
        List<String> added =  lines.withLines(add);
        System.out.println(added);
    }

    static void schedule() {
        System.out.println("\n" + new Object(){}.getClass().getEnclosingMethod().getName());

        SortedSet<Workday> workdays = new TreeSet<Workday>();
        Workday today = new Workday(LocalDate.now());
        workdays.add(today);
        Schedule schedule = new Schedule(workdays);
        Workday tomorrow = new Workday(LocalDate.now().plusDays(1));
        Workday dayAfterTomorrow = new Workday(LocalDate.now().plusDays(2));
        Schedule schedule2 =  schedule.add(tomorrow);
        Schedule schedule3 =  schedule2.add(dayAfterTomorrow);
        schedule3.show();
        Workdays specifiedWorkdays = new Workdays(schedule3.schedules(tomorrow));
        specifiedWorkdays.show();
    }

    static void pricingCategory() {
        System.out.println("\n" + new Object(){}.getClass().getEnclosingMethod().getName());

        PricingCategory category = null;
        try {
            category = PricingCategory.of(LocalDate.now());
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        System.out.println(category.price());
    }
}
