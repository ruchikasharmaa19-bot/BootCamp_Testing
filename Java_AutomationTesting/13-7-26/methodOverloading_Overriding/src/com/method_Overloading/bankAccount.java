package com.method_Overloading;

public class bankAccount {
public void  TransferMoney(double amount) {
	System.out.println("Transferred money is"+amount);
}
public void TransferMoney(double amount, String accountNumber) 
{
	System.out.println("Amount"+amount+"Acccountnumber is"+accountNumber);
}
public void TransferMoney(double amount,String remarks,double accountNumber) {
	System.out.println(+amount+ remarks+accountNumber);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  bankAccount mt = new bankAccount();
		mt.TransferMoney(2999);
		mt.TransferMoney(2999,"1020");
		mt.TransferMoney(2999,"Savings",1020);
	}

}
