package ch01;


class OutClass{
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	// OutClass�� ������ �� InClass�� �����ȴ�. -> InClass�� �޼���(inTest)�� ����� �� �ִ�.
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass{
		
		int iNum = 100;
		
		void inTest() {
			
			System.out.println("OutClass num = " + num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass iNum = " + iNum + "(���� Ŭ������ �ν��Ͻ� ����)");
		}
	}
	// usingClass�� �ܺ� Ŭ������ �޼����̹Ƿ�, ���� Ŭ������ �޼��带 ����� �� �ִ�.
	public void usingClass() {
		inClass.inTest();
	}
	
	static class InStaticClass {
		
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			
			System.out.println("InClass num = " + iNum + "(���� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass iNum = " + sInNum + "(���� Ŭ������ ����ƽ ����)");
		}
		
		static void sTest() {
			
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass iNum = " + sInNum + "(���� Ŭ������ ����ƽ ����)");
			
		}
	}
}
public class InnerTest {

	public static void main(String[] args) {
		
		/*
		OutClass outClass = new OutClass(); // ���������� InClass ����.
		outClass.usingClass();
		*/
		
		// OutClass�� ���� ���̵� ���� ���� Ŭ�����̹Ƿ� �ٷ� ���� ����!
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		System.out.println();
		
		OutClass.InStaticClass.sTest();
	}

}
