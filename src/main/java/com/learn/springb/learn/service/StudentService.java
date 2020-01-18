package com.learn.springb.learn.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.learn.springb.learn.Student.Student;

@Component
public class StudentService {
private List<Student> studlist= new ArrayList<Student>(Arrays.asList(new Student(1,"megha"),new Student(2,"saku"),new Student(3,"anubha")));

public List<Student> getAllStudents(){
	System.out.println(studlist);
	return studlist;
	
}
public Student getStudent(int id){
	
	Student s1= studlist.stream().filter(s -> s.getId()== id).findFirst().get();
	/*for(Student s:studlist){
		if(s.getId()==id){
			return s;
		}*/
	return s1;
}
public void addStudentToList(Student student){
	System.out.println("adding ");
	studlist.add(student);
	
	
}







}
