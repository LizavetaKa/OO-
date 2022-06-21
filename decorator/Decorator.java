package com.company;

public class Decorator extends BaseDecorator{

    public Decorator(SquareInterface decorated) {
        super(decorated);
    }


    public double getSide()
    {
        return super.getSide() * 2;
    }


}
