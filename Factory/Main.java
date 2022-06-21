package com.company;

import java.util.Scanner;

public class Main {
    //static CoffeeFactory coffee_factory;
    public static void main(String[] args) {
        CoffeeFactory coffee_factory = new CappuccinoFactory();
        coffee_factory.render_coffee();

        coffee_factory = new LatteFactory();
        coffee_factory.render_coffee();
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a coffee:");
        System.out.println("1. CAPPUCCINO.");
        System.out.println("2. LATTE.");
        int type = scanner.nextInt();
        configure(type);
        runBusinessLogic();*/
    }

   /* static void configure(int type) {
        if (type == 1){
            coffee_factory = new CappuccinoFactory();
        } else {
            coffee_factory = new LatteFactory();
        }
    }

    static void runBusinessLogic() {
        coffee_factory.render_coffee();
    }*/
}
