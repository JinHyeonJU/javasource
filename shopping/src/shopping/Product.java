package shopping;

/* 추상 클래스 - 객체 생성 불가
 * 			- 단일 상속용으로 사용됨
 * 			- 인터페이스 차이점: 추상메소드 + 일반메소드 가짐
 * 			  일반메소드 : 공통되는 특징
 * ㅂ		  추상메소드 : 구별되는 기타특징
 */
public abstract class Product {
	private String pname;
	private int price;
	
	Product(String pname, int price){
		super();
		this.pname = pname;
		this.price = price;
	}
	
	void printDetail() {
		System.out.println("상품이름 : "+pname);
		System.out.println("가격 : "+price);
		printExtra();
	}
		abstract void printExtra(); //구별되는 기타특징
		
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
