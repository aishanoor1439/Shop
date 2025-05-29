
package com.mycompany.mavenproject43;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String id;
    private List<Product> cart = new ArrayList<>();

    public Customer(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void addToCart(Product product) {
        cart.add(product);
    }

    public void removeFromCart(Product product) {
        cart.remove(product);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public List<Product> getCart() {
        return cart;
    }
}
