package com.example.demo.Lifecycle;

public class ImplementationXML {

    private String name;
    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ImplementationXML() {
        super();
    }

    @Override
    public String toString() {
        return "The cost of " + name + " is " + price ;
    }

    public void init()
    {
        System.out.println("This is init methods. ");
    }
    public void  destroy()
    {
        System.out.println("This is a distroy methods");
    }

}
