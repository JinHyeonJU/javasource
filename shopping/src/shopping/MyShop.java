package shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop implements IShop {
	//쇼핑몰 이름 
	private String title;
	//장바구니
	ArrayList<Product> carts = new ArrayList<Product>();
	//사용자
	private User[] users = new User[2];
	//등록 상품 정보
	private Product[] products = new Product[3];
	//키보드 입력
	Scanner scan = new Scanner(System.in);
	//
	private int selUser;
	

	@Override
	public void setTitle(String title) { 
		this.title = title;
		
	}

	@Override
	public void genUser() {
		/*쇼핑몰 사용자 생성 후 배열에 담기
		User 클래스객체를 이용
		배열 생성 및 초기화
		User user[] = {};*/
		User user = new User("진현주", PayType.CARD);
		users[0] = user;
		user = new User("김다은", PayType.CASH);
		users[1] = user;
		
	}

	@Override
	public void genProduct() {
		//ctrl+Alt 밑방향키 밑에줄에 복붙
		// 쇼핑몰에서 판매하는 제품 생성
		//CellPhone,Chicken,SmartTV
		products[0] = new SmartTV("LGTV", 1300000, "FULL HD");
		products[1] = new Chicken("뿌링클", 20000, "JMT");
		products[2] = new CellPhone("아이폰X", 400000, "내꺼");
		
	}

	@Override
	public void start() {
		//시작하는 메소드
		System.out.println(title+" : 메인화면 - 계정선택");
		System.out.println("=======================");
		
		int i = 0;
		for(User u : users) {
			System.out.printf("[%d] %s(%s)\n", i++, u.getName(), u.getPaytype());
			
		}
		System.out.println("[x]종 료");
		System.out.print("선택 : ");
		
		//사용자한테 user 번호를 입력받은 후 제품 목록 출력하기
		// 0, 1, x
		
		String input = scan.next();
		switch (input) {
		case "0": case "1":
			System.out.println("### "+input+" 선택 ###");
			selUser = Integer.parseInt(input);
			productList();
			break;
		case "x": case"X":
			System.out.println("shop을 종료합니다.");
			break;
			default:
				System.out.println("\n입력값을 확인해 주세요\n");
				start();
				break;
		}
	}
	public void productList() {
		//제품 목록 출력하기
		System.out.println(title+" : 메인화면 - 계정선택");
		System.out.println("=======================");
		
		int i = 0;
		for(Product p : products) {
			System.out.printf("[%d]", i++);
			p.printDetail();
		}
		System.out.println("[h] 메인화면");
		System.out.println("[c] 체크아웃");
		System.out.print("선택 : ");
		String input = scan.next();
		
		switch(input) {
		case "h": case "H":
			start();
			break;
		case "c": case"C":
			checkOut();
			break;
		case "1": case "2": case"3":
			System.out.println("## "+input+" 선택##");
			//카트에담기
			carts.add(products[Integer.parseInt(input)]);
			//product[입력받는 input숫자]
			//다시 상품목록 보여주기
			productList();
		default:
			System.out.println("입력값을 확인해 주세요.");
			productList();
				break;
		}
	}
		public void checkOut() {
			System.out.println(title + " : 체크아웃");
			System.out.println("===================");
			int total = 0; //장바구니 금액 합계
			int i = 0;
			for (Product p : carts) {
				System.out.printf("[%d] %s(%s)\n", i++, p.getPname(), p.getPrice());	
				total += p.getPrice(); //장바구니 물건 값 합계 구하기
				}
			System.out.println("===================");
			System.out.printf("결제방법 : \n", users[selUser].getPaytype());
			System.out.println("합계 : "+total+"원 입니다");
			System.out.println("[p]이전, [q]결제 완료");
			System.out.println("선택 : ");
			String sel = scan.next();
			
			switch(sel) {
			case "p":
				productList(); break;
			case "q":
				System.out.println("## 결제가 완료되었습니다. 종료합니다. ##");
				System.exit(0); break;
				default :
					System.out.println("입력값을 확인해 주세요");
					checkOut();
					break;
			}
			
		}			
}
