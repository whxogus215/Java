package ch20;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int total = 0;
		
		for(int i = 0, num =1; i<arr.length ; i++) {
			arr[i] = num++;
		}
		
		for( int num : arr) {
			total += num;
		} // 향상된 for 문 (배열 요소의 처음부터 끝까지 돌 때)
		
		System.out.println(total);
 	}
	

}
