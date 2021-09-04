package ch01;

// ���� Ʋ��
public class Prob2 {
	
	public static void main(String args[]) {
		
		int[] array = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};
		
		int target = 83;
		
		// ����Ž�� ���ذ� �ʱ�ȭ
		int left = 0;
		int right = array.length-1; // index = 9
		int mid = array.length/2;
		
		int temp = array[mid]; // temp�� �ӽ�(��) ���� ����� �� ���� ���� �ǹ�!
		boolean find = false; // ����Ž���� ���� ������ Ȯ���ϱ� ���� ����!, Ÿ�ٰ��� Ž���Ǿ��� ���� true�� ����ǹǷ� default ���� false�̾�� �Ѵ�.
		
		while (left <= right) {
			
			if (target == temp) {
				find = true;
				break; // target == temp�� ��� mid �� temp ���� �������� �ʰ�, while���� �ٷ� ��������!
			}
			else if (target < temp) {
				right = mid-1;
			}
			else {
				left = mid+1;
			}
			mid = (left+right)/2; // left or right �� ���� ���� mid �� �缳��
			temp = array[mid]; // �񱳰� �缳��
		}
		
		if (find == true) {
			mid++; // mid�� array�� Index ���̱� ����!
			System.out.println("ã�� ���� " + mid +  "��° �ֽ��ϴ�.");
		}
		else System.out.println("ã�� ���� �����ϴ�.");
	}
}
