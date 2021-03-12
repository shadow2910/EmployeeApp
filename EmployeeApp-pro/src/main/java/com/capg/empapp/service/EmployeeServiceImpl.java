package com.capg.empapp.service;

import com.capg.empapp.dao.EmployeeDAOImpl;
import com.capg.empapp.dao.IEmployeeDAO;
import com.capg.empapp.db.EmployeeDB;
import com.capg.empapp.dto.Employee;
import com.capg.empapp.exceptions.InvalidEmployeeIdException;
import com.capg.empapp.exceptions.WrongSalaryException;

public class EmployeeServiceImpl implements IEmployeeService {
   // Animal a = new Dog();
	IEmployeeDAO dao;

	public EmployeeServiceImpl() {
		dao = new EmployeeDAOImpl();
	}

	public boolean addEmployee(Employee e) throws WrongSalaryException {
		
			//System.out.println(" ------------>> inside service "+e);
		
			if(e.getSalary()> 50000)
			{
				throw new WrongSalaryException(e.getSalary());
			}
			else if(e.getSalary()>10000 && e.getExp()<3)
				throw new WrongSalaryException(e.getSalary());
			else return dao.addEmployee(e);		
		
	}

	public Employee[] getAllEmployees() {

		return dao.getAllEmployees();
	}
	
	
	// ================================================================================

	public boolean editSalaryByEmployeeId(int id,int salary,int experience) throws InvalidEmployeeIdException,WrongSalaryException {
		if(salary>50000)
			throw new WrongSalaryException(salary);
		else if(salary>10000 && experience<3)
			throw new WrongSalaryException(salary);
		else {
			if(dao.editSalaryByEmployeeId(id, salary))
				return true;
			else
				throw new InvalidEmployeeIdException(id);
		}
		
	}

	public boolean editExpByEmployeeId(int id,int exp) throws InvalidEmployeeIdException {
		if(dao.editExpByEmployeeId(id, exp))
			return true;
		else
			throw new InvalidEmployeeIdException(id);
	}

	public Employee[] getEmployeeBySalary(int salary) {
		Employee[] emps=dao.getEmployeeBySalary(salary);
		
		return emps;
	}

	public Employee[] getEmployessBySalaryRange(int salaryRangeMin, int salaryRangeMax) {
		Employee[] emps=dao.getEmployessBySalaryRange(salaryRangeMin, salaryRangeMax);
		return emps;
		
	}

}