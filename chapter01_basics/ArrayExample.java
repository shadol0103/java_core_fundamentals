package chapter01_basics;

public class ArrayExample {
	public static void main(String[] args) {
		// 배열 선언, 초기화
		int[] numbers = {10, 20, 30, 40, 50};
		
		//배열 요소 출력
		System.out.println("배열 요소 출력: ");
		for (int i=0; i < numbers.length; i++) {
			System.out.println("numbers["+i+"]"+numbers[i]);
		}
		
		// 향상 for 문
		System.out.println("향상된 for 문: ");
		for (int num:numbers) {
			System.out.println(num);
		}
		
		//2차원 배열
		int[][] matrix = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		System.out.println("2차원 배열 출력: ");
		for (int i=0; i < matrix.length; i++) {
			for (int j=0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
