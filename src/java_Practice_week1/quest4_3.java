package java_Practice_week1;

import java.util.Scanner;

/*
//50���� �л��� ������ �Է��ϰ�, ����� ����ϴ� ���α׷��� �ۼ��ϼ���.

1���� ���������� 4���� ���� ȸ�ſ��� ���迭�� ������� �ʰ�, ��ü ������ ���� �� ����� ����.���� ���� ����� ����ϴ� ��

�־ ���� �迭�� ������ �������� ����, �������� ���ϴ� ��հ��� ����� �� ������, �� �������� ���α׷��� ������ �����

ȸ���� ���̾����ϴ�(���� �׷��� ȸ���� ������ �������� ���ϴ� �ش��� ��� ���� �ּ����� �ڵ带 �ۼ������� �ϴ� �ǵ���

������ �ָ� ���ڽ��ϴ�.).
*/

public class quest4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Score = new int[50];
		int totalScore = 0;
		
		//50���� ������ �Է�.
		try (Scanner sc = new Scanner(System.in)) {
			for(int i=0; i<50; i++) {
				System.out.printf("%d��° �� : ", i);
				Score[i] = sc.nextInt();
			}
		}
		
		//�Է��� ������ ���.
		for(int i=0; i<50; i++) {
			System.out.print(i + " : " +Score[i]+" | ");
			
			// i�� 10�� ����� ������ ���� ���� ���.
			if(((i+1) % 10) == 0) {
				System.out.print("\n");
			}
		}
		
		//��ü ������ ���Ͽ� ��� ���� ���.
		for(int i=0; i<50; i++) {
			totalScore += Score[i];
		}
		System.out.println("��� ���� : " + totalScore/50);

	}
	
	
}