package com.capg.empapp.dao;

import com.capg.empapp.db.EmployeeDB;
import com.capg.empapp.dto.Employee;
import com.capg.empapp.exceptions.InvalidEmployeeIdException;
import com.capg.empapp.exceptions.WrongSalaryException;

public class EmployeeDAOImpl implements IEmployeeDAO {
	EmployeeDB db=new EmployeeDB();
	Employee emp=new Employee();

	public boolean addEmployee(Employee e) throws WrongSalaryException{
         // SQL  insert into employee ...... 
		
		//System.out.println(" =====>> DAO Impl employee "+e);
		return EmployeeDB.addEmployee(e);
	}

	public Employee[] getAllEmployees() {

		return EmployeeDB.employees;
	}
	
	//============================================================
	
	
	public boolean editSalaryByEmployeeId(int id,int salary) throws InvalidEmployeeIdException {
		for (Employee emp : EmployeeDB.employees) {
			if(emp.getEmployeeId()==id)
			{
				emp.setSalary(salary);
				return true;
			}
		}
		return false;
	}

	public boolean editExpByEmployeeId(int id,int exp) throws InvalidEmployeeIdException {
		
		for (Employee emp : EmployeeDB.employees) {
			if(emp.getEmployeeId()==id)
			{
				emp.setExp(exp);
				return true;
			}
			
		}
		return false;
	}

	public int noOfSalaryMatch(int salary) {
		int count=0;
		for (int i=0;i< EmployeeDB.getCount();i++) {
			if(EmployeeDB.employees[i].getSalary()==salary)
				count++;
			
		}
		return count;
	}
	public int noOfSalaryMatchInRange(int salaryLow,int salaryHigh) {
		int count=0;
		for (int i=0;i< EmployeeDB.getCount();i++)  {
			emp=EmployeeDB.employees[i];
			if(emp.getSalary()<=salaryHigh && emp.getSalary() >= salaryLow)
				count++;
		}
		return count;
	}
	
	public Employee[] getEmployeeBySalary(int salary) {
		int no_of_match=noOfSalaryMatch(salary);
		Employee[] emps=new Employee[no_of_match];
		int j=0;
		for (int i=0;i< EmployeeDB.getCount();i++)  {
			emp=EmployeeDB.employees[i];
			if(emp.getSalary()==salary) {
				emps[j++]=EmployeeDB.employees[i];
			}
		}
		return emps;
	}

	public Employee[] getEmployessBySalaryRange(int salaryRangeMin, int salaryRangeMax) {
		int no_Of_Match=noOfSalaryMatchInRange(salaryRangeMin,salaryRangeMax);
		Employee[] emps=new Employee[no_Of_Match];
		int j=0;
		for (int i=0;i< EmployeeDB.getCount();i++) {
			emp=EmployeeDB.employees[i];
			if(emp.getSalary()<=salaryRangeMax && emp.getSalary() >= salaryRangeMin)
			{
				emps[j++]=EmployeeDB.employees[i];
			}
			
		}
		return emps;
	}
	

}