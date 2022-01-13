package com.test.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Invoice {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Double amount;
    private String number;
    private String receivedDate;

    public Invoice() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(String receivedDate) {
        this.receivedDate = receivedDate;
    }

    public Invoice(Long id, String name, Double amount, String number, String receivedDate) {
        super();
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.number = number;
        this.receivedDate = receivedDate;
    }
}
