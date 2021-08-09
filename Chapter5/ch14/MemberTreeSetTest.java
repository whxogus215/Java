package ch14;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		return s1.compareTo(s2) * (-1);
	}
	
	
}

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		/*
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberHong = new Member(1004, "홍길동");
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		
		memberTreeSet.addMember(memberHong);
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberKang);
		
		
		memberTreeSet.showAllMember();
		*/
		
		TreeSet<String> set = new TreeSet<String>(new MyCompare());
		// 생성인자 안에 MyCompare를 넣어줌으로써 비교 방식으로 기존 String의 Comparable이 아닌
		// MyCompare의 Comparator 방식을 사용하겠다는 뜻!
		set.add("Park");
		set.add("Kim");
		set.add("Lee");
		
		System.out.println(set);
		

	}

}
