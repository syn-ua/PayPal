package com.syn_ua.paypal.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Drihulias Andrii on 23.12.2015.
 */
public class PayPalCapturePaymentModel {
    @SerializedName("amount")
    private PayPalAmount amount;
    @SerializedName("is_final_capture")
    private boolean isFinalCapture;
}
