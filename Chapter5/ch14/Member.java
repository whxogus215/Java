package ch14;

import java.util.Comparator;

public class Member implements Comparator<Member>{
	
	private int memberId;
	private String memberName;
	
	public Member() {};
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	
		
	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		
		if( obj instanceof Member ) {
			Member member = (Member)obj;
			if( this.memberId == member.memberId) {
				return true;
			}
			else return false;
		}
		else return false;
	}

	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}

	@Override
	public int compare(Member member1, Member member2) {
		return (member1.memberId - member2.memberId);
	}

//	@Override //이미 저장되어 있는 Id와 새로 들어온 Id와 비교하는 함수
//	public int compareTo(Member member) {
//		
//		/*
//		if(this.memberId > member.memberId) {
//			return 1;
//		}
//		else if(this.memberId < member.memberId) {
//			return -1;
//		}
//		else return 0;
//		*/
//		
////		return (this.memberId - member.memberId); // 큰놈이 오른쪽 작은놈이 왼쪽
//		return (this.memberId - member.memberId) * (-1); // 큰놈이 왼쪽 작은놈이 오른쪽
//		
//		
//	} 
	
	
	

}
