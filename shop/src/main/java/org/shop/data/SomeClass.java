package org.shop.data;

import org.shop.annotations.InjectRandomInt;

public class SomeClass {
    @InjectRandomInt(minValue = 5, maxValue = 10)
    private int randomInt;

    @Override
    public String toString() {
        return "SomeClass {randomInt=" + randomInt + '}';
    }
}
