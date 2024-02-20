package com.example.demo.Lifecycle;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.DisposableBean;
public class ImpleInterface implements InitializingBean, DisposableBean{
    private String name;
    private String price;

    public ImpleInterface(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public ImpleInterface() {
        super();
    }

    @Override
    public String toString() {
        return "This is a " + name + " and it's price is " + price;
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("Here i am going to destroy the pepsi.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Here i am going to initialize the property. ");
    }
}
