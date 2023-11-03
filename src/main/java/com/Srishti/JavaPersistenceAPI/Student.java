package com.Srishti.JavaPersistenceAPI;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//This will make this class as entity
@Entity
public class Student {
	
	
	private String name;
	//Primary Key
	@Id
	private int id;
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Alien [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	
	

}
