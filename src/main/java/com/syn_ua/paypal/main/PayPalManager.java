package com.syn_ua.paypal.main;

import com.syn_ua.paypal.helper.Base64Encoder;
import com.syn_ua.paypal.model.AuthorizationResponseModel;
import com.syn_ua.paypal.net.retrofit.DaggerRetrofitComponent;
import com.syn_ua.paypal.net.retrofit.PayPalAPIInterfaces;

import javax.inject.Inject;

import rx.Observable;
import rx.schedulers.Schedulers;

/**
 * Created by Drihulias on 28.12.2015.
 */

public class PayPalManager {
    private static final String BASIC = "Basic ";
    private static final String COLON = ":";
    private static final String CLIENT_CREDENTIALS = "client_credentials";

    private String AutchToken;

    @Inject
    protected PayPalAPIInterfaces payPalAPI;


    public PayPalManager() {
        DaggerRetrofitComponent.builder().build().inject(this);
    }

    public Observable<AuthorizationResponseModel> authenticate(String userId, String secretKey) {
        return payPalAPI.authenticate(BASIC + Base64Encoder.encode(userId + COLON + secretKey), CLIENT_CREDENTIALS).subscribeOn(Schedulers.io());
    }
}
