package ch02;

public class MyArray {
	
	int[] intArr;
	int count;   // element의 개수
	
	public int ARRAY_SIZE;
	public static final int ERROR_NUM = -999999999;
	
	public MyArray()
	{
		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
		
	}
	
	// 사이즈를 직접 입력하는 경우_Constructor OverLoading
	public MyArray(int size)
	{
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[size];
	}
	
	public void addElement(int num) // element를 배열에 추가하는 메서드
	{
		// count = 0에서 시작 (0 번째)
		if(count >= ARRAY_SIZE) {
			System.out.println("not enough memory");
			return;
		}
		intArr[count++] = num;
	}
	
	public void insertElement(int position, int num) // element를 배열 중간에 삽입하는 메서드 (옆 element를 밀어주는 기능이 구현되어야 함)
	{
		int i;
		
		if(position < 0 || position > count) {
			
			return;
		}
		
		if (count>=  ARRAY_SIZE) {
			return ;
		}
		
		for( i = count - 1; i>=position; i--) {
			intArr[i+1] = intArr[i];
			
		}
		
		intArr[position] = num;
		count++; // element를 하나 삽입했으므로 요소 개수는 증가!
		
	}
	
	public int removeElement(int position)
	{
		int ret = ERROR_NUM;
		
		if( isEmpty()) {
			System.out.println("Array is empty");
			return ret;
		}
		
		if( position <0 || position > count-1) {
			return ret;
		}
		
		ret = intArr[position];
		
		for(int i = position; i<count-1 ; i++) {
			intArr[i] = intArr[i+1];
		}
		count--; // element를 하나 삭제했으므로 요소 개수는 감소!
		
		return ret;
	}
	
	public int getSize() {
		return count;
	}
	
	public boolean isEmpty() {
		if(count == 0) {
			return true;
		}
		else return false;
	}
	
}
