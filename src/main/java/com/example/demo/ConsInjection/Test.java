package com.example.demo.ConsInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args)
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("constructorconfig.xml");
        Addition p1 = (Addition) context.getBean("Sum");
        p1.Res();

    }
}
