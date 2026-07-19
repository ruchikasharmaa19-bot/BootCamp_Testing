package time_analogy;

public interface Java_interface {

    void deposit();

    void withdraw();



public class BankAccount implements Java_interface {

    @Override
    public void deposit() {
        System.out.println("Amount deposited successfully.");
    }

    @Override
    public void withdraw() {
        System.out.println("Amount withdrawn successfully.");
    }





    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.deposit();
        account.withdraw();
    }
}}