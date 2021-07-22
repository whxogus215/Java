package ch09;

public class Desktop extends Computer {

	@Override
	public void display() {
		System.out.println("Desktop display");
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing");
	}

	@Override
	public void turnOff() {
		System.out.println("Desktop turnOff");
	}
	
	public void turnOnOff() {
		System.out.println("Desktop On Off");
	}
	
	
	
}
