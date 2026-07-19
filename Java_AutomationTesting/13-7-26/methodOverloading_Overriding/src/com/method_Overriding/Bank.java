package com.method_Overriding;

public class Bank {
	public void calInterest() {
		System.out.println("calculation of interest");
	}
class SBI extends Bank {
	public void calInterest() {
		System.out.println("SBI interest: 6.5%");	
	}
}
class HDFC extends Bank {
	public void calInterest() {
		System.out.println("HDFC interest: 7%");
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank sbi = new Bank(); 
sbi.calInterest();
	}


}
