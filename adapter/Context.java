package com.company;

public class Context {
    private IPotato potatoes;

    public Context(IPotato potatoes)
    {
        this.potatoes = potatoes;
    }

public void Process()
{
    potatoes.Form();
}
}
