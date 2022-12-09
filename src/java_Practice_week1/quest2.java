package java_Practice_week1;

import java.util.Scanner;

/*
2. ����ڷκ��� �����͸� �Է� �ް�, �Է� ���� �����͸� ����ϴ� ���α׷��� �ۼ��ϼ���.
(��, �Է� ���� �����Ͱ� Q �Ǵ� q �̸�, ���α׷� �����ϰ�, �׷��� �ʴٸ� ��� �����͸� �Է� �޴´�.)
*/
public class quest2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String a;
		while(true) {
			System.out.print("input : ");
			a = sc.next();
			System.out.println(String.format("output : %s",a));
			
			
			if(a.contentEquals("q") || a.contentEquals("Q")){
				System.out.println("Code Exit");
				System.out.println(a);
				break;
			}
		}
	}

}
