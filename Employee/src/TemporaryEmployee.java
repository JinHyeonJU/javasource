import Employee.Employee;

public class TemporaryEmployee extends Employee {
	private double pay4hour;
	private int workHours;
	
	TemporaryEmployee(String name, String telNum, String address, Date joinDate, double pay4Hour) {
		super(name, telNum, address, joinDate);
		this.pay4hour = pay4hour;
		this.workHours = 0;
	}		
	
	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}
	
	public double payCheck() {
		return pay4hour * workHours;
	}
}

