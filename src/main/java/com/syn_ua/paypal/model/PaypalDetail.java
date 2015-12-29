package com.syn_ua.paypal.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Drihulias Andrii on 23.12.2015.
 */
public class PaypalDetail {
    @SerializedName("subtotal")
    private String subtotal;
    @SerializedName("tax")
    private String tax;
    @SerializedName("shipping")
    private String shipping;
}
