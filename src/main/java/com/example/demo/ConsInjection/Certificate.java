package com.example.demo.ConsInjection;

public class Certificate {
    String name;

    public Certificate(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
