
package com.mycompany.mavenproject43;

import java.util.ArrayList;
import java.util.List;

public class Order implements Shippable{
    private String orderId;
    private Customer customer;
    private List<Product> products;

    public Order(String orderId, Customer customer, List<Product> products) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>(products);
    }

    @Override
    public void shipItem() {
        System.out.println("Shipping order " + orderId + " for customer " + customer.getName());
        for (Product product : products) {
            product.shipItem();
        }
    }

    public String getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }
}
