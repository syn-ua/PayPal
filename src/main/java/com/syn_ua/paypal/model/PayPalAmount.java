package com.syn_ua.paypal.model;

import com.google.gson.annotations.SerializedName;


/**
 * Created by Drihulias Andrii on 23.12.2015.
 */
public class PayPalAmount {
    @SerializedName("total")
    private String total;
    @SerializedName("currency")
    private String currency;
    @SerializedName("details")
    private PaypalDetail details;
}
