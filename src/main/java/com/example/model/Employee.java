package com.example.model;

public class Employee {
    private String id;
    private String name;

    public Employee() {
    }
    public Employee(String id,String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        id = id;
    }
}
