package com.example.demo.standaloneCollection;

import com.example.demo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args)
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("standalonecollectionconfig.xml");
        Person p1 = (Person)context.getBean("p1");
        System.out.println(p1);
//
        Person p2 = (Person)context.getBean("p1");
        System.out.println(p2);
    }

}
