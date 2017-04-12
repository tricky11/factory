package com.test;

import java.util.List;

class SomeInterfaceImpl2<T extends SomeType> implements Interface<T> {

    private final String s;

    SomeInterfaceImpl2(String s) {
        this.s = s;
    }

    @Override
    public List<T> process(List<T> input) {
        return null;
    }
}
