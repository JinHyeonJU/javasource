package shopping;

public class SmartTV extends Product {
	
	//해상도
	private String resolution;
	
		public SmartTV(String pname, int price, String resolution) { //오른쪽클릭소스
		super(pname, price); //pname, price 포함됨
		this.resolution = resolution;
	}



	@Override
	void printExtra() {
		System.out.println("해상도 정보 :"+resolution);

	}

}
