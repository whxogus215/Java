package ch05;

import ch04.MyLinkedList;
import ch04.MyListNode;

interface Queue{
	public void enQueue(String data);
	public String deQueue();
	public void printQueue();
	
}
public class MyLinkedQueue extends MyLinkedList implements Queue{

	MyListNode front;
	MyListNode rear;
	
	@Override
	public void enQueue(String data) {
		
		MyListNode newNode;
		if( isEmpty()) {
			// 값이 맨 처음으로 들어갈 경우
			newNode = addElement(data);
			front = newNode;
			rear = newNode;
		}
		else {
			// 값이 맨 처음으로 들어가지 않을 경우
			newNode = addElement(data);
			rear = newNode;
		}
		
		System.out.println(newNode.getData() + " added");
	}

	@Override
	public String deQueue() {
		
		if(isEmpty()) {
			return null;
		}
		
		String data = front.getData();
		front = front.next;
		
		if( front == null) {
			rear = null;
		}
		
		return data;
	
	}


	@Override
	public void printQueue() {
		
		printAll();
	}

}
