package com.employee.details;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int id;
	private String name;
	private int age;
	private int sal;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Employee(int id, String name, int age, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sal = sal;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getSal() {
		return sal;
	}



	public void setSal(int sal) {
		this.sal = sal;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", sal=" + sal + "]";
	}
	

	
	
	

}
