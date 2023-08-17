package chapter08.b;

import java.util.Arrays;

public class SortingMemberExample {
	public static void main(String[] args) {
		Member[] members = new Member[5];
		members[0] = new Member("구기현", 20);
		members[1] = new Member("정재균", 26);
		members[2] = new Member("이성일", 31);
		members[3] = new Member("전다미", 19);
		members[4] = new Member("황지현", 35);
		
		for(Member member : members) {
			System.out.println(member);
		}
		System.out.println();
		
		Arrays.sort(members);
		for(Member member : members) {
			System.out.println(member);
		}
		
	}
}
