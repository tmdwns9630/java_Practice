package java_Practice_week1;

import java.util.Scanner;
//3. ����ڷκ��� �Է� ���� ������ ������ ����ϰ�, ���ڿ��� �ҹ��ڿ� �빮�ڷ� ��ȯ�Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
// 1) Scanner ��ü�� ����ؼ� ���ڿ��� �Է� �ް�, 2) �Է� ���� ���ڿ� ��ü�� �빮�ڷ� ����ϰ�, 3) �Է� ���� ���ڿ� ��ü�� �ҹ��ڷ� ����� �ּ���.
public class quest3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("�ؽ�Ʈ �Է� : ");
			String str = sc.nextLine();
			System.out.println(str.length());
			System.out.println(str.toLowerCase());
			System.out.println(str.toUpperCase());
		}
	}

}
