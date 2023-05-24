package com.example.cityexample;

import javax.persistence.*;

@Entity
@Table(name = "slist")
public class ShoppingList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private int amount;
    private double cost;

    public ShoppingList() {

    }

    public ShoppingList(long id, String name, int amount, double cost) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.cost = cost;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }


}
