package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product: ");
        String product = scanner.next();
        Fridge fridge = new Fridge();
        Cut cut = new Cut();
        Kitchen kitchen = new Kitchen();
        AllProcess all_process = new AllProcess(fridge, cut, kitchen);
        all_process.CutProduct(product);
        /*System.out.print("Enter amount money: ");
        int money = scanner.nextInt();
	    ClientController client_controller = new ClientController();
        BankController bank_controller = new BankController();
        TransferController transfer_controller = new TransferController(bank_controller, client_controller);
        transfer_controller.Transfer(money);*/
    }
}
