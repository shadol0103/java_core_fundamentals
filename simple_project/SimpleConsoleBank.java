package simple_project;

import java.util.Scanner;

public class SimpleConsoleBank {
	public static void main(String[] args) {
		boolean isRunning = true;
		Scanner scanner = new Scanner(System.in);
		
		int money = 50000;
		while (isRunning) {
			System.out.println("1.잔액확인");
			System.out.println("2. 입금");
			System.out.println("3. 출금");
			System.out.println("4. 종료");
			String choice = scanner.next();
			
			switch(choice) {
				case "1":
					System.out.println("잔액: "+money);
					continue;
				case "2":
					System.out.print("입금 금액: ");
					int plus_money = scanner.nextInt();
					money = money + plus_money;
					System.out.println(plus_money+"원 입금되었습니다. 잔액: "+money);
					continue;
				case "3":
					System.out.print("출금 금액: ");
					int minus_money = scanner.nextInt();
					if (money - minus_money >= 0) {
						money = money - minus_money;
						System.out.println(minus_money+"원 출금되었습니다. 잔액: "+money);
						continue;
					} else {
						System.out.println("잔액이 부족합니다. 잔액: "+money);
						continue;
					}
				case "4":
					System.out.println("종료.");
					isRunning = false;
					break;
			}
		}
		scanner.close();
	}
}
