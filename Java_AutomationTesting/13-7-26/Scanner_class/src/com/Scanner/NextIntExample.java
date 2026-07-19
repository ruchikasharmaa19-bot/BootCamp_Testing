package com.Scanner;

import java.util.Scanner;

public class NextIntExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int value = sc.nextInt();

        System.out.println("Integer Value: " + value);

        sc.close();
    }
}
