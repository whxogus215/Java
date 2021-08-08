package ch13;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberKang);
		
		Member memberHong = new Member(1003, "홍길동"); // Id 중복으로 Set에 추가 안됨!
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember();
		
		System.out.println(memberLee.hashCode());
		System.out.println(memberKim.hashCode());
		System.out.println(memberKang.hashCode());
		

	}

}
