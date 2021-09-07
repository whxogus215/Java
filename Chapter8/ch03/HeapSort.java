package ch03;

public class HeapSort {
	
	private int SIZE; // 배열 크기
	private int heapArr[];
	
	public HeapSort() {
		SIZE = 0;
		heapArr = new int [50];
	}
	
	public void insertHeap(int input) {
		int i = ++SIZE; // 배열에 값이 하나 추가 됐으므로 사이즈 1 업
		while((i != 1) && ( input > heapArr[i/2])) { // max heap
			heapArr[i] = heapArr[i/2]; // 값 내리기
			i = i/2;
		}
		heapArr[i] = input;
	}
	
	public int getHeapSize() {
		return SIZE;
	}
	
	public int deleteHeap() {
		int parent, child;
		int data, temp;
		data = heapArr[1]; // 제일 먼저 루트 값과 비교함, 삭제되어 return될 값
		
		temp = heapArr[SIZE]; // 맨 마지막 값이 루트 값과 비교됨!
		SIZE -= 1;
		parent = 1; child = 2; // child는 2부터 시작(루트의 왼쪽 바로 밑!)
		
		// temp를 어디에 넣을 건지(parent 위치) 찾는 코드
		while(child <= SIZE) {
			if((child < SIZE) && (heapArr[child] < heapArr[child+1])) {
				child++;  // 부모와 자식을 비교할 때 두 자식 중 더 큰 자식과 비교한다는 코드
			}
			if(temp >= heapArr[child]) break; // 비교했을 때 child보다 크면 그대로 놔둠
			heapArr[parent] = heapArr[child];  // child가 더 클 경우 parent로 올려줌
			parent = child; // 찾으려는 위치(parent)는 child로 내려감
			child *= 2; // child로 내려감
		}
			
		heapArr[parent] = temp; // 찾은 parent에 삽입
		return data;
	}
	
	public void printHeap() {
		System.out.printf("\n Max Heap : ");
		for(int i =1;i<=SIZE;i++) {
			System.out.printf("[%d] ", heapArr[i]);
		}
	}
	public static void main(String[] args) {
		HeapSort h = new HeapSort();
		h.insertHeap(80);
		h.insertHeap(50);
		h.insertHeap(70);
		h.insertHeap(10);
		h.insertHeap(60);
		h.insertHeap(20);
		
		h.printHeap();
		
		int n, data;
		n = h.getHeapSize();
		for(int i =1;i<=n;i++) {
			data = h.deleteHeap();
			System.out.printf("\n 출력 : [%d]", data);
		}
	}

}
