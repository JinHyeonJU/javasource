package exception;

public class ExceptionTest2 {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2); //a를 숫자로변경x
		
		
		System.out.println(value1+value2);
	}
}
