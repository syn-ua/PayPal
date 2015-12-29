package com.syn_ua.paypal.model;

import com.google.gson.annotations.SerializedName;


/**
 * Created by Drihulias Andrii on 23.12.2015.
 */
public class PayPalLink {
    @SerializedName("href")
    private String href;
    @SerializedName("rel")
    private String rel;
    @SerializedName("method")
    private String method;
}
