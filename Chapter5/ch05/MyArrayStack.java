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
		//추가하기 전에 Array가 꽉 찼는지 확인!
		if(isFull()) {
			System.out.println("stack is full");
			return;
		}
		arrayStack.addElement(data);
		top++; // top은 count와 같음 (위치는 top-1)
	}
	
	public int pop() {
		//삭제하기 전에 Array가 비어있는지 확인!
		if(isEmpty()) {
			System.out.println("stack is empty");
			return MyArray.ERROR_NUM;
		}
		
		return arrayStack.removeElement(--top);
		
	}
	
	public int peek() {
		// 삭제가 아닌 잠깐 꺼내서 보는 것
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
