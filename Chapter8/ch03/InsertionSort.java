package ch03;

public class InsertionSort {
	
	public static void insertionSort(int[] arr, int count) {
		// i는 비교 대상, j는 삽입 위치
		int i =0, j =0;
		int temp = 0; // temp는 비교 값
		
		for(i =1; i<count;i++) {
			temp = arr[i];
			j = i;
			while((j>0) && arr[j-1]>temp) {
				arr[j] = arr[j-1]; // 한 칸씩 밀려나감
				j--;
			}
			arr[j] = temp;  // 밀려나감이 끝난 후, 마지막에 삽입된 위치에 삽입되어야 할 temp 값으로 바꿔줌!
			

			System.out.println("반복 -" + i);
			printSort(arr, count);
			
		}
	}
	
	public static void printSort(int value[], int count) {
		int i =0;
		for(i = 0; i< count; i++) {
			System.out.print(value[i] + "\t");
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {80, 50, 70, 10, 60, 20, 40, 30 };
		
		insertionSort(arr,8);
		
	}

}
