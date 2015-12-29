package com.syn_ua.paypal.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Drihulias Andrii on 23.12.2015.
 */
public class BillingAddress {
    @SerializedName("line1")
    private String line1;
    @SerializedName("city")
    private String city;
    @SerializedName("state")
    private String state;
    @SerializedName("postal_code")
    private String postalCode;
    @SerializedName("country_code")
    private String countryCode;
}
