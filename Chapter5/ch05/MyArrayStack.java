package ch05;

import ch02.MyArray;

public class MyArrayStack {

	MyArray arrayStack;
	int top;
	
	public MyArrayStack() {
		top =0;
		arrayStack = new MyArray();
		
	}
	
	public MyArrayStack(int size) {
		top =0;
		arrayStack = new MyArray(size);
		
	}
	
	public void push(int data) {
		//�߰��ϱ� ���� Array�� �� á���� Ȯ��!
		if(isFull()) {
			System.out.println("stack is full");
			return;
		}
		arrayStack.addElement(data);
		top++; // top�� count�� ���� (��ġ�� top-1)
	}
	
	public int pop() {
		//�����ϱ� ���� Array�� ����ִ��� Ȯ��!
		if(isEmpty()) {
			System.out.println("stack is empty");
			return MyArray.ERROR_NUM;
		}
		
		return arrayStack.removeElement(--top);
		
	}
	
	public int peek() {
		// ������ �ƴ� ��� ������ ���� ��
		if(isEmpty()) {
			System.out.println("stack is empty");
			return MyArray.ERROR_NUM;
		}
		
		return arrayStack.getElement(--top);
		
	}
	public boolean isFull() {
		if(top == arrayStack.ARRAY_SIZE) {
			return true;
		}
		else return false;
	}
	
	public boolean isEmpty() {
		if (top ==0) {
			return true;
		}
		else return false;
	}
	
	public void printAll() {
		arrayStack.printAll();
	}
}