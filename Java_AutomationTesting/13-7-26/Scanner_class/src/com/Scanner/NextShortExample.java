package com.Scanner;

import java.util.Scanner;

public class NextShortExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a short value: ");
        short value = sc.nextShort();

        System.out.println("Short Value: " + value);

        sc.close();
    }
}