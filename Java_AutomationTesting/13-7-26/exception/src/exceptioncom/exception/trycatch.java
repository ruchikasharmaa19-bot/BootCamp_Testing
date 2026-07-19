package exceptioncom.exception;

public class trycatch {

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            int result = a / b;   // This will cause ArithmeticException

            System.out.println("Result = " + result);

        } catch (ArithmeticException e) {

            System.out.println("Exception Caught: Cannot divide by zero.");

        }

        System.out.println("Program continues after exception handling.");
    }
}