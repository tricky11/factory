package com.test;

import java.util.List;

@FunctionalInterface
public interface Interface<T extends SomeType> {
    List<T> process(List<T> input);
}
