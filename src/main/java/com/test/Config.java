package com.test;

public class Config {
    private final String someParam;
    private final int someOtherParam1;
    private final String someOtherParam2;

    public Config(String someParam, int someOtherParam1, String someOtherParam2) {
        this.someParam = someParam;
        this.someOtherParam1 = someOtherParam1;
        this.someOtherParam2 = someOtherParam2;
    }

    public String getSomeParam() {
        return someParam;
    }

    public int getSomeOtherParam1() {
        return someOtherParam1;
    }

    public String getSomeOtherParam2() {
        return someOtherParam2;
    }
}
