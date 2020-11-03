	//쇼핑물 상품 정의를 위한 추상 클래스,
	//다양한 상품 종류를 지원하려고 기본 정보 설정과 출력만 추상 클래스에서 지정하고
	//추가 정보는 서브 클래스에서 확장구현하도록 유도.

public abstract class Product {
	//상품 이름과 가격 변수
	protected String pname;
	protected int price;
	
	//상품 이름과 가격을 출력하는 기본 정보 출력 메소드
public void printDetail() {
	System.out.println("상품명: " + pname + " , ");
	System.out.println("상품가격 : " + price + " , ");
	printExtra();
}

public abstract void printExtra();
}
