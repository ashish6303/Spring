package com.example.demo.Lifecycle;

import org.springframework.aop.scope.ScopedProxyUtils;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ImpleAnnotation {
    private String name;
    private String price;

    public ImpleAnnotation(String name, String price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "This is a " + name +  " and it costs around " + price;
    }

    @PostConstruct
    public static void start()
    {
        System.out.println("I am going to start eating jalebi");
    }

    @PreDestroy
    public static void end()
    {
        System.out.println("I am going to finish jalebi");
    }
}
