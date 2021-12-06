package com.emp;

import static com.emp.Employee.TOTAL_WORK_DAY;
import static com.emp.Employee.FULL_DAY_WORKING_HOUR;
import static com.emp.Employee.MAX_WORKING_HOUR;
import static com.emp.Employee.SALARY_PER_HOUR;

public class EmployeeWageCalculation {

	static int totalSalary;
	static int totalWorkingHour;

	public static void main(String[] args) {
		Employee emp = new Employee("John");
		int day = 0;
		while (day < TOTAL_WORK_DAY && (totalWorkingHour + FULL_DAY_WORKING_HOUR) <= MAX_WORKING_HOUR) {
			day++;
			int workingHour = emp.getWorkignHour(emp.isEmpPresent());
			totalWorkingHour += workingHour;
		}
		totalSalary = totalWorkingHour * SALARY_PER_HOUR;
		System.out.println(emp.empName + "'s monthly wage : " + totalSalary);
		System.out.println(emp.empName + "'s total working hour : " + totalWorkingHour);
	}

}