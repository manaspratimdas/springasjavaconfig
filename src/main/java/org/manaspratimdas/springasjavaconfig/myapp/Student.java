package org.manaspratimdas.springasjavaconfig.myapp;

import org.springframework.stereotype.Component;

@Component
public class Student {
 
	Long id;
	String name;
	Address address;
	
	public void init(){
		System.out.println("Initializing Student");
	}
	
	public void cleanup(){
		System.out.println("Cleaning up Student");
	}
	
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}
