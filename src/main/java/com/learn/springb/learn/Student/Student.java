package com.learn.springb.learn.Student;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;


public class Student {
@JsonCreator	
public Student(@JsonProperty("id")int id, @JsonProperty("name")String name) {
	this.id=id;
	this.name=name;
		// TODO Auto-generated constructor stub
	}
private int id;
private String name;
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
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}	
}
