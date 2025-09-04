package chapter01_basics;

import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 목표 랜덤 숫자 생성
		int targetNumber = (int)(Math.random() * 100)+1;
		System.out.println("숫자 맞추기 게임 시작.");
		
		//유저 값 입력 및 게임 시작
		while(true) {
			System.out.print("숫자를 입력하세요: ");
			int num = scanner.nextInt();
						
			if (num < targetNumber) {
				System.out.println("더 높게.");
			} else if (num > targetNumber) {
				System.out.println("더 낮게.");
			} else {
				System.out.println("정답.");
				break;
			}
		}
	}
}
