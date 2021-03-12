package lab5;

import java.util.Scanner;

public class EmployeeMain {
	
public boolean validation(String firstName,String lastName,int salary) throws EmployeeException{
		
		boolean status=false;
		if(salary<3000)
		{
			status=false;
			throw new EmployeeException();
		}
		else
		{
			System.out.println("Salary Validated");
			Employee emp=new Employee(firstName,lastName,salary);
			status=true;
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name");
		String firstName=sc.nextLine();
		System.out.println("Enter Last Name");
		String lastName=sc.nextLine();
		System.out.println("Enter salary");
		int salary=Integer.parseInt(sc.nextLine());
		boolean status=false;
		EmployeeMain obj=new EmployeeMain();
		try {
			status=obj.validation(firstName, lastName,salary);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		if(status) {
			System.out.println("Employee Registered Successfully");
		}	
	}

}
