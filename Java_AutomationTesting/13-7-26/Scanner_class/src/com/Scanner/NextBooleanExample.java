package com.Scanner;
import java.util.Scanner;

public class NextBooleanExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a boolean value (true/false): ");
        boolean value = sc.nextBoolean();

        System.out.println("Boolean Value: " + value);

        sc.close();
    }
}