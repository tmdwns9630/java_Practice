package java_Practice_week1;

import java.util.Scanner;
//3. 사용자로부터 입력 받은 문자의 개수를 출력하고, 문자열을 소문자와 대문자로 변환하여 출력하는 프로그램을 작성하세요.
// 1) Scanner 객체를 사용해서 문자열을 입력 받고, 2) 입력 받은 문자열 전체를 대문자로 출력하고, 3) 입력 받은 문자열 전체를 소문자로 출력해 주세요.
public class quest3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("텍스트 입력 : ");
			String str = sc.nextLine();
			System.out.println(str.length());
			System.out.println(str.toLowerCase());
			System.out.println(str.toUpperCase());
		}
	}

}
