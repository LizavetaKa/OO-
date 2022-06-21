package com.company;

public class Latte implements Coffee{

    public Latte()
    {
        System.out.println("You chose a latte.");
    }

    @Override
    public void grind_coffee() {
        System.out.println("Grind coffee for latte.");
    }

    @Override
    public void make_coffee() {
        System.out.println("Make latte.");
    }

    @Override
    public void pour_coffee() {
        System.out.println("Pour latte.");
    }
}
