package ch18;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company company1 = Company.getInstance(); // static���� ������ �޼��� �̹Ƿ� new (�ν��Ͻ� ����) ���� �ٷ� Ŭ���� �̸����� ����� �����ϴ�.
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);
		
		Calendar calendar = Calendar.getInstance(); // �̱� �� ������ ��
	}

}
