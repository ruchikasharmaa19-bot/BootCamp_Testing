package com.Scanner;

import java.util.Scanner;

public class NextFloatExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a float value: ");
        float value = sc.nextFloat();

        System.out.println("Float Value: " + value);

        sc.close();
    }
}
