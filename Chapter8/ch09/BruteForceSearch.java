package ch09;

public class BruteForceSearch {
	
	
	public static void main(String[] args) {
		int[] bills = {1,2,5,10,20,50};
		
		int count = 0;
		int money = 100;
		int i0, i1, i2, i3, i4;
		
		// 100�������� ����¥���� 0�� ����, 1�� ����, 2�� ���� ... 100�� ������ ��쿡�� ����! -> �� ���������� ����� ���� ����! (��Ŀ���� ����)
		for(i0 = money; i0 >= 0; i0 -= bills[0]) {  // ��ó�� i0 = 100���� ���� -> 1(bills[0])�� ����; 100�϶�, 99�϶�, 98�϶�, ... 0�� �� �� ���� �Ʒ� �ݺ��� ����!
//			System.out.println(i0);
			for (i1 = i0; i1 >= 0; i1 -= bills[1]) {
//				System.out.println(i1);
				for (i2 = i1; i2 >= 0; i2 -= bills[2]) {
//					System.out.println(i2);
					for (i3 = i2; i3 >= 0; i3 -= bills[3]) {
						System.out.println(i3);
						for (i4 = i3; i4 >= 0; i4 -= bills[4])
							if (i4 % bills[5] == 0) {  // for���� �ؿ������� ���� �ö󰡸鼭 �����
								count++;
//								System.out.println(i4);
							}
					}
				}
			}

		}
		System.out.println("���� ������ ���� ���� : " +  count + "���� �Դϴ�.");
	}

}
