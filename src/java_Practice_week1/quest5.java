package java_Practice_week1;

import java.util.Arrays;
import java.util.Scanner;

//5명의 학생의 이름을 입력 받아서 알파벳 순으로 정렬하는 프로그램을 작성하세요.

//피드백 : “Arrays.sort” 메소드를 사용하지 말고, 직접 배열을 정렬하여 결과를 출력할 수 있도록 프로그램을 수정해 주세요.
public class quest5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stuName = new String[5];
//		
//		try(Scanner sc = new Scanner(System.in)) {
//			for(int i =0;i<5;i++) {
//				System.out.print("학생"+i+": ");
//				stuName[i] = sc.nextLine();
//			}//for
//		}//try
//		
		
		stuName[0] = "Bark";
		stuName[1] = "Genarte";
		stuName[2] = "Harry";
		stuName[3] = "Aniee";
		stuName[4] = "Fourze";
		
//		예상 답안 : Aniee Bark Fourze Genarte Harry 
		
		
		//정렬 전
		System.out.print("정렬 전 : ");
		for(int i = 0; i< stuName.length; i++) {
			System.out.print(stuName[i] + " ");
		}//for
		
		//Arrays 클래스의 sort 메서드를 사용하여 배열 정렬.
		Arrays.sort(stuName);
		
		//정렬 후
		System.out.print("\n정렬 후 : ");
		for(int i = 0; i< stuName.length; i++) {
			System.out.print(stuName[i] + " ");
		}//for
	}//void main
	
	
	//compareTo() 를 사용하여 정렬해보자.
	public void arrSort(String[] str) {
		for(int i = 0; i< str.length-1; i++) {
			for(int j = 0; j<str.length-1-i; j++) {
				
			}
		}
	}
}//class
