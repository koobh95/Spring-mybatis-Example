package com.tistory.ku_develog.dto;

public class MemberDTO {
	private String id, name;
	private int age;
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return new StringBuilder().append("{id=").append(id).append(", name=")
				.append(name).append(", age=").append(age).append("}").toString();
	}
}