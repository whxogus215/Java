package ch19;

public abstract class Decorator extends Coffee {

	Coffee coffee;
	// ���ڷ����ʹ� ������Ʈ�� �ٸ� ���ڷ����͸� ���ڷ� �޾ƾ� �Ѵ�!
	public Decorator(Coffee coffee) {
		
		this.coffee = coffee;
	}
	
	@Override
	public void brewing() {
		
		coffee.brewing();
	}

}
