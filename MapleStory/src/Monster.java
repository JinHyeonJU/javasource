
public class Monster {
	private int damage;
	private int dCount;
	private String name;
	private int Hp;
	
	Monster (String name) {
		this.damage = 15;
		this.dCount = 0;
		this.name = name;
		this.Hp = 150;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getdCount() {
		return dCount;
	}

	public void setdCount(int dCount) {
		this.dCount = dCount;
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

	public void setHp(int Hp) {
		this.Hp = Hp;
	}
	public void dead() {
			dCount += 1;
	}
	public void attack(Character H) {
		int i = H.getHp() - this.damage;
		H.setHp(i);
		System.out.println(this.damage+"만큼 피해를 입었다!!");
		System.out.println("아야!!체력이"+H.getHp()+"가 됬다.");
	}
}
