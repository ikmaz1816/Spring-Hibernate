package com.springhibernate.Hibernate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentService {
	
	@Autowired
	private StudentImpl impl;
	
	public void addStudent(Student s)
	{
		if(impl.addStudent(s))
		{
			System.out.println("Student added!");
		}
		else
		{
			System.out.println("Student was not added due to some internal error");
		}
	}
	public void updateStudent(Student s)
	{
		if(impl.addStudent(s))
		{
			System.out.println("Student updated!");
		}
		else
		{
			System.out.println("Student was not updated due to some internal error");
		}
	}
	public void deleteStudent(int id)
	{
		if(impl.deleteStudent(id))
		{
			System.out.println("Student Deleted");
		}
		else
		{
			System.out.println("Student was not deleted due to some internal error");
		}
	}
	public void getStudent(int id)
	{
		System.out.println(impl.getStudent(id));
	}
	public void getAllStudent()
	{
		List<Student> ls=impl.getAllStudent();
		for(Student stud:ls)
		{
			System.out.println(stud);
		}
	}
}
