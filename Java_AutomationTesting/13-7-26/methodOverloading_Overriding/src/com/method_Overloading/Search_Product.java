//e commerce product search using different options
package com.method_Overloading;


public class Search_Product {
	public void search(String productName) {
		System.out.println("searching by product name");
	}
	public void search(String productName , String brand) {
		System.out.println("searching by product name and brand");
	}
public void search(String productName, String brand, int price) {
	System.out.println("searching by product name , brand and price");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
