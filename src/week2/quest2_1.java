package week2;

//1. �ݺ����� �̿��Ͽ� �ƽ�Ű �ڵ�ǥ�� ȭ�鿡 10����, 16����, ���ڷ� ����ϴ� ���α׷��� �ۼ��ϼ���.
public class quest2_1 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		for(int i =0; i<128; i++) {
			 System.out.format("%3d | 0x%02X | %s\n", i, i,Character.toString(i));
		}
	}
}
