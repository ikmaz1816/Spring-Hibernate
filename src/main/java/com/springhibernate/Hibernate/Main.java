package com.springhibernate.Hibernate;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
    AbstractApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    
    StudentService service=(StudentService)context.getBean("studentService");
//    Student s=new Student(3,"Ayaan","Khan");
//    service.addStudent(s);
    
//    Student s=new Student(1,"Imran","Khan");
////    service.updateStudent(s);
////    service.deleteStudent(2);
//    service.addStudent(s);
    service.getAllStudent();
    service.getStudent(2);
    context.close();
    
  }
}
