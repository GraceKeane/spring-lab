package com.lab3;

public class Person {
	
	String firstName;
	String surname;
	Address address;
	
	public Person(String firstName, String surname, Address address) {
		super();
		this.firstName = firstName;
		this.surname = surname;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", surname=" + surname + ", address=" + address + "]";
	}

}
