/*package com.company;

public class TransferController {
    private BankController bank;
    private ClientController client;

    public TransferController(BankController bank_controller, ClientController client_controller)
    {
        bank = bank_controller;
        client = client_controller;
    }

    public void Transfer(int money)
    {
        client.Open();
        bank.Open();

        client.Transfer(money);
        bank.Transfer(money);

        client.Close();
        bank.Close();
    }
}*/
