package com.teachmeskills.lesson16.task_5.service;

import com.teachmeskills.lesson16.task_5.util.client.Client;
import com.teachmeskills.lesson16.task_5.util.order.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static com.teachmeskills.lesson16.task_5.util.consts.Constant.*;

public class ClientBaseCreator {

    public static Map<String, Client> createClientBase (){
        Order order1 = new Order(300, "Lamp");
        Order order2 = new Order(30, "Battery");
        Order order3 = new Order(1000, "Phone");
        Order order4 = new Order(3000, "TV");
        Order order5 = new Order(2500, "Camera");
        Order order6 = new Order(500, "Multicooker");
        Order order7 = new Order(200, "Mixer");

        Client client1 = new Client("Lisa", 23, "01-02-2024");
        Client client2 = new Client("Georg", 30, "01-13-2020");
        Client client3 = new Client("Dana", 45, "01-02-2023");

        ArrayList<Order> orderClient1 = new ArrayList<> ();
        orderClient1.add(order1);
        orderClient1.add(order2);
        orderClient1.add(order7);
        ArrayList<Order> orderClient2 = new ArrayList<> ();
        orderClient2.add(order3);
        orderClient2.add(order5);
        ArrayList<Order> orderClient3 = new ArrayList<> ();
        orderClient3.add(order6);
        orderClient3.add(order4);

        client1.clientOrder = orderClient1;
        client2.clientOrder = orderClient2;
        client3.clientOrder = orderClient3;

        Map<String, Client> clientBase = new HashMap<>();
        clientBase.put(PASSPORT_ID_1, client1);
        clientBase.put(PASSPORT_ID_2, client2);
        clientBase.put(PASSPORT_ID_3, client3);

        return clientBase;
    }

}
