package com.syn_ua.paypal.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Drihulias Andrii on 23.12.2015.
 */
public class PayPalAuthorization {
    @SerializedName("id")
    private String id;
    @SerializedName("create_time")
    private String createTime;
    @SerializedName("update_time")
    private String updateTime;
    @SerializedName("state")
    private String state;
    @SerializedName("amount")
    private PayPalAmount amount;
    @SerializedName("parent_payment")
    private String parentPayment;
    @SerializedName("valid_until")
    private String validUntil;
    @SerializedName("links")
    private List<PayPalLink> links;
}
