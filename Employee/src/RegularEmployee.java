import Employee.Employee;

public class RegularEmployee extends Employee {

		protected double salary;
	RegularEmployee(String name, String telNum, String address, Date joinDate, double salary) {
		super(name, telNum, address, joinDate);
		// TODO Auto-generated constructor stub
		this.salary = salary;
	}
	public double payCheck() {
		return salary;
	}
}
