package com.capg.empapp.exceptions;

public class InvalidEmployeeIdException extends Exception {

	int empID;
	public InvalidEmployeeIdException(int empID) {
		super();
		this.empID=empID;
	}
	@Override
	public String toString() {
		return "InvalidEmployeeId [empID=" + empID + "]";
	}
	
}