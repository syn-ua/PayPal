package com.syn_ua.paypal.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Drihulias Andrii on 17.12.2015.
 */
public class CreditedFunds {
    @SerializedName("Currency")
    private String currency;
    @SerializedName("Amount")
    private long amount;
}
