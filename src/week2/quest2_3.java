package week2;
/*
 * 3. ���ڿ� "Rotation"�� ����(�迭, String �� �ڷ����� ���� ����)�� �Է��ϰ�, �ݺ����� �̿��Ͽ� ������ ���� ����ϴ� ���α׷��� �ۼ��ϼ���.

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
