package ch04;

public class MyLinkedList {
	
	private MyListNode head;
	int count; // element ����
	
	public MyLinkedList() {
		head = null;
		count = 0;
	}
	
	public MyListNode addElement(String data) {
		MyListNode newNode;
		
		// data�� ù ��° element�� �Ǵ� ���
		if(head == null) {
			newNode = new MyListNode(data);
			head = newNode;
		}
		else {
			newNode = new MyListNode(data);
			MyListNode temp = head; // head���� Ž�� ����
			while( temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			
		}
		count++;
		return newNode;
		
	}
	
	public MyListNode insertElement(int position, String data) {
		
		int i; //����� ��ġ(index)
		MyListNode tempNode = head;
		MyListNode preNode = null;
		
		MyListNode newNode = new MyListNode(data);
		
		if(position < 0 || position > count) {
			return null;
		}
		
		//head�� ���� ���
		if(position == 0) {
			newNode.next = head;
			head = newNode;
		}
		else {
			for(i =0; i<position; i++) {
				preNode = tempNode; //head ���� Ž�� ����
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
				preNode = tempNode; //head ���� Ž�� ����
				tempNode = tempNode.next;
			}
			
			preNode.next = tempNode.next;
		}
		count--;
		
		return tempNode; // �����Ǵ� ��� ��ȯ
	}
	
	
	

}
