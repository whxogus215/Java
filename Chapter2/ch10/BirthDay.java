package ch10;

public class BirthDay {
	
	private int day;  //private 을 사용하는 이유, 객체의 변수의 오남용을 방지하기 위해서
	private int month;
	private int year;
	
	private boolean isValid; //default 값 false
	
	public int getDay() {
		return day;
	}
	// get 메소드는 값을 가져오는(읽어오는) 기능이 있고 이것만을 사용할 수 있을 땐 read-only이다.
	// set 메소드는 값을 설정하는(쓰는) 기능이 있다.
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
			System.out.println( year + "년 " + month + "월 " + day + "일 입니다.");
		}
		else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}
}
