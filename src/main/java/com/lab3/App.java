package com.lab3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		//Address a = new Address("Main", "Tuam", "Galway");
		
		//Person p = new Person("John", "Smith", a);
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/lab3/beans/beans.xml");
		Person p = (Person) context.getBean("personBean");
		
		System.out.println(p);
	}

}
