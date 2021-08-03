package ch04;

public class MyLinkedList {
	
	private MyListNode head;
	int count; // element 개수
	
	public MyLinkedList() {
		head = null;
		count = 0;
	}
	
	public MyListNode addElement(String data) {
		MyListNode newNode;
		
		// data가 첫 번째 element가 되는 경우
		if(head == null) {
			newNode = new MyListNode(data);
			head = newNode;
		}
		else {
			newNode = new MyListNode(data);
			MyListNode temp = head; // head부터 탐색 시작
			while( temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			
		}
		count++;
		return newNode;
		
	}
	
	public MyListNode insertElement(int position, String data) {
		
		int i; //요소의 위치(index)
		MyListNode tempNode = head;
		MyListNode preNode = null;
		
		MyListNode newNode = new MyListNode(data);
		
		if(position < 0 || position > count) {
			return null;
		}
		
		//head로 들어가는 경우
		if(position == 0) {
			newNode.next = head;
			head = newNode;
		}
		else {
			for(i =0; i<position; i++) {
				preNode = tempNode; //head 부터 탐색 시작
				tempNode = tempNode.next;
			}
			
			newNode.next = preNode.next;
			preNode.next = newNode;
		}
		
		count++;
		return newNode;
	}
	
	public MyListNode removeElement(int position) {
		int i;
		MyListNode tempNode = head;
		MyListNode preNode = null;
		
		if(position == 0) {
			head = tempNode.next;
		}
		else {
			for(i =0; i<position; i++) {
				preNode = tempNode; //head 부터 탐색 시작
				tempNode = tempNode.next;
			}
			
			preNode.next = tempNode.next;
		}
		count--;
		
		return tempNode; // 삭제되는 노드 반환
	}
	
	
	

}
