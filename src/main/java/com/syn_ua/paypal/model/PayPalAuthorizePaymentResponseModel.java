package com.syn_ua.paypal.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Drihulias Andrii on 23.12.2015.
 */
public class PayPalAuthorizePaymentResponseModel {
    @SerializedName("id")
    private String id;
    @SerializedName("create_time")
    private String createTime;
    @SerializedName("update_time")
    private String updateTime;
    @SerializedName("state")
    private String state;
    @SerializedName("intent")
    private String intent;
    @SerializedName("payer")
    private PayPalPayer payer;
    @SerializedName("transactions")
    private List<PayPalTransaction> transactions;
    @SerializedName("links")
    private List<PayPalLink> links;
}
