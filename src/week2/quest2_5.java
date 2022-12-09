package week2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * 5. 텍스트 파일의 내용을 화면에 출력하는 프로그램을 작성하세요.

   --> 텍스트 파일명을 사용자로부터 입력받거나, 소스 상에 정의해 둔 파일명을 활용한다.
 */

public class quest2_5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(
	            new FileReader("./src/week2/textFile.txt")
	        );
	 
	        String str;
	        while ((str = reader.readLine()) != null) {
	            System.out.println(str);
	        }
	 
	        reader.close();
	}

}
