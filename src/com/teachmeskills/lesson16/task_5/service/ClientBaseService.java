package com.teachmeskills.lesson16.task_5.service;

import com.teachmeskills.lesson16.task_5.util.client.Client;
import com.teachmeskills.lesson16.task_5.util.order.Order;

import java.util.Iterator;
import java.util.Map;

public class ClientBaseService {

    public static void showClientBase1(Map<String, Client> clientBase){
        System.out.println("\n Screen display using the first method: \n");
        int counter = 1;
        for(Map.Entry<String, Client> base : clientBase.entrySet()){
            System.out.println("Customer "+ counter + " information:");
            System.out.println("Key: " + base.getKey());
            System.out.println("Value: ");
            System.out.println(" Name: " + base.getValue().getName());
            System.out.println(" Age: " + base.getValue().getAge());
            System.out.println(" Date of registration: " + base.getValue().getDateRegistration());
            System.out.println(" Customer cart:  ");
            for(Order order : base.getValue().clientOrder){
                System.out.println("Product name: " + order.getProductName() + ". Price: " + order.getPrice());
            }
            counter++;
            System.out.println(" ");
        }
    }

    public static void showClientBase2(Map<String, Client> clientBase){
        System.out.println("Screen display using the second method: \n");
        int counter = 1;
        Iterator<Map.Entry<String, Client>> iterator = clientBase.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Client> base = iterator.next();
            System.out.println("Customer "+ counter + " information:");
            System.out.println("Key: " + base.getKey());
            System.out.println("Value: ");
            System.out.println(" Name: " + base.getValue().getName());
            System.out.println(" Age: " + base.getValue().getAge());
            System.out.println(" Date of registration: " + base.getValue().getDateRegistration());
            System.out.println(" Customer cart:  ");
            for(Order order : base.getValue().clientOrder){
                System.out.println("Product name: " + order.getProductName() + ". Price: " + order.getPrice());
            }
            counter++;
            System.out.println(" ");
        }
    }

    public static void showClientKey(Map<String, Client> clientBase){
        System.out.println("Key information:");
        int counter = 1;
        for(Map.Entry<String, Client> base : clientBase.entrySet()){
            System.out.println("Customer "+ counter + " Key: " + base.getKey());
            counter++;
        }
        System.out.println(" ");
    }


    public static void showClientValue(Map<String, Client> clientBase) {
        System.out.println("Value information:");
        int counter = 1;
        for (Map.Entry<String, Client> base : clientBase.entrySet()) {
            System.out.println("Customer " + counter + " Value: ");
            System.out.println(" Name: " + base.getValue().getName());
            System.out.println(" Age: " + base.getValue().getAge());
            System.out.println(" Date of registration: " + base.getValue().getDateRegistration());
            System.out.println(" Customer cart:  ");
            for (Order order : base.getValue().clientOrder) {
                System.out.println("Product name: " + order.getProductName() + ". Price: " + order.getPrice());
            }
            counter++;
            System.out.println(" ");
        }
    }

}
