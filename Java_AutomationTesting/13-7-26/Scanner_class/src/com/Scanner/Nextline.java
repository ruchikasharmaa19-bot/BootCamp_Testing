package com.Scanner;
import java.util.Scanner;
public class Nextline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter first name");
		String first= keyboard.nextLine();
		System.out.println("enter last name");
		String last= keyboard.nextLine();
		System.out.println("enter city");
		String city= keyboard.nextLine();
		System.out.println("Name: "+first+"Last:"+last+"City:"+city);
keyboard.close();
	}

}
