package com.test;

import java.util.List;

class SomeInterfaceImpl1<T extends SomeType> implements Interface<T> {

    private final int n;

    public SomeInterfaceImpl1(int n) {
        this.n = n;
    }

    @Override
    public List<T> process(List<T> input) {
        return null;
    }
}
