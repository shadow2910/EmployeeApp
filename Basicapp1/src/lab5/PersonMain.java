package lab5;
import java.util.Scanner;
public class PersonMain {
	
	public boolean validateAge(int age) throws AgeException{
		if(age<=15)
			throw new AgeException();
		else
			return true;
	}

	public static void main(String[] args) {
		PersonMain obj=new PersonMain();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age=Integer.parseInt(sc.nextLine());
		try {
			if(obj.validateAge(age)) {
				System.out.println("Age Validated");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
