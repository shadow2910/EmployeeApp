package com.capg.empapp.main;

import java.util.Scanner;

import com.capg.empapp.db.EmployeeDB;
import com.capg.empapp.dto.Employee;
import com.capg.empapp.service.EmployeeServiceImpl;
import com.capg.empapp.service.IEmployeeService;

public class EmpMainClass {
	
	IEmployeeService empService = new EmployeeServiceImpl();
	
	public static void main(String[] args) {
		
		EmpMainClass app = new EmpMainClass();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println(" === MENU ==== ");
			System.out.println("1. add employee ");
			System.out.println("2. Display All Employee ");
			System.out.println("3. Edit salary and experience using Eid");
			System.out.println("4. Display employee based on salary");
			System.out.println("5. Display employee based on salary range");
			System.out.println("0. EXIT");
			System.out.println("Enter Option");
			int option = Integer.parseInt(sc.nextLine());
			switch(option)
			{
			
			case 1:
				
				System.out.println("Enter Employee Id ");
				int empId = Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter Employee Salary ");
				int empSalary = Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter Employee Exp ");
				int empExp = Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter Employee Name ");
				String name = sc.nextLine();
				
				Employee e = new Employee(empId, name, empExp, empSalary);
				
				try
				{
					boolean isInserted = app.empService.addEmployee(e);
					if(isInserted)
					{
						System.out.println(" Employee Added !!!");
					}
					else
					{
						 throw new Exception("Cannot added Employee ...");
					}
				}
				catch(Exception ex)
				{
					System.out.println(" Contact to Customer Care ... "+ex); // raise the exception
				}
				
				break;
			case 2:
				
				Employee arr[] = app.empService.getAllEmployees();
				int count = EmployeeDB.count;  // not the code
				for (int i = 0; i < count; i++) {
					System.out.println(arr[i]);
					System.out.println(" ========================================================");
				}
				break;
			case 3:
				System.out.println("Enter employee id");
				int empID=Integer.parseInt(sc.nextLine());
				System.out.println("Enter experience");
				int empEXp=Integer.parseInt(sc.nextLine());
				System.out.println("Enter salary");
				int empsalary=Integer.parseInt(sc.nextLine());
				
				try {
				if(app.empService.editExpByEmployeeId(empID,empEXp))
					System.out.println("Experience change successfull");
				else {
					System.out.println("Cannot change experience");
				}
				if(app.empService.editSalaryByEmployeeId(empID,empsalary,empEXp))
					System.out.println("Salary change successfull");
				else {
					System.out.println("Cannot change salary");
				}
				}
				catch(Exception ex) {
					System.out.println(ex);
				}
				break;
			case 4:
				System.out.println("Enter salary");
				int empsal=Integer.parseInt(sc.nextLine());
				Employee[] emps=app.empService.getEmployeeBySalary(empsal);
				for(int i=0;i<emps.length;i++) {
					System.out.println(emps[i]);
				}
				break;
			case 5:
				System.out.println("Enter lower limit of salary");
				int empSalLow=Integer.parseInt(sc.nextLine());
				System.out.println("Enter upper limit of salary");
				int empSalHigh=Integer.parseInt(sc.nextLine());
				Employee[] empss=app.empService.getEmployessBySalaryRange(empSalLow,empSalHigh);
				for(int i=0;i<empss.length;i++) {
					System.out.println(empss[i]);
				}
				break;
			case 0:
				System.exit(0);
			
			
			
			}//end switch
			
		}// end while
		
		
		
	}//end main

}//end class