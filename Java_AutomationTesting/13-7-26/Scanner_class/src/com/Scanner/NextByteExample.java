package com.Scanner;

import java.util.Scanner;

public class NextByteExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a byte value: ");
        byte value = sc.nextByte();

        System.out.println("Byte Value: " + value);

        sc.close();
    }
}
