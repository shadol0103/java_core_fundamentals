package simple_project;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("계산기 프로그램");
		System.out.println("첫 번째 숫자: ");
		double num1 = scanner.nextDouble();
		
		System.out.println("두 번째 숫자: ");
		double num2 = scanner.nextDouble();
		
		System.out.println("연산 선택: (+, -, *, /)");
		String operation = scanner.next();
		
		double result = 0;
		
		switch(operation) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				if(num2 != 0) {
					result = num1 / num2;
				} else {
					System.out.println("0으로 나눌 수 없습니다.");
					scanner.close();
					return;
				}
				break;
			default:
				System.out.println("잘못된 연산자 입니다.");
				scanner.close();
				return;
		}
		System.out.println("계산 결과: "+result);
		scanner.close();
	}
}