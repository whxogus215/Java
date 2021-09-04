package ch01;

// 문제 틀림
public class Prob2 {
	
	public static void main(String args[]) {
		
		int[] array = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};
		
		int target = 83;
		
		// 이진탐색 기준값 초기화
		int left = 0;
		int right = array.length-1; // index = 9
		int mid = array.length/2;
		
		int temp = array[mid]; // temp는 임시(비교) 값을 사용할 때 쓰는 변수 의미!
		boolean find = false; // 이진탐색의 성공 유무를 확인하기 위한 변수!, 타겟값이 탐색되었을 때만 true로 변경되므로 default 값은 false이어야 한다.
		
		while (left <= right) {
			
			if (target == temp) {
				find = true;
				break; // target == temp일 경우 mid 및 temp 값을 변경하지 않고, while문을 바로 빠져나옴!
			}
			else if (target < temp) {
				right = mid-1;
			}
			else {
				left = mid+1;
			}
			mid = (left+right)/2; // left or right 값 변경 이후 mid 값 재설정
			temp = array[mid]; // 비교값 재설정
		}
		
		if (find == true) {
			mid++; // mid는 array의 Index 값이기 때문!
			System.out.println("찾는 수는 " + mid +  "번째 있습니다.");
		}
		else System.out.println("찾는 수가 없습니다.");
	}
}
