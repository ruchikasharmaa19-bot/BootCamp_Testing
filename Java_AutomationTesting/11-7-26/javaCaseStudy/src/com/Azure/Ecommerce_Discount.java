package com.Azure;
import java.util.Scanner;
public class Ecommerce_Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dis = new Scanner(System.in);
		System.out.print("Enter your purchase price:");
		int price = dis.nextInt();
if(price<=1000) {
	System.out.print("Not Applicable!");
}
else if(price>1000 && price<2000)
{
	System.out.println("You got 10% Off!");
double discount=(price*10)/100;
double Price= price-discount;
System.out.printf("New Price:%.2f",Price);
}
else if (price>=2000&& price<=3000)
{
	System.out.println("You got 20% Off!");
	double discount = (price * 20)/100;
			double Price = price-discount;
			System.out.printf("New Price: %.2f",Price);
}
else {System.out.println("You got 30% Off!");
double discount = (price*30)/100;
double Price=price-discount;
System.out.printf("New Price: %.2f",Price);



}

dis.close();

	}

}
