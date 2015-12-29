package com.syn_ua.paypal.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Drihulias Andrii on 23.12.2015.
 */
public class PayPalAuthorizePaymentModel {
    @SerializedName("intent")
    private String intent;
    @SerializedName("payer")
    private PayPalPayer payPalPayer;
    @SerializedName("transactions")
    private List<PayPalTransaction> transactions;
}
