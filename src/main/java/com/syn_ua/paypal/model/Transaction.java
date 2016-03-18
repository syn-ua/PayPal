package com.syn_ua.paypal.model;

/**
 * Created by Drihulias on 23.12.2015.
 */
public class Transaction {
    private Amount amount;
    private String description;

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
