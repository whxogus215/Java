package ch18;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company company1 = Company.getInstance(); // static으로 선연된 메서드 이므로 new (인스턴스 생성) 없이 바로 클래스 이름으로 사용이 가능하다.
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);
		
		Calendar calendar = Calendar.getInstance(); // 싱글 톤 패턴의 예
	}

}
