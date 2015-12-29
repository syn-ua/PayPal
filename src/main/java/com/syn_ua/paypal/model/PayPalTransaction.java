package com.syn_ua.paypal.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Drihulias Andrii on 23.12.2015.
 */
public class PayPalTransaction {
    @SerializedName("amount")
    private PayPalAmount amount;
    @SerializedName("related_resources")
    private List<PayPalRelatedResource> relatedResources;
}
