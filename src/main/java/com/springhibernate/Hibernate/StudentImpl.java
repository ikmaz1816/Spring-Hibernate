package com.springhibernate.Hibernate;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;



@Component
public class StudentImpl {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public boolean addStudent(Student s)
	{
		int i=(int)this.hibernateTemplate.save(s);
		if(i>0)
			return true;
		return false;
	}
	
	@Transactional
	public boolean updateStudent(int id,Student s)
	{
		Student stud=hibernateTemplate.get(Student.class,id);
		if(stud==null)
		{
			return addStudent(s);
		}
		hibernateTemplate.saveOrUpdate(stud);
		return true;
	}
	
	@Transactional
	public boolean deleteStudent(int id)
	{
		Student stud=hibernateTemplate.get(Student.class,id);
		if(stud==null)
			return false;
		this.hibernateTemplate.delete(stud);
		return true;
	}
	public Student getStudent(int id)
	{
		return hibernateTemplate.get(Student.class, id);
	}
	public List<Student> getAllStudent()
	{
		return hibernateTemplate.loadAll(Student.class);
	}
}
