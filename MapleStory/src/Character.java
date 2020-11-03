
public class Character {
	private int Exp;
	private int state;
	private int postionNum;
	private String name;
	private int Hp;
	private int level;
	private int damage;
	
	Character(String name) {
		this.Exp = 0;
		this.state = 0;
		this.postionNum = 100;
		this.name = name;
		this.Hp = 100;
		this.level = 1;
		this.damage = 10;
	}
	public int getExp() {
		return Exp;
	}
	public void setExp(int exp) {
		Exp = exp;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getPostionNum() {
		return postionNum;
	}
	public void setPostionNum(int postionNum) {
		this.postionNum = postionNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return Hp;
	}
	public void setHp(int hp) {
		Hp = hp;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public void levelUp() {
			level++;
			Exp -= 150;
			Hp = 100;
			damage += level * 5;
			System.out.println("Level up!"+level+"로 되었습니다.");
	}
	public void drinkP() {
			this.Hp = 100;
			postionNum--;
			System.out.printf("포션사용! Hp가"+Hp+"로 되었습니다.(포션갯수 :%d)", postionNum);
	}
	public void attack(Monster pink) {
		int i = pink.getHp() - this.damage;
		pink.setHp(i);
		System.out.println("핑크빈이"+this.damage+"만큼 피해를 입었다!!");
		System.out.println("핑크빈의 체력이"+pink.getHp()+"로 되었다");
	}
}
