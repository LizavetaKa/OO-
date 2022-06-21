package com.company;

public abstract class CoffeeFactory {
    public abstract Coffee createCoffee();
    public void render_coffee()
    {
        Coffee coffee = createCoffee();
        coffee.grind_coffee();
        coffee.make_coffee();
        coffee.pour_coffee();
    }
}
