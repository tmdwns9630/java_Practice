package week2;

/*
 * 2. �������� 2�ܺ��� 5�ܱ����� �ݺ����� �̿��Ͽ� ������ ���� ����ϴ� ���α׷��� �ۼ��ϼ���.

    2 * 1 =  2   3 * 1 =  3            4 * 1 =  4             5 * 1 =  5

    2 * 2 =  4   3 * 2 =  6            4 * 2 =  8             5 * 2 = 10

    .

    .

    2 * 9 = 18    3 * 9 = 27             4 * 9 = 36             5 * 9 = 45*/

public class quest2_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			for(int i =2; i<6; i++) {
				for(int j=1; j<10; j++) {
					System.out.format("%d * %d = %2d\n",i, j, i*j );
				}
				System.out.println();
			}
		}
	}
