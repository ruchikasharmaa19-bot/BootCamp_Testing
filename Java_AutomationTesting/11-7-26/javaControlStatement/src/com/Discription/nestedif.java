package com.Discription;

public class nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address= "delhi, india";
		
if (address.endsWith("india")) {
	if (address.contains("meerut"))
	System.out.print("meerut");
}
else if (address.contains("noida")) {
	System.out.print("noida");
}
else {
	System.out.print(address.split(",")[1]);
	
}
 
	System.out.print("not living in india");


	}

}
