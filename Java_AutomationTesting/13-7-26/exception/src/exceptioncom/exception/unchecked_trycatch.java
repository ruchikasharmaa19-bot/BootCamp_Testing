package exceptioncom.exception;

public class unchecked_trycatch {

    public static void main(String[] args) {

        try {
            int num1 = 20;
            int num2 = 0;

            int result = num1 / num2; // ArithmeticException

            System.out.println("Result = " + result);

        } catch (ArithmeticException e) {

            System.out.println("Exception Caught: Cannot divide by zero.");
            System.out.println("Error Message: " + e.getMessage());

        }

        System.out.println("Program executed successfully.");
    }
}
