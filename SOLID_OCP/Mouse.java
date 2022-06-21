package com.company;

public class Mouse extends Animal{
    public Mouse()
    {

    }

    @Override
    protected void my_name() {
        System.out.println("I am mouse.");
    }

    @Override
    protected void my_sound() {
        System.out.println("squeak");
    }
}
