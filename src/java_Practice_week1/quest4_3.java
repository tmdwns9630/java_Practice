package java_Practice_week1;

import java.util.Scanner;

/*
//50명의 학생의 점수를 입력하고, 평균을 계산하는 프로그램을 작성하세요.

1주차 연습습문제 4번에 대한 회신에서 “배열을 사용하지 않고, 전체 점수를 구한 후 평균을 낸다.”는 것은 평균을 계산하는 데

있어서 굳이 배열에 점수를 저장하지 말고, 문제에서 원하는 평균값을 출력할 수 있으며, 그 방향으로 프로그램을 수정해 보라고

회신한 것이었습니다(굳이 그렇게 회신한 이유는 문제에서 원하는 해답을 얻기 위한 최소한의 코드를 작성했으면 하는 의도라도

이해해 주면 좋겠습니다.).
*/

public class quest4_3 {

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
