package com.Abstract;

abstract class ATM {

    public void deposit() {
        System.out.println("Amount Deposited");
    }

    public void withdraw() {
        System.out.println("Amount Withdrawn");
    }

    abstract void calInterest();
}

class SBI extends ATM {

    @Override
    void calInterest() {
        System.out.println("SBI Interest = 6%");
    }
}

class HDFC extends ATM {

    @Override
    void calInterest() {
        System.out.println("HDFC Interest = 7%");
    }




    public static void main(String[] args) {

        ATM sbi = new SBI();

        sbi.deposit();
        sbi.withdraw();
        sbi.calInterest();

        System.out.println();

        ATM hdfc = new HDFC();

        hdfc.deposit();
        hdfc.withdraw();
        hdfc.calInterest();
    }
}
