package com.example.demo.Lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args)
    {
        AbstractApplicationContext context= new ClassPathXmlApplicationContext("ImpXML.xml");
        ImplementationXML x1 = (ImplementationXML)context.getBean("samosa");
        System.out.println(x1);
        context.registerShutdownHook();

        ImpleInterface p1 = (ImpleInterface)context.getBean("pepsi");
        System.out.println(p1);

        ImpleAnnotation a1 = (ImpleAnnotation)context.getBean("anno");
        System.out.println(a1);

    }
}
