package chapter01_basics;

public class VariablesAndDataTypes {
	public static void main(String[] args) {
		// 기본 데이터 타입
		int number = 10;
		double decimal = 10.5;
		char character = 'A';
		boolean isTrue = true;
		
		// 문자열
		String message = "Hello";
		
		// 변수 출력
		System.out.println("정수: "+number);
		System.out.println("실수: "+decimal);
		System.out.println("문자: "+character);
		System.out.println("불리언: "+isTrue);
		System.out.println("문자열: "+message);
		
		//변수 값 변경
		
		number = 20;
		System.out.println("변경된 정수: "+number);
	}
}
