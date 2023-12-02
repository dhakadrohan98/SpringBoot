package com.dailycodebuffer;

import org.springframework.stereotype.Component;

@Component
public class Nurse implements Staff {
    private String name;
    private int age;
    private String address;

    public Nurse(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Nurse() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public void assist() {
        System.out.println("Nurse is assisting to the doctor.");
    }
}
