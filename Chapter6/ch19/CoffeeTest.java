package ch19;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Coffee etiopiaCoffee = new EtiopiaAmericano(); // 컴포넌트 생성
		etiopiaCoffee.brewing();
		
		System.out.println();
		Coffee etiopiaLatte = new Latte(etiopiaCoffee); // 감싸는 구조 (Decorator 패턴)
		etiopiaLatte.brewing(); 
		
		System.out.println();
		Coffee mochaEtiopia = new Mocha(new Latte(etiopiaCoffee));
		mochaEtiopia.brewing();
		
		System.out.println();
		Coffee KenyaCoffee = new WhippingCream(new Mocha(new Latte(new KenyaAmericano())));
		KenyaCoffee.brewing();
		
	}

}
