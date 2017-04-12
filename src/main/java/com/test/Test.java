package com.test;

import com.google.common.collect.ImmutableList;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        // While using juice, it would be nice to provide a binding for this factory.
        Factory<SomeType> factory = new Factory<>();

        // In reality these would be fetched from database.
        Config config1 = new Config("a", 1, "notrequired");
        Config config2 = new Config("b", -1, "lalala");
        ImmutableList<SomeType> list1 = ImmutableList.of();
        ImmutableList<SomeType> list2 = ImmutableList.of();

        // Actual client usage.
        List<SomeType> halfProcessedList = factory.get(config1).process(list1);
        List<SomeType> fullyProcessedList = factory.get(config2).process(halfProcessedList);

        System.out.println(fullyProcessedList);
    }
}
