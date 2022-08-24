package com.timbuchalka.aula02.eduardo;

public class Main {
    // Create a new class for a bank account
    // Create fields for the account number, balance, customer name, email and phone number.
    //
    // Create getters and setters for each field
    // Create two additional methods
    // 1. To allow the customer to deposit funds (this should increment the balance field).
    // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
    // but not allow the withdrawal to complete if their are insufficient funds.
    // You will want to create various code in the Main class (the one created by IntelliJ) to
    // confirm your code is working.
    // Add some System.out.println's in the two methods above as well.
    public static void main(String[] args) {
        Account Conta = new Account();
        Account Conta1 = new Account(123,123,213.33,"Nome","Email");

        Conta1.withdraw(100);

        Conta1.depositFunds(100);
        Conta1.withdraw(50);
        Conta1.depositFunds(1);
    }
}
