package com.test;

public class Factory<T extends SomeType> {

    public Interface<T> get(Config config) {
        switch (config.getSomeParam()) {
            case "a":
                return new SomeInterfaceImpl1<T>(config.getSomeOtherParam1());
            case "b":
                return new SomeInterfaceImpl2<T>(config.getSomeOtherParam2());
            default:
                return l -> l;
        }
    }
}
