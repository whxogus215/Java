package ch01;

// ���� Ʋ��
public class Prob1 {
	
	public static void main(String args[]) {
		
		int[] array = {10,55,23,2,79,101,16,82,30,45};
		
		int min=array[0];
		int max=array[0];
		int minPos=0;
		int maxPos=0;
		for ( int i =0; i<array.length-1; i++) {
			
			if (min > array[i]) {
				min = array[i];
				minPos = i+1;
			}
			if (max < array[i]) {
				max = array[i];
				maxPos = i+1;
			}
			
			
		}
		
		System.out.println("���� ū ���� " + max + " �̰�, ��ġ�� " + maxPos + " �Դϴ�.");
		System.out.println("���� ���� ���� " + min + " �̰�, ��ġ�� " + minPos + " �Դϴ�.");
		
		
		
		
		
		
	}
	

}
