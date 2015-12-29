package com.syn_ua.paypal.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Dryhulias on 23.12.2015.
 */
public class RedirectUrl {
    @SerializedName("return_url")
    private String returnUrl;
    @SerializedName("cancel_url")
    private String cancelUrl;

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public String getCancelUrl() {
        return cancelUrl;
    }

    public void setCancelUrl(String cancelUrl) {
        this.cancelUrl = cancelUrl;
    }
}
