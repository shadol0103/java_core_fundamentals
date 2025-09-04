package chapter01_basics;

public class Operators {
	public static void main(String[] args) {
		// 산술 연산자
		int a = 10;
		int b = 3;
		
		System.out.println("덧셈: "+(a+b));
		System.out.println("뺄셈: "+(a-b));
		System.out.println("곱셈: "+(a*b));
		System.out.println("나눗셈: "+(a/b));
		System.out.println("나머지: "+(a%b));
		
		//비교 연산자
		System.out.println("a > b: "+(a > b));
		System.out.println("a == b: "+(a == b));
		
		//논리 연산자
		boolean x = true;
		boolean y = false;
		
		System.out.println("x && y: "+(x&&y));
		System.out.println("x || y: "+(x||y));
		System.out.println("!x: "+(!x));		
	}
}
