package com.syn_ua.paypal.model;

/**
 * Created by Drihulias on 23.12.2015.
 */
public class Amount {
    private String total;
    private String currency;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
