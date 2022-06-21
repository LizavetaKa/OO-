package com.company;

public class Adapter implements IPotato {

    private IMashPotato potatoes;

    public Adapter(IMashPotato potatoes) {
        this.potatoes = potatoes;
    }
    @Override
    public void Form() {
        potatoes.SendForm();
    }
}
