package org.manaspratimdas.springasjavaconfig.entry;

import org.manaspratimdas.springasjavaconfig.config.AppConfig;
import org.manaspratimdas.springasjavaconfig.myapp.Address;
import org.manaspratimdas.springasjavaconfig.myapp.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartMyApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Student student1 = (Student) context.getBean("student");
		System.out.println("student-1   " + student1);

		Student student2 = (Student) context.getBean("student");
		Address address = (Address) context.getBean("address");
		student2.setName("Manas-2");
		address.setCity("guwahati");
		address.setState("Assam");
		address.setCountry("India");
		student2.setAddress(address);

		System.out.println("student-2   " + student2);

		Student student3 = (Student) context.getBean("student");
		System.out.println("student-3   " + student3);

	}

}
