package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value: ");
        int value = scanner.nextInt();
        Singleton singleton = Singleton.getInstance(value);
        System.out.println("Instance: " + singleton);

        System.out.print("Enter another value: ");
        int another_value = scanner.nextInt();
        Singleton another_singleton = Singleton.getInstance(another_value);
        System.out.println("Instance: " + another_singleton);
        //программа не создает новый обьект и выводит первый

    }
}
