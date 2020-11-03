package shopping;
public interface IShop { //인터페이스는 틀을 잡아주는 느낌
						 //인터페이스는 기본적으로 public임
						 //인터페이스는 1.추상메소드 2.상수 3.default 4.static (3. 4 일반 메소드 가능)
	abstract void setTitle(String title);
	abstract void genUser();
	abstract void genProduct();
	abstract void start();
}
