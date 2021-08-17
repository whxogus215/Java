package ch10;

public class PassWordException extends Exception{
	
	public PassWordException(String message) {
		super(message); // 부모 클래스인 Exception의 메서드를 의미!
	}

}
