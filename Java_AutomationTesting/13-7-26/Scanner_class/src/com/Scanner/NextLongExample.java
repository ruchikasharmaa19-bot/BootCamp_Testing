package com.Scanner;

import java.util.Scanner;

public class NextLongExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a long value: ");
        long value = sc.nextLong();

        System.out.println("Long Value: " + value);

        sc.close();
    }
}