import Employee.Employee;

public class Department {
	private Employee [] employees;
	private int headCount;
	public Department() {
		employees = new Employee[5];
		headCount = 0;
	}
	  
	public void addEmployee(Employee e) {
		if(headCount < 5)
			employees[headCount++] = e;
	}
	
	public void display() {
		for(int i = 0; i < headCount; ++ i) {
			employees[i].displayEmployee();
			double pay = employees[i].payCheck();
			System.out.printf("급여액 : %.0f 원\n", pay);
		}
	}
}
