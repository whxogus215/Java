package ch01;


class OutClass{
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	// OutClass가 생성될 떄 InClass가 생성된다. -> InClass의 메서드(inTest)를 사용할 수 있다.
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass{
		
		int iNum = 100;
		
		void inTest() {
			
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass iNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
		}
	}
	// usingClass는 외부 클래스의 메서드이므로, 내부 클래스의 메서드를 사용할 수 있다.
	public void usingClass() {
		inClass.inTest();
	}
	
	static class InStaticClass {
		
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			
			System.out.println("InClass num = " + iNum + "(내부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass iNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
		}
		
		static void sTest() {
			
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass iNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
			
		}
	}
}
public class InnerTest {

	public static void main(String[] args) {
		
		/*
		OutClass outClass = new OutClass(); // 내부적으로 InClass 생성.
		outClass.usingClass();
		*/
		
		// OutClass의 생성 없이도 정적 내부 클래스이므로 바로 생성 가능!
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		System.out.println();
		
		OutClass.InStaticClass.sTest();
	}

}
