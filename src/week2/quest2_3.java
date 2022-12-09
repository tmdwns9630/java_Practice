package week2;
/*
 * 3. 문자열 "Rotation"을 변수(배열, String 등 자료형은 각자 선택)에 입력하고, 반복문을 이용하여 다음과 같이 출력하는 프로그램을 작성하세요.

   [1]Rotation // 0 1 2 3 4 5 6 7 

   [2]otationR // 1 2 3 4 5 6 7 0 

   [3]tationRo//  2 3 4 5 6 7 0 1
				// s 
   [4]ationRot

   [5]tionRota

   [6]ionRotat

   [7]onRotati

   [8]nRotatio

 */
public class quest2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Rotation";
		
		for(int i=0; i<str.length();i++) {
			System.out.format("[%d]",i+1);
			
			for(int j = i; j<str.length();j++) {
				System.out.print(str.charAt(j));
			}
		
			for(int t = 0 ; t< i;t++) {
				System.out.print(str.charAt(t));
			}
			
	
			System.out.println();
		}
	}

}
