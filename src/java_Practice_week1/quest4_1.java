package java_Practice_week1;

public class quest4_1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Score = new int[50];
		int totalScore = 0;
		
		//Math.Random �Լ��� 100 ������ ���� �����Ͽ� int �迭 50���� ����, ���.
		for(int i=0; i<50; i++) {
			Score[i] = (int)(Math.random()*100);
			System.out.print(i + " : " +Score[i]+" | ");
			
			// i�� 10�� ����� ������ ���� ���� ���.
			if(((i+1) % 10) == 0) {
				System.out.print("\n");
			}
		}
		System.out.print("\n");
		
		
		//��ü ������ ���Ͽ� ��� ���� ���.
		for(int i=0; i<50; i++) {
			totalScore += Score[i];
		}
		
		System.out.println("��� ���� : " + totalScore/50);
		
	}
}
