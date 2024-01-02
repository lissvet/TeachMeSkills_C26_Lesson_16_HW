package com.teachmeskills.lesson16.task_5.util.client;

import com.teachmeskills.lesson16.task_5.util.order.Order;

import java.util.List;

public class Client {

    private String name;
    private int age;
    private String dateRegistration;
    public List<Order> clientOrder;

    public Client(String name, int age, String dateRegistration) {
        this.name = name;
        this.age = age;
        this.dateRegistration = dateRegistration;
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

    public String getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration(String dateRegistration) {
        this.dateRegistration = dateRegistration;
    }
}
