
public class SalesEmployee extends RegularEmployee {
	private double rate;
	private double sales;
	SalesEmployee(String name, String telNum, String address, Date joinDate, double salary, double rate) {
		super(name, telNum, address, joinDate, rate);
		// 
		this.rate = rate;
		this.sales = 0;
	}
	public void setSales(double sales) {
		this.sales = sales;
	}
	public double payCheck() {
		return super.salary + (rate * sales);
	}
}
