package week2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * 5. �ؽ�Ʈ ������ ������ ȭ�鿡 ����ϴ� ���α׷��� �ۼ��ϼ���.

   --> �ؽ�Ʈ ���ϸ��� ����ڷκ��� �Է¹ްų�, �ҽ� �� ������ �� ���ϸ��� Ȱ���Ѵ�.
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
