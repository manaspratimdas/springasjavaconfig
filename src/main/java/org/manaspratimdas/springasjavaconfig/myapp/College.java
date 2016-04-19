package org.manaspratimdas.springasjavaconfig.myapp;

import java.util.List;

public class College {
	
	Long id;
	String name;
	List<Student> students;
	Address address;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", students=" + students + ", address=" + address + "]";
	}
	
	
	

}
