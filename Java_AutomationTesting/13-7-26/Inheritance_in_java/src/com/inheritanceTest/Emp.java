package com.inheritanceTest;

public class Emp {
	private String name;
	protected double salary;
	private String id;
	//constructor
	public Emp(String name,double salary,String id) {
		this.name = name;
		this.salary= salary;
		this.id= id;
	}
	//Getter method
	public String getname() {
		return name;
	}
	public double getsalary() {
		return salary;
	}
public String getid() {
	return id;
}
public void display() {
	System.out.println("Name:"+name+"Salary:"+salary+"Employee id:"+id);
}
}
//manager class
 class Manager extends Emp {
	private String department;

//constructor
public Manager(String name,double salary,String id,String department) {
	super(name,salary,id);
	this.department=department;
}
public void ApproveBudget() {
	System.out.println(getname()+"approved the budget for"+department+"department");
}
public void display() {
	super.display();
	System.out.println("department"+department);
}
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m1= new Manager("Ruchika",300000,"202","IT");

	m1.display();
	}
	
 }
