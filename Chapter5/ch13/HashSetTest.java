package ch13;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet();
		hashSet.add(new String("������"));
		hashSet.add(new String("�̼���"));
		hashSet.add(new String("ȫ����"));
		hashSet.add(new String("������"));
		hashSet.add(new String("������"));
		
		System.out.println(hashSet);
	}

}
