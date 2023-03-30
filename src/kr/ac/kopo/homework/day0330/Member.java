package kr.ac.kopo.homework.day0330;

public class Member {
	
	private String id;
	private String password;
	
	Member(){}
	
	Member(String id){
		this(id, "");
	}
	
	Member(String id, String password){
		this.id = id;
		this.password = password;
	}

	//getter
	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	//setter
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	

}
