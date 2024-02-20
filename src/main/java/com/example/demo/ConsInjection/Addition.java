package com.example.demo.ConsInjection;

public class Addition {
    private int a;
    private int b;

    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int Sum(int a, int b)
    {
        return a+b;
    }

    public void Res()
    {
        System.out.println("The sum is : " + (this.a + this.b));
    }
}
