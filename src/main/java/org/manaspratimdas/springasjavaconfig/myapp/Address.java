package org.manaspratimdas.springasjavaconfig.myapp;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	String city;
	String state;
	String country;

	public void init(){
		System.out.println("Initializing Address");
	}
	
	public void cleanup(){
		System.out.println("Cleaning up Address");
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
	
	

	
	
}
