package com.company;

public class FriedPotatoes implements IPotato {
   public void Form()
    {
        System.out.println("IPotato - fry.");
    }
    void ClientMethod(IPotato potatoes) {
        potatoes.Form();
        }
}
