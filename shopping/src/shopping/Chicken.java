package shopping;

public class Chicken extends Product {
	
	String oiisisa;

	public Chicken(String pname, int price, String oiisisa) {
		super(pname, price);
		this.oiisisa = oiisisa;
	}

	@Override
	void printExtra() {
		System.out.println("맛있는 정도 :"+oiisisa);

	}

}
