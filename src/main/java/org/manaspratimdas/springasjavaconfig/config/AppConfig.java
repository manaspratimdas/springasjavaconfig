package org.manaspratimdas.springasjavaconfig.config;

import org.manaspratimdas.springasjavaconfig.myapp.Address;
import org.manaspratimdas.springasjavaconfig.myapp.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "org.manaspratimdas.springasjavaconfig")
public class AppConfig {

	@Bean(name = "address", initMethod = "init", destroyMethod = "cleanup")
	@Scope("prototype")
	public Address address() {
		Address address = new Address();
		address.setCity("pune");
		address.setState("Maharastra");
		address.setCountry("India");
		return address;
	}

	@Bean(name = "student", initMethod = "init", destroyMethod = "cleanup")
	public Student student() {
		Student student = new Student();
		student.setId(1L);
		student.setName("XXX");
		student.setAddress(address());
		return student;

	}

}
