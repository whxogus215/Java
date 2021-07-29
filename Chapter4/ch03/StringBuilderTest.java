package ch03;

public class StringBuilderTest {

	public static void main(String[] args) {

		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));
		buffer.append(android);
		System.out.println(System.identityHashCode(buffer));
		
		String test = buffer.toString(); // String 반환
		// buffer는 String 클래스가 아니기 때문에 다른 String 변수에게 String 값을 반환해서 출력해야함.
		System.out.println(test);
	}

}
