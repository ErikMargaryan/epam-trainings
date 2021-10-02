package com.epam.javatrainings.io.homework;

import java.io.Serializable;

public class Customer implements Serializable,Comparable{
    private String name;
    private transient String phone;
    private int score;
    private String card;

    public Customer(String name, String phone, String card) {
        this.name = name;
        this.phone = phone;
        this.card = card;
    }

    public int compareTo(Customer o) {
        return Integer.compare(this.score, o.getScore());
    }

    public void setCard(String card) {
        this.card = card;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getScore() {
        return score;
    }

    public String getCard() {
        return card;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
