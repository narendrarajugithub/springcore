package com.ust.springcore;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.ust.springcore.beans.Address;
import com.ust.springcore.beans.Employee;

@Configuration
@ComponentScan("com.ust.*")
public class SpringConfig {
	
	
	
	
	@Bean("emp")
	@Lazy
	public Employee getEmployee(){
		 
		Employee employee=new Employee();
		employee.setName("narendra");
		Address  address =new Address();
		address.setStreet("podtoffice");
		employee.address.add(address);
		return employee;
	}
		
	
	
}
