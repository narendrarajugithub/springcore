package com.ust.springcore.beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Employee {
	
	public String name;
	public Integer number;
	public List<Address> address =new ArrayList<>();
	
	public String getName() {
		return name;
	}
	
	@Required
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getNumber() {
		return number;
	}
	@Required
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	
}
