package com.capg.empapp.exceptions;

public class WrongSalaryException extends Exception{

	int salary;
	public WrongSalaryException(int salary)
	{
		super();
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "WrongExpSalary [salary=" + salary + "]";
	}
	
	
}
