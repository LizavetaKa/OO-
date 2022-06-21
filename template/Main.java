package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a dish to cook:");
        System.out.println("1. Fried potatoes.");
        System.out.println("2. Pasta.");
        int op = scanner.nextInt();
        switch(op)
        {
            case 1 :
                FriedPotatoes fried_potatoes = new FriedPotatoes();
                fried_potatoes.AllProcess();
                break;
            case 2 :
                Pasta pasta = new Pasta();
                pasta.AllProcess();
                break;
        }
    }
}


