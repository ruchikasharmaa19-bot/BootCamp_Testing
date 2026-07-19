package OperatorsTypes;

public class AssignmentOperators {

    public static void main(String[] args) {

        int balance = 10000;

        balance += 500;
        System.out.println("+= " + balance);

        balance -= 200;
        System.out.println("-= " + balance);

        balance *= 2;
        System.out.println("*= " + balance);

        balance /= 2;
        System.out.println("/= " + balance);

        balance %= 3;
        System.out.println("%= " + balance);
    }
}
