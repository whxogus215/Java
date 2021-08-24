package ch19;

public abstract class Decorator extends Coffee {

	Coffee coffee;
	// 데코레이터는 컴포넌트나 다른 데코레이터를 인자로 받아야 한다!
	public Decorator(Coffee coffee) {
		
		this.coffee = coffee;
	}
	
	@Override
	public void brewing() {
		
		coffee.brewing();
	}

}
