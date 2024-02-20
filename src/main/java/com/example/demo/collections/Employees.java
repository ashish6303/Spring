package com.example.demo.collections;

import java.util.List;
import java.util.Set;
import java.util.Map;
public class Employees {
    private String name;
    private List<String> phones;
    private Set<String> Addresses;
    private Map<String, String> Courses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAddresses() {
        return Addresses;
    }

    public void setAddresses(Set<String> addresses) {
        Addresses = addresses;
    }

    public Map<String, String> getCourses() {
        return Courses;
    }

    public void setCourses(Map<String, String> courses) {
        Courses = courses;
    }

    public Employees(String name, List<String> phones, Set<String> addresses, Map<String, String> courses) {
        this.name = name;
        this.phones = phones;
        Addresses = addresses;
        Courses = courses;
    }
    public Employees() {
    }
}
