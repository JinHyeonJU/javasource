



public class Date {  // user-defined data type 사용자 정의 데이터타입
	private int year;
	private int month;
	private int day;
	
	public Date() {
		this.year = 1990;
		this.month = 1;
		this.day = 1;
	}
	
	public Date(int year, int month, int day) {
		setDate(year, month, day);
	}
	
	public int getMonth() {  // accessor   get/set 메서드
		return this.month;
	}
	
	public void setMonth(int month) { // mm : parameter mutator
 		this.month = max(1, month);
 		this.month = min(this.month, 12);
	}
	
	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getDay() {
		return this.day;
	}

	public void setDay(int day) {
		int [] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		this.day = max(1, day);
		this.day = min(this.day, days[month-1]);
	}

	public void setDate(int yy, int mm, int dd) {
		int [] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		/*
		if(yy >= 1990)
			year = yy;
		if(mm > 0 && mm < 13)
			month = mm;
		if(dd > 0 && dd < days[month-1]+1)
			day = dd;		
		*/
		year = max(1990, yy);
		month = max(1, mm);
		month = min(month, 12);
		day = max(1, dd);
		day = min(day, days[month-1]);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%04d-%02d-%02d\n", year, month, day);
	}

	public void displayDate() {
		System.out.printf("%04d-%02d-%02d\n", year, month, day);
	}
	
	private int max(int x, int y) {
		if(x > y) 
			return x;
		return y;
	}
	
	private int min(int x, int y) {
		if(x < y)
			return x;
		return y;
	}
}
