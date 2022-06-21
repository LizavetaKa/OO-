package com.company;

public class Lion extends Animal
{
public Lion()
{

}
    @Override
    protected void my_name() {
        System.out.println("I am lion.");
    }

    @Override
    protected void my_sound() {
        System.out.println("roar");
    }
}
