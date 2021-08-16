package ch09;

public class ArrayIndexException {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		try {
		for(int i =0;i<=5;i++) 
			System.out.println(arr[i]);
		}catch(ArrayIndexOutOfBoundsException e) { // Array~~Exception이 발생할 경우 매개변수 e로 넘어옴!
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		
		System.out.println("here!!!");
	
	}

}
