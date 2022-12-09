package week2;

import java.util.Scanner;

/*
 * 4. 사용자로부터 스네이크 표기법(Snake Case)의 문자열을 입력받고, 카멜 표기법(Camel Case)과 파스칼 표기법(Pascal Case)으로 출력하는 프로그램을 작성하세요.

   --> 입력받은 문자열(TOTAL_NUMBER)을 카멜 표기법(totalNumber)과 파스칼 표기법 표기법(TotalNumber)으로 출력한다.
	- snake_case, camelCase, PascalCase
 
 * */

public class quest2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("Input snake_case : ");
			String snake = sc.nextLine();
			
			System.out.println("snake_case : "+snake);
			System.out.println("kamelCase : "+snakeToKamel(snake));
			System.out.println("PascalCase : "+snakeToPascal(snake));
			
		}
	}
	
	
	public static String snakeToKamel(String str) {
		String kamel = "";
		char snake = 95;

		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			//System.out.format("%d : %c\n", i, ch);
			if(ch  == snake) {
				//System.out.println("case on");
				i++;
				ch = str.charAt(i);
				kamel = kamel + Character.toUpperCase(ch);
			}else {
				kamel = kamel +ch;
			}
		}
		return kamel;
	}
	
	public static String snakeToPascal(String str) {
		String kamel = "";
		char ch = str.charAt(0);
		char snake = 95;
		kamel = kamel + Character.toUpperCase(ch);
		
		for(int i = 1; i < str.length(); i++) {
			ch = str.charAt(i);
			//System.out.format("%d : %c\n", i, ch);
			if(ch  == snake) {
				//System.out.println("case on");
				i++;
				ch = str.charAt(i);
				kamel = kamel + Character.toUpperCase(ch);
			}else {
				kamel = kamel +ch;
			}
		}
		return kamel;
	}

}

/*
 * 출력결과
Input snake_case : java_practice
snake_case : java_practice
kamelCase : javaPractice
PascalCase : JavaPractice
 */
