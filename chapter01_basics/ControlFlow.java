package chapter01_basics;

public class ControlFlow {
	public static void main(String[] args) {
		// if-else문
		int score = 85;
		
		if (score >=90) {
			System.out.println("A 등급");
		} else if (score >=80) {
			System.out.println("B 등급");
		} else {
			System.out.println("C 등급 이하");
		}
		
		//switch 문
		char grade = 'B';
		switch (grade) {
			case 'A':
				System.out.println("우수성적");
				break;
			case 'B':
				System.out.println("좋은성적");
				break;
			default:
				System.out.println("열공");
		}
		
		//for 문
		System.out.println("for 문: ");
		for (int i=1; i<=5; i++) {
			System.out.println("반복: "+i);
		}
		
		//while 문
		System.out.println("while 문: ");
		int count = 1;
		while (count <= 3) {
			System.out.println("카운트: "+count);
			count++;
		}
	}
}
