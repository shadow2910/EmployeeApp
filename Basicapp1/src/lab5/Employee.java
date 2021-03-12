package lab5;

public class Employee {
	private String firstName;
	private String secondName;
	private int salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String firstName, String secondName, int salary) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.salary = salary;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", secondName=" + secondName + ", salary=" + salary + "]";
	}
	
	
}
