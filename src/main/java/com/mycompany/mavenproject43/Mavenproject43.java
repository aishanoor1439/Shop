
package com.mycompany.mavenproject43;

public class Mavenproject43 {

    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 999.99, true);
        Product phone = new Product("Smartphone", 699.99, true);
        Product headphones = new Product("Headphones", 149.99, false); // Out of stock

        Customer customer = new Customer("John Doe", "CUST001");

        laptop.addToCart(customer);
        phone.addToCart(customer);
        headphones.addToCart(customer);

        phone.removeFromCart(customer);

        Order order = new Order("ORD123", customer, customer.getCart());

        order.shipItem();
    }
}
