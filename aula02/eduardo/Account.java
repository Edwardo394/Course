package com.timbuchalka.aula02.eduardo;

public class Account {
    private int accountNumber, accountPhone;
    private double accountBalance;
    private String accountName, accountEmail;

    public Account(){
        this(123, 123, 123.45, "DefaultName", "DefaultEmail");
    }

    public Account(int accountNumber, int accountPhone, double accountBalance, String accountName, String accountEmail){
        System.out.println("Account with constructors called!");
        this.accountNumber = accountNumber;
        this.accountPhone = accountPhone;
        this.accountBalance = accountBalance;
        this.accountName = accountName;
        this.accountEmail = accountEmail;

    }


    // Create two additional methods
    // 1. To allow the customer to deposit funds (this should increment the balance field).
    // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
    // but not allow the withdrawal to complete if their are insufficient funds.
    // You will want to create various code in the Main class (the one created by IntelliJ) to
    // confirm your code is working.
    // Add some System.out.println's in the two methods above as well.
    public void depositFunds(double depositValue){
        if(depositValue>=0){
            this.accountBalance += depositValue;
            System.out.println("\n" + depositValue +" deposited!\nThe actual balance is "+this.accountBalance);
        }else{
            System.out.println("\nValue must be a positive number!"+ "\nYou tried to deposit " + depositValue);
        }
    }
    public void withdraw(double withdrawValue){
        if(this.accountBalance>=0 && withdrawValue<=this.accountBalance){
            this.accountBalance -= withdrawValue;
            System.out.println("\n" + withdrawValue +" withdrawed! "+ "\nThe new balance is "+ accountBalance);
        }else{
            System.out.println("\nAccount with less money than the withdraw you tried\nThe actual balance is "+this.accountBalance + "\nYou tried to withdraw " + withdrawValue);
        }
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setAccountPhoneNumber(int accountPhone){
        this.accountPhone = accountPhone;
    }
    public int getAccountPhone(){
        return accountPhone;
    }
    public void setAccountBalance(double accountBalance){
        this.accountBalance = accountBalance;
    }
    public double getAccountBalance(){
        return accountBalance;
    }
    public void setAccountName(String accountName){
        this.accountName = accountName;
    }
    public String getAccountName(){
        return accountName;
    }
    public void setAccountEmail(String accountEmail){
        this.accountEmail = accountEmail;
    }
    public String getAccountEmail(){
        return accountEmail;
    }
}
