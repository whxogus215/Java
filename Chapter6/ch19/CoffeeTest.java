package ch19;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Coffee etiopiaCoffee = new EtiopiaAmericano(); // ������Ʈ ����
		etiopiaCoffee.brewing();
		
		System.out.println();
		Coffee etiopiaLatte = new Latte(etiopiaCoffee); // ���δ� ���� (Decorator ����)
		etiopiaLatte.brewing(); 
		
		System.out.println();
		Coffee mochaEtiopia = new Mocha(new Latte(etiopiaCoffee));
		mochaEtiopia.brewing();
		
		System.out.println();
		Coffee KenyaCoffee = new WhippingCream(new Mocha(new Latte(new KenyaAmericano())));
		KenyaCoffee.brewing();
		
	}

}
