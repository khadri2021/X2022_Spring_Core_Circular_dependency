package com.khadri.spring.core.constructor;

public class Y {
    private X x;
    Y(X x) {
        this.x = x;
    }

    public X getX() {
        return x;
    }
}
