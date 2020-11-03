import java.util.Scanner;

public class Score {
	protected String name;
	protected int score;
	protected char rating;
	public Score(String name,int score) {
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	Scanner s = new Scanner (System.in);
		public void checkScore() {
		for (int i = 0; i < 1; i++) {
			System.out.println(name+"학생의 점수를 입력해주세요");
			int a = s.nextInt();
			if (a >= 90) {
				rating = 'A';
				System.out.println(name+"학생은"+rating+"등급입니다");
			}else if(a < 90 && a >= 80) {
				rating= 'B';
				System.out.println(name+"학생은"+rating+"등급입니다");
			}else if(a < 80 && a >= 70) {
				rating = 'c';
				System.out.println(name+"학생은"+rating+"등급입니다");
			} else
				rating = 'F';
				System.out.println(name+"학생은"+rating+"등급입니다");
		}
	}
}
