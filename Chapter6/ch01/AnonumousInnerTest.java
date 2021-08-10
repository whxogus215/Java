package ch01;


class Outer2{
	
	int outNum = 100;
	static int sNum = 200;
	
	// Runnable은 인터페이스이다.
	Runnable getRunnable( int i) {
			
		int num = 10;
		
		return new Runnable(){
			
			int localNum = 1000;
			@Override
			public void run() {
				
//				i = 50;    final이므로 값을 변경할 수 없음 (상수화)
//				num = 20;
				
				System.out.println("i =" + i); 
				System.out.println("num = " +num);  
				System.out.println("localNum = " +localNum);
					
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");

			}
		};
		
	}
	
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			
			System.out.println("Runnable class");
		}
	};
}
public class AnonumousInnerTest {

	public static void main(String[] args) {
		
		Outer2 out = new Outer2();
		Runnable runner = out.getRunnable(100);
		
		runner.run();
		
		out.runnable.run();
	}

}
