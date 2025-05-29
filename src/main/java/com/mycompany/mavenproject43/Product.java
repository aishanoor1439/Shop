package com.mycompany.mavenproject43;

import java.util.ArrayList;
import java.util.List;

public class Product implements Purchasable, Shippable {

    private String name;
    private double price;
    private boolean inStock;
    private List<Customer> cartCustomers = new ArrayList<>();

    public Product(String name, double price, boolean inStock) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }

    @Override
    public void addToCart(Customer customer) {
        if (inStock) {
            cartCustomers.add(customer);
            customer.addToCart(this);
            System.out.println(name + " added to " + customer.getName() + "'s cart.");
        } else {
            System.out.println(name + " is out of stock and cannot be added to cart.");
        }
    }
    
    @Override
    public void removeFromCart(Customer customer) {
        if (cartCustomers.remove(customer)) {
            customer.removeFromCart(this);
            System.out.println(name + " removed from " + customer.getName() + "'s cart.");
        } else {
            System.out.println(name + " was not in " + customer.getName() + "'s cart.");
        }
    }
    
    @Override
    public void shipItem() {
        if (inStock) {
            System.out.println(name + " has been shipped.");
        } else {
            System.out.println(name + " is out of stock and cannot be shipped.");
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isInStock() {
        return inStock;
    }

}