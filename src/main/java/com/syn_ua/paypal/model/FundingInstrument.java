package com.syn_ua.paypal.model;


import com.google.gson.annotations.SerializedName;

/**
 * Created by Artem on 23.12.2015.
 */
public class FundingInstrument {
    @SerializedName("credit_card")
    private PayPalCreditCard creditCard;
}
