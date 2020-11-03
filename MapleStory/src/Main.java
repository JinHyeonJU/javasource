import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Character Hyeon = new Character("柳泅林");
		Monster pinkBin = new Monster("俏农后");
		
		System.out.println(pinkBin.getName()+"捞 唱鸥车促! 轿快丽");
		while (pinkBin.getHp() != 0) {	
		Hyeon.attack(pinkBin);
			pinkBin.attack(Hyeon);
		System.out.println("-------------");
		
		if (Hyeon.getHp() < 30)
			Hyeon.drinkP();
		if (Hyeon.getExp() == 150)
			Hyeon.levelUp();
		}
	}
}
