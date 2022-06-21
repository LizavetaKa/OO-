package com.company;

public class Cappuccino implements Coffee{

    public Cappuccino()
    {
        System.out.println("You chose a cappuccino.");
    }

    @Override
    public void grind_coffee() {
        System.out.println("Grind coffee for cappuccino.");
    }

    @Override
    public void make_coffee() {
        System.out.println("Make cappuccino.");
    }

    @Override
    public void pour_coffee() {
        System.out.println("Pour cappuccino.");
    }
}
