package java_Practice_week1;
import java.util.Scanner;

// 1. 선택문(if문)을 사용하여 사용자로부터 입력 받은 두 수 중 큰 수를 화면에 출력하는 프로그램을 작성하세요.


public class quest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0 , b= 0;
		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 값 : ");
		a = sc.nextInt();
		System.out.print("두번째 값 : ");
		b = sc.nextInt();
		
		if(a > b) {
			System.out.println("a = "+a);
		}else if(a < b) {
			System.out.println("b = "+b);
		}else {
			System.out.println("a == b");
		}
	}

}
