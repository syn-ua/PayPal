package com.syn_ua.paypal.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Dryhulias on 23.12.2015.
 */
public class PayMentRequestModel {
   private String intent;
    @SerializedName("redirect_urls")
    private RedirectUrl  redirectUrls;
    private Payer  payer;
    private List<Transaction> transactions;
}
