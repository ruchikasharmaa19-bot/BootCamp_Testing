package com.jump_Control;

public class break_statement {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 15; j++) {

                if (j == 5) {
                    break;      // Breaks only the inner loop
                }

                System.out.println("i = " + i + " j = " + j);
            }
        }
    }
}