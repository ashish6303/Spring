package com.example.demo.collections;

import com.example.demo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args)
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("collectionconfig.xml");
         Employees emp1 = (Employees)context.getBean("Employee1");
        System.out.println(emp1.getName());
        System.out.println(emp1.getPhones());
        System.out.println(emp1.getAddresses());
        System.out.println(emp1.getCourses());
    }

}
