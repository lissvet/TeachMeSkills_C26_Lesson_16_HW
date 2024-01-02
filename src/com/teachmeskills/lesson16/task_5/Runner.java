package com.teachmeskills.lesson16.task_5;

import com.teachmeskills.lesson16.task_5.service.ClientBaseCreator;
import com.teachmeskills.lesson16.task_5.service.ClientBaseService;
import com.teachmeskills.lesson16.task_5.util.client.Client;

import java.util.Map;
/**Create a class for client description.
 * Place in the class fields for customer description (date of registration, name, age and other fields at your discretion).
 * The customer class should contain a field-collection with orders of this customer - it is a kind of a shopping cart of customer orders.
 * Order class should contain fields for order description (price, description and other fields are possible).
 * Create several customers.
 * For each customer create several orders and place them in the field-collection for orders.
 * Create a collection of Mar type and fill it with pairs "customer passport number" -> "customer class object".
 * Passport numbers can be stored as constants in the interface created for this purpose.
 * Loop through the collection and display on the screen:
    - all key-value pairs, using Map.Entry<K, V> entry : map.entrySet()
    - all key-value pairs, using iterator
    - all keys, using map.keySet()
    - all values, using map.values() */
public class Runner {

    public static void main(String[] args) {

        Map<String, Client> clientBase = ClientBaseCreator.createClientBase();

        ClientBaseService.showClientBase1(clientBase);

        ClientBaseService.showClientBase2(clientBase);

        ClientBaseService.showClientKey(clientBase);

        ClientBaseService.showClientValue(clientBase);
    }

}
