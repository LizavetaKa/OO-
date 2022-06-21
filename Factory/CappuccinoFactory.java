package com.company;

public class CappuccinoFactory extends CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new Cappuccino();
    }
}
