package ch13;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "�̼���");
		Member memberKim = new Member(1002, "������");
		Member memberKang = new Member(1003, "������");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberKang);
		
		Member memberHong = new Member(1003, "ȫ�浿"); // Id �ߺ����� Set�� �߰� �ȵ�!
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember();
		
		System.out.println(memberLee.hashCode());
		System.out.println(memberKim.hashCode());
		System.out.println(memberKang.hashCode());
		

	}

}
