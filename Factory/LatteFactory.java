package com.company;

public class LatteFactory extends CoffeeFactory{

    @Override
    public Coffee createCoffee() {
        return new Latte();
    }
}
