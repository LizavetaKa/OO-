package com.company;

public abstract class Cooking
{
    public void AllProcess()
    {
        BuyProducts();
        Preparation();
        Boiling();
        ReadyDish();
    }
    protected abstract void BuyProducts();
    protected abstract void  Preparation();
    protected abstract void  Boiling();
    protected void ReadyDish()
    {
        System.out.println("Put the finish dish on the plate.");
    }
}
