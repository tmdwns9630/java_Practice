package java_Practice_week1;

import java.util.Arrays;
import java.util.Scanner;

//5���� �л��� �̸��� �Է� �޾Ƽ� ���ĺ� ������ �����ϴ� ���α׷��� �ۼ��ϼ���.

//�ǵ�� : ��Arrays.sort�� �޼ҵ带 ������� ����, ���� �迭�� �����Ͽ� ����� ����� �� �ֵ��� ���α׷��� ������ �ּ���.
public class quest5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stuName = new String[5];
//		
//		try(Scanner sc = new Scanner(System.in)) {
//			for(int i =0;i<5;i++) {
//				System.out.print("�л�"+i+": ");
//				stuName[i] = sc.nextLine();
//			}//for
//		}//try
//		
		
		stuName[0] = "Bark";
		stuName[1] = "Genarte";
		stuName[2] = "Harry";
		stuName[3] = "Aniee";
		stuName[4] = "Fourze";
		
//		���� ��� : Aniee Bark Fourze Genarte Harry 
		
		
		//���� ��
		System.out.print("���� �� : ");
		for(int i = 0; i< stuName.length; i++) {
			System.out.print(stuName[i] + " ");
		}//for
		
		//Arrays Ŭ������ sort �޼��带 ����Ͽ� �迭 ����.
		Arrays.sort(stuName);
		
		//���� ��
		System.out.print("\n���� �� : ");
		for(int i = 0; i< stuName.length; i++) {
			System.out.print(stuName[i] + " ");
		}//for
	}//void main
	
	
	//compareTo() �� ����Ͽ� �����غ���.
	public void arrSort(String[] str) {
		for(int i = 0; i< str.length-1; i++) {
			for(int j = 0; j<str.length-1-i; j++) {
				
			}
		}
	}
}//class
