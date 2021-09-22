package ch09;

public class BruteForceSearch {
	
	
	public static void main(String[] args) {
		int[] bills = {1,2,5,10,20,50};
		
		int count = 0;
		int money = 100;
		int i0, i1, i2, i3, i4;
		
		// 100만원에서 만원짜리를 0개 쓸때, 1개 쓸때, 2개 쓸때 ... 100개 쓸때의 경우에서 시작! -> 또 여러가지의 경우의 수로 갈림! (메커니즘 구조)
		for(i0 = money; i0 >= 0; i0 -= bills[0]) {  // 맨처음 i0 = 100부터 시작 -> 1(bills[0])씩 감소; 100일때, 99일때, 98일때, ... 0이 될 때 까지 아래 반복문 수행!
//			System.out.println(i0);
			for (i1 = i0; i1 >= 0; i1 -= bills[1]) {
//				System.out.println(i1);
				for (i2 = i1; i2 >= 0; i2 -= bills[2]) {
//					System.out.println(i2);
					for (i3 = i2; i3 >= 0; i3 -= bills[3]) {
						System.out.println(i3);
						for (i4 = i3; i4 >= 0; i4 -= bills[4])
							if (i4 % bills[5] == 0) {  // for문이 밑에서부터 위로 올라가면서 실행됨
								count++;
//								System.out.println(i4);
							}
					}
				}
			}

		}
		System.out.println("지불 가능한 가지 수는 : " +  count + "가지 입니다.");
	}

}
