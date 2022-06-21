package com.company;

import static java.lang.Math.round;
import static java.lang.Math.sqrt;

public class BaseDecorator implements SquareInterface{

    private final SquareInterface decorated;

    public BaseDecorator(SquareInterface decorated) {
        this.decorated = decorated;
    }

    public SquareInterface getDecorated()
    {
        return decorated;
    }

    @Override
    public double getSide() {
        return decorated.getSide();
    }

    @Override
    public double diagonal() {
        return round(sqrt(getSide() * getSide() + getSide() * getSide()) * 100);
    }

    public String toString() {
        return "" + decorated;
    }
}
