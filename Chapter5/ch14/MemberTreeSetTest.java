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
		
		Member memberHong = new Member(1004, "ȫ�浿");
		Member memberLee = new Member(1001, "�̼���");
		Member memberKim = new Member(1002, "������");
		Member memberKang = new Member(1003, "������");
		
		memberTreeSet.addMember(memberHong);
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberKang);
		
		
		memberTreeSet.showAllMember();
		*/
		
		TreeSet<String> set = new TreeSet<String>(new MyCompare());
		// �������� �ȿ� MyCompare�� �־������ν� �� ������� ���� String�� Comparable�� �ƴ�
		// MyCompare�� Comparator ����� ����ϰڴٴ� ��!
		set.add("Park");
		set.add("Kim");
		set.add("Lee");
		
		System.out.println(set);
		

	}

}
