package com.ust.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.ust.springcore.SpringConfig;
import com.ust.springcore.beans.Address;
import com.ust.springcore.beans.Employee;

public class SpringMain {

	public static void main(String[] args) {
		System.out.println();
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		System.out.println();
		
		Employee e=new Employee();
		
		Employee emp=(Employee) context.getBean("emp");
		
		System.out.println(emp.address.get(0).getStreet());
    ((AbstractApplicationContext) context).close();
		
	}

}
