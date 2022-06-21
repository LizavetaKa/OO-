package com.company;

public class Context
{
    private Strategy strategy;

    public Context() {}

    void setStrategy(Strategy strategy)
    {
        this.strategy = strategy;
    }

    void cookingStrategy()
    {
        strategy.cooking();
    }

    //public int executeStrategy(int a, int b)
    //{
        //return strategy.execute(a,b);
    //}
}
