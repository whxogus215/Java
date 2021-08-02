package ch02;

public class MyArray {
	
	int[] intArr;
	int count;   // element�� ����
	
	public int ARRAY_SIZE;
	public static final int ERROR_NUM = -999999999;
	
	public MyArray()
	{
		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
		
	}
	
	// ����� ���� �Է��ϴ� ���_Constructor OverLoading
	public MyArray(int size)
	{
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[size];
	}
	
	public void addElement(int num) // element�� �迭�� �߰��ϴ� �޼���
	{
		// count = 0���� ���� (0 ��°)
		if(count >= ARRAY_SIZE) {
			System.out.println("not enough memory");
			return;
		}
		intArr[count++] = num;
	}
	
	public void insertElement(int position, int num) // element�� �迭 �߰��� �����ϴ� �޼��� (�� element�� �о��ִ� ����� �����Ǿ�� ��)
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
		count++; // element�� �ϳ� ���������Ƿ� ��� ������ ����!
		
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
		count--; // element�� �ϳ� ���������Ƿ� ��� ������ ����!
		
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
