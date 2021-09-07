package ch03;

public class HeapSort {
	
	private int SIZE; // �迭 ũ��
	private int heapArr[];
	
	public HeapSort() {
		SIZE = 0;
		heapArr = new int [50];
	}
	
	public void insertHeap(int input) {
		int i = ++SIZE; // �迭�� ���� �ϳ� �߰� �����Ƿ� ������ 1 ��
		while((i != 1) && ( input > heapArr[i/2])) { // max heap
			heapArr[i] = heapArr[i/2]; // �� ������
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
		data = heapArr[1]; // ���� ���� ��Ʈ ���� ����, �����Ǿ� return�� ��
		
		temp = heapArr[SIZE]; // �� ������ ���� ��Ʈ ���� �񱳵�!
		SIZE -= 1;
		parent = 1; child = 2; // child�� 2���� ����(��Ʈ�� ���� �ٷ� ��!)
		
		// temp�� ��� ���� ����(parent ��ġ) ã�� �ڵ�
		while(child <= SIZE) {
			if((child < SIZE) && (heapArr[child] < heapArr[child+1])) {
				child++;  // �θ�� �ڽ��� ���� �� �� �ڽ� �� �� ū �ڽİ� ���Ѵٴ� �ڵ�
			}
			if(temp >= heapArr[child]) break; // ������ �� child���� ũ�� �״�� ����
			heapArr[parent] = heapArr[child];  // child�� �� Ŭ ��� parent�� �÷���
			parent = child; // ã������ ��ġ(parent)�� child�� ������
			child *= 2; // child�� ������
		}
			
		heapArr[parent] = temp; // ã�� parent�� ����
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
			System.out.printf("\n ��� : [%d]", data);
		}
	}

}
