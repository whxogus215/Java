package ch11;

public abstract class Calculator implements Calc {
	// 네 개 중 두 개 만 구현하기 때문에 이는 추상 클래스이다.
	
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
	
	public void sex() {
		
	}

	

}
