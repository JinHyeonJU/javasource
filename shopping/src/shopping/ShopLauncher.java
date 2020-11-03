package shopping;

public class ShopLauncher {

	public static void main(String[] args) {
		MyShop shop = new MyShop();
		
		//상점이름 지정
		shop.setTitle("응애배고파");
		//User 생성
		shop.genUser();
		//제품 생성
		shop.genProduct();
		//상점 시작
		shop.start();
	}

}
