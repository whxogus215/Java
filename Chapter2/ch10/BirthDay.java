package ch10;

public class BirthDay {
	
	private int day;  //private �� ����ϴ� ����, ��ü�� ������ �������� �����ϱ� ���ؼ�
	private int month;
	private int year;
	
	private boolean isValid; //default �� false
	
	public int getDay() {
		return day;
	}
	// get �޼ҵ�� ���� ��������(�о����) ����� �ְ� �̰͸��� ����� �� ���� �� read-only�̴�.
	// set �޼ҵ�� ���� �����ϴ�(����) ����� �ִ�.
	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if ( month < 1 || month > 12) {
			isValid = false;
		}
		else {
		isValid = true;
		this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate() {
		if(isValid) {
			System.out.println( year + "�� " + month + "�� " + day + "�� �Դϴ�.");
		}
		else {
			System.out.println("��ȿ���� ���� ��¥�Դϴ�.");
		}
	}
}
