package com.Azure;
import java.util.Scanner;
public class Login_Validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner pass = new Scanner(System.in);
		 System.out.println("Full Name:");
		 String name= pass.nextLine();
		 
System.out.println("Password:");
String Password= pass.nextLine();

System.out.println("Contact:");
String mob = pass.nextLine();
if (mob.length()!=10)
	System.out.println("Incorrect!");

System.out.println("Address:");
String ad = pass.nextLine();

System.out.println("------User Details------");
System.out.println(name);
System.out.println(Password);
System.out.println(ad);
System.out.println("---Successfully Logged In---");
pass.close();
	}

}
