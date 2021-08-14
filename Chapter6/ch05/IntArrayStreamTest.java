package ch05;

import java.util.Arrays;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		for (int num : arr) {
			System.out.println(num);
		}
		
		int sumVal = Arrays.stream(arr).sum();
		long count = Arrays.stream(arr).count();
		
		System.out.println();
		
		System.out.println(sumVal);
		System.out.println(count);
		
		System.out.println();
		Arrays.stream(arr).forEach(n->System.out.println(n));
	}

}
