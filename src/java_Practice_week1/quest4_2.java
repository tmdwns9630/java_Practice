package java_Practice_week1;

import java.util.Scanner;

public class quest4_2 {
//50명의 학생의 점수를 입력하고, 평균을 계산하는 프로그램을 작성하세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Score = new int[50];
		int totalScore = 0;
		
		//50명의 점수를 입력.
		try (Scanner sc = new Scanner(System.in)) {
			for(int i=0; i<50; i++) {
				System.out.printf("%d번째 값 : ", i);
				Score[i] = sc.nextInt();
			}
		}
		
		//입력한 점수를 출력.
		for(int i=0; i<50; i++) {
			System.out.print(i + " : " +Score[i]+" | ");
			
			// i가 10의 배수일 때마다 개행 문자 출력.
			if(((i+1) % 10) == 0) {
				System.out.print("\n");
			}
		}
		
		//전체 점수를 합하여 평균 점수 계산.
		for(int i=0; i<50; i++) {
			totalScore += Score[i];
		}
		System.out.println("평균 점수 : " + totalScore/50);

	}
}
