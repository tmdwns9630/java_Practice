package java_Practice_week1;
import java.util.Scanner;

/*
//Q. 50���� �л��� ������ �Է��ϰ�, ����� ����ϴ� ���α׷��� �ۼ��ϼ���.

�ǵ�� : 1���� ���������� 4���� ���� ȸ�ſ��� ���迭�� ������� �ʰ�, ��ü ������ ���� �� ����� ����.���� ���� ����� ����ϴ� ��
�־ ���� �迭�� ������ �������� ����, �������� ���ϴ� ��հ��� ����� �� ������, �� �������� ���α׷��� ������ �����
ȸ���� ���̾����ϴ�(���� �׷��� ȸ���� ������ �������� ���ϴ� �ش��� ��� ���� �ּ����� �ڵ带 �ۼ������� �ϴ� �ǵ���
������ �ָ� ���ڽ��ϴ�.).
*/

//Score ���� �ϳ��� �����ؼ� ������ �Է� �ް�, �̸� totalScore�� �ٷ� �����ǰ� �����ϰ�, �Է��� ������ double������ ����ȯ�Ͽ� ��հ� ���.
public class quest4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Score;
		int totalScore = 0;
		int limit = 10;
		
		//50���� ������ �Է�.
		try (Scanner sc = new Scanner(System.in)) {
			for(int i=0; i<limit; i++) {
				System.out.printf("%d��° �� : ", i);
				Score = sc.nextInt();
				totalScore += Score;
			}
			System.out.println("��� ���� : " + (double)totalScore/limit);
		}
	}
}
