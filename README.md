# TeachMeSkills_C26_Lesson_16_HW
Homework for the sixteenth lesson

**Task_5:**  
Created a class to describe a customer (registration date, name, age)  
Also the customer class contains a field-collection with orders of this customer - it is a kind of a shopping cart of customer's orders.  
Order class contains fields for order description (price, product name)  
Several customers have been created.  
Multiple orders are created for each customer, they are placed in their in the field-collection for orders.  
A collection of type Map is created and populated with the pairs "customer passport number" -> "customer class object".  
Passport numbers are stored as constants in the interface created for this.  
 The collection is traversed and displayed in the following ways:  
	  - all key-value pairs using Map.Entry<K, V> entry : map.entrySet()  
	  - all key-value pairs using iterator  
	  - all keys, using map.keySet()  
	  - all values using map.values()  
