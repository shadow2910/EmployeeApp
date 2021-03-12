package lab5;
import java.util.Scanner;
public class NameExceptionMain {
	
	public boolean validation(String firstName,String lastName,int salary) throws NameException{
		
		boolean status=false;
		if(firstName.length()==0 || lastName.length()==0)
		{
			status=false;
			throw new NameException();
		}
		else
		{
			System.out.println("Name Validated");
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
		NameExceptionMain obj=new NameExceptionMain();
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
