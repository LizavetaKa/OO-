package com.company;

public class Pasta extends Cooking{
    @Override
    protected void BuyProducts() {
        System.out.println("Buy macaroni.");
    }

    @Override
    protected void Preparation() {
        System.out.println("Take out macaroni.");
    }

    @Override
    protected void Boiling() {
        System.out.println("Boil macaroni.");
    }
}
