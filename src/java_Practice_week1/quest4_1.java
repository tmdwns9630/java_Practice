package java_Practice_week1;

public class quest4_1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Score = new int[50];
		int totalScore = 0;
		
		//Math.Random 함수로 100 이하의 난수 생성하여 int 배열 50개에 저장, 출력.
		for(int i=0; i<50; i++) {
			Score[i] = (int)(Math.random()*100);
			System.out.print(i + " : " +Score[i]+" | ");
			
			// i가 10의 배수일 때마다 개행 문자 출력.
			if(((i+1) % 10) == 0) {
				System.out.print("\n");
			}
		}
		System.out.print("\n");
		
		
		//전체 점수를 합하여 평균 점수 계산.
		for(int i=0; i<50; i++) {
			totalScore += Score[i];
		}
		
		System.out.println("평균 점수 : " + totalScore/50);
		
	}
}
