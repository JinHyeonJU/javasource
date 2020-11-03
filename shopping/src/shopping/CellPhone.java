package shopping;

public class CellPhone extends Product {
	//통신사
	String carrier;

	public CellPhone(String pname, int price, String carrier) {
		super(pname, price);
		this.carrier = carrier;
		}
	
	@Override
	void printExtra() {	
		System.out.println("통신사 : "+carrier);
	}

}
