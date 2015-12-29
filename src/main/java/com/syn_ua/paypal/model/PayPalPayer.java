package com.syn_ua.paypal.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Drihulias Andrii on 23.12.2015.
 */
public class PayPalPayer {
    @SerializedName("payment_method")
    private String paymentMethod;
    @SerializedName("funding_instruments")
    private List<FundingInstrument> fundingInstruments;
}
