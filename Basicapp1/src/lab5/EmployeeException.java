package lab5;

public class EmployeeException extends Exception{

	@Override
	public String toString() {
		return "salary cannot be less than 3000";
	}
	

}
