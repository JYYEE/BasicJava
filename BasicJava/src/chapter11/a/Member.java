package chapter11.a;

import java.util.Objects;

public class Member {
	private String id;

	public Member(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Member)) {
			return false;
		}
		Member other = (Member) obj;
		return Objects.equals(id, other.id);
	}

}
//@Override
//public boolean equals(Object obj) {
//	if(this == obj) {// super.equals(obj)
//		return true;
//	}
//	if(!(obj instanceof Member)) {
//		return false;
//	}
//	Member member = (Member) obj;
//	return id.equals(member.id);
//}