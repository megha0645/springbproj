package com.learn.springb.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.springb.learn.Student.Student;
import com.learn.springb.learn.service.StudentService;

@RestController
@RequestMapping("/test")
public class HelloController {
	@Autowired
StudentService ss;
	@RequestMapping("/hi")
	public String getController(){
		System.out.println("this is my controller class");
		return "Hello";
	}
	
	@RequestMapping("/Student/{id}")
	public Student getStudentById(@PathVariable int id){
		return ss.getStudent(id);
		
	}
	@RequestMapping("/Student")
	public List<Student> getAllStuds(){
		return ss.getAllStudents();
		
	}
	@PostMapping(value="/addStudent")
	public void addStudent(@RequestBody Student stu){
		System.out.println("details are: " +stu.getName() + " " +stu.getId());
		 ss.addStudentToList(stu);
		
		
		
	}
	
}
