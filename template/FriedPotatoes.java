package com.company;

public class FriedPotatoes extends Cooking{
    @Override
    protected void BuyProducts()
    {
        System.out.println("Buy potatoes.");
    }

    @Override
    protected void Preparation()
    {
        System.out.println("Take out and peel potatoes.");
    }

    @Override
    protected void Boiling()
    {
        System.out.println("Boil potatoes.");
    }
}
