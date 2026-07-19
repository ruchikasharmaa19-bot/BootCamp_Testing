package com.cons;
import java.util.ArrayList;
public class Account {
private int Balance;
private int accountNumber;
private AccountType accountType;
//Creating ENUM
public enum AccountType {
	CHECKING,
	SAVINGS
}
//PARAMETARISED CONSTRUCTOR
public Account(int Balance, int accountNumber, AccountType accountType) {
	this.Balance=  Balance;
	this.accountNumber = accountNumber;
	this.accountType = accountType;
}
public int getBalance() {
	return Balance;
}
public void deposit(int amount) {
	Balance= Balance+amount;
}
public void withdraw(int amount) {
	if (accountType== AccountType.SAVINGS && amount >Balance) {
		throw new ArithmeticException("Cannot overdraw from a savings account!");
	}
	else Balance= Balance- amount;
}

public String toString() {
	return "Account with number:"
			+accountNumber+ "is of type:"
					+accountType+ "and has a balance:"+Balance;
}
//DEFAULT CONSTRUCTOR
public Account() {
	Balance = 0;
	accountNumber=2364289;
	accountType= AccountType.CHECKING;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account[] accountArray= new Account[3];
		//array
		accountArray[0] = new Account(2000,2647723,AccountType.CHECKING);
		accountArray[1] = new Account(3000,4973094,AccountType.CHECKING);
		accountArray[2] = new Account(4000,8932842,AccountType.SAVINGS);
		//arrayList
		ArrayList<Account> accountList = new ArrayList<>();
		accountList.add(new Account(10000,201,AccountType.CHECKING));
		accountList.add(new Account(20000,202,AccountType.SAVINGS));
		accountList.add(new Account(30000,203,AccountType.CHECKING));
		
// enhanced for loop for printing account
		//for array
		System.out.println("Accounts in the array:");
		for (Account account : accountArray) {
		System.out.println(account);
		}
		//for arrayList
		System.out.println("Accounts in the ArrayList:");
		for (Account account:accountList) {
			System.out.println(account);
		}
		
		
	}

}
