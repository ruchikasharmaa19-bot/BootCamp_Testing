package com.inheritanceTest;

// Parent Class
class Bank {

    String bankName = "HDFC Bank";

    public void displayBankName() {
        System.out.println("Bank Name: " + bankName);
    }
}

// Child Class
class SavingsAccount extends Bank {

    double balance = 10000;

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited Amount: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn Amount: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Main Class
public class Banking_System {

    public static void main(String[] args) {

        SavingsAccount account = new SavingsAccount();

        account.displayBankName();
        account.displayBalance();

        account.deposit(5000);
        account.displayBalance();

        account.withdraw(3000);
        account.displayBalance();
    }
}
