package com.Scanner;

import java.util.Scanner;

public class NextDoubleExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a double value: ");
        double value = sc.nextDouble();

        System.out.println("Double Value: " + value);

        sc.close();
    }
}