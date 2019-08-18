package com.example.demo.entity;

public class User implements java.io.Serializable {

    private Integer id;

    private String name;

    private Integer age;

    private String address;

    public String getAddress() {
        return address;
    }

    public User(int id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
