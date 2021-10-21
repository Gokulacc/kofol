package com.billa;

public class Employee {
		
	 public Employee() { 
		 this(100);
	 System.out.println("default constrctor");

}

	public Employee(int id) {
		this ("goku");
		System.out.println("int para cons");
		System.out.println(int id);
		
	}
	public Employee(String name) {
		System.out.println("string para cons");
		System.out.println(String name);
		
}
	
	public static void main(String[] args) {
		Employee e=new Employee();
		Employee e1=new Employee(100);
		Employee e2=new Employee("goku");
	}
}