package com.example.demo.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args)
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("autowiringconfig.xml");
        Employee e1 = (Employee)context.getBean("emp1", Employee.class);
        System.out.println(e1);
    }
}
