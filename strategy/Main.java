package com.company;
//можно написать пример с транспортом
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Context context = new Context();
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter num a: ");
        //int a = scanner.nextInt();
        //System.out.print("Enter num b: ");
        //int b = scanner.nextInt();
        //System.out.println("Enter operation: ");
        //System.out.println("1. Add.");
        //System.out.println("2. Subtract.");
        //System.out.println("3. Multiply.");
        //System.out.println("4. Exit.");
        System.out.println("Choose how you want to cook potatoes: ");
        System.out.println("1. Fry.");
        System.out.println("2. Mash.");
        System.out.println("3. Boil.");
        int op = scanner.nextInt();
        //int result;
            switch (op) {
                case 1:
                    //context.setStrategy(new ConcreteStrategyAdd());
                    //result = context.executeStrategy(a, b);
                    //System.out.print(result);
                    context.setStrategy(new FriedPotatoes());
                    context.cookingStrategy();
                    break;
                case 2:
                    //context.setStrategy(new ConcreteStrategySubtract());
                    //result = context.executeStrategy(a, b);
                    //System.out.print(result);
                    context.setStrategy(new MashedPotatoes());
                    context.cookingStrategy();
                    break;
                case 3:
                    //context.setStrategy(new ConcreteStrategyMultiply());
                    //result = context.executeStrategy(a, b);
                    //System.out.print(result);
                    context.setStrategy(new BoiledPotatoes());
                    context.cookingStrategy();
                    break;
        }
    }
}
