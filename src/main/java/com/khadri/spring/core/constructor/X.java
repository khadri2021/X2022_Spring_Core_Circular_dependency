package com.khadri.spring.core.constructor;

public class X {
    private Y y;
    X(Y y) {
        this.y = y;
    }

    public Y getY() {
        return y;
    }
}
