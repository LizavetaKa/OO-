package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the side of square: ");
        Scanner scanner = new Scanner(System.in);
        int side = scanner.nextInt();

        Square square = new Square(side);
        System.out.println("Diagonal of this square: " + square.diagonal() / 100 + ".");
        System.out.println("Square: " + square.Square() + ".");

        Decorator decorator = new Decorator(square);
        System.out.println("Deco square: [" + decorator + " * 2]");
        System.out.println("Width of deco: " + decorator.getSide()+ ", height of deco: " + decorator.getSide() + ".");
        System.out.println("Diagonal of this square: " + decorator.diagonal() / 100 + ".");
        System.out.println("Square: " + decorator.Square() + ".");
    }
}
