package com.Azure;
import java.util.Scanner;
public class CheckBankAccountBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner Bal = new Scanner(System.in);
double balance = 1000;
System.out.println("WELCOME TO HDFC BANK");
System.out.println("Enter the digit between 1-3");
System.out.println("1.Check Balance");
System.out.println("2.Deposit Money");
System.out.println("3.Withdraw Money");

int digit = Bal.nextInt();
if (digit == 1) {
	System.out.printf("Your current balance is:%.2f",balance);
}
if (digit==2) {
	System.out.printf("Enter the amount to deposit:");
double Deposit= Bal.nextDouble();
if (Deposit<0)
	System.out.println("Please enter a valid Amount!");
else {
balance = balance + Deposit;
System.out.printf("New Balance is:%.2f",balance);
}
}
if (digit==3) {
	System.out.println("Enter the withdraw amount:");
double Withdraw= Bal.nextDouble(); 

if (Withdraw>balance)
{
	System.out.println("Amount Exceeded"); 
	
}

else if (Withdraw <0) {
	System.out.println("Please enter valid number!");
}
else {
	balance = balance- Withdraw;
System.out.println("Amount withdrawn Succesfully!");
System.out.printf("Remaining Amount :%.2f",balance);
}
}
if (digit!=1 && digit!=2 &&digit!=3)
	System.out.println("INVALID INPUT!");
Bal.close();

	}
}
