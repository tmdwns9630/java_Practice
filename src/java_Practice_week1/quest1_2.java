package java_Practice_week1;
import java.util.Scanner;

// 1. ���ù�(if��)�� ����Ͽ� ����ڷκ��� �Է� ���� �� �� �� ū ���� ȭ�鿡 ����ϴ� ���α׷��� �ۼ��ϼ���.


public class quest1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0 , b= 0;
		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° �� : ");
		a = sc.nextInt();
		System.out.print("�ι�° �� : ");
		b = sc.nextInt();
		
		System.out.println(Math.max(a, b));
	}

}
