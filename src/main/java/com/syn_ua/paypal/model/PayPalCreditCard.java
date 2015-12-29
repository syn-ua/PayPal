package com.syn_ua.paypal.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Drihulias Andrii on 23.12.2015.
 */
public class PayPalCreditCard {
    @SerializedName("number")
    private String number;
    @SerializedName("type")
    private String type;
    @SerializedName("expire_month")
    private int expireMonth;
    @SerializedName("expire_year")
    private int expireYear;
    @SerializedName("cvv2")
    private int cvv2;
    @SerializedName("first_name")
    private String firstName;
    @SerializedName("last_name")
    private String lastName;
    @SerializedName("billing_address")
    private BillingAddress billingAddress;
}
