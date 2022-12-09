package week2;

import java.util.Scanner;

/*
 * 4. ����ڷκ��� ������ũ ǥ���(Snake Case)�� ���ڿ��� �Է¹ް�, ī�� ǥ���(Camel Case)�� �Ľ�Į ǥ���(Pascal Case)���� ����ϴ� ���α׷��� �ۼ��ϼ���.

   --> �Է¹��� ���ڿ�(TOTAL_NUMBER)�� ī�� ǥ���(totalNumber)�� �Ľ�Į ǥ��� ǥ���(TotalNumber)���� ����Ѵ�.
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
 * ��°��
Input snake_case : java_practice
snake_case : java_practice
kamelCase : javaPractice
PascalCase : JavaPractice
 */
