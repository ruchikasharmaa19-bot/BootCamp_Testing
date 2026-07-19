package com.Azure;
import java.util.Scanner;
public class Voting_Eligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
	    Scanner Age = new Scanner(System.in); 
	    System.out.print("enter your age:");
	    int age = Age.nextInt();
	    if (age>=18)
	    	System.out.print("Eligible to vote");
	    else 
	    	System.out.print("Not Eligible to vote");
	    Age.close();
	}

}
