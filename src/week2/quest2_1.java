package week2;

//1. 반복문을 이용하여 아스키 코드표를 화면에 10진수, 16진수, 문자로 출력하는 프로그램을 작성하세요.
public class quest2_1 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		for(int i =0; i<128; i++) {
			 System.out.format("%3d | 0x%02X | %s\n", i, i,Character.toString(i));
		}
	}
}
