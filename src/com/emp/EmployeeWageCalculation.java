package com.emp;


public class EmployeeWageCalculation {

	public static void main(String[] args) {
		Employee dmartEmp = new Employee("DMart", "John", 8, 20, 20, 60);
		System.out.println(dmartEmp);
		
		System.out.println("--------------------------------------");
		
		Employee rilEmp = new Employee("RIL", "Tony", 9, 25, 25, 80);
		System.out.println(rilEmp);
	}

}