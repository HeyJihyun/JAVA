package kr.ac.kopo.day20;

import java.io.Serializable;

/*
 
  alt + shift + s 누른 후 c : 기본생성자
  alt + shift + s 누른 후 o : 매개변수 가지고 있는 생성자 
  alt + shift + s 누른 후 r : getter setter
  alt + shift + s 누른 후 s : toString
 */

public class UserInfo implements Serializable {

	private String name;
	private int age;
	private String phone;

	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserInfo(String name, int age, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}
	
	

}
