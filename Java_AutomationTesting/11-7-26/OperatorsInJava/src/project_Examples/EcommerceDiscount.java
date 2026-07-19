package project_Examples;
public class EcommerceDiscount {

    public static void main(String[] args) {

        double purchase = 6000;

        double discount = (purchase >= 5000) ? 500 : 0;

        System.out.println("Discount = " + discount);
    }
}
