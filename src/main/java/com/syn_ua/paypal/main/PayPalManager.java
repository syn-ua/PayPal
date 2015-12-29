package com.syn_ua.paypal.main;

import com.syn_ua.paypal.helper.Base64Encoder;
import com.syn_ua.paypal.model.AuthorizationResponseModel;
import com.syn_ua.paypal.net.retrofit.DaggerRetrofitComponent;
import com.syn_ua.paypal.net.retrofit.PayPalAPIInterfaces;

import java.util.HashMap;

import javax.inject.Inject;

import rx.Observable;
import rx.schedulers.Schedulers;

/**
 * Created by Dryhulias on 28.12.2015.
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
//        return  payPalAPI.authenticate("Basic " + Base64Encoder.encode("AcEX5u7rWnU3idjv-l8BqONhSdBEP4TiKjbnSs3XgY0ttND01nv8iZJZhhw0V-KLaRxb8cAL8kuynhxJ:EIAAXOS4Dc_zqwyqKCSRZ-hpbdO9becJVuWvbVQPKfjPyKB3weadcy6WBY24HJfjGBCRvjztcE_zNzJY"), "client_credentials")
//                .subscribeOn(Schedulers.io());

         return payPalAPI.authenticate(BASIC + Base64Encoder.encode(userId + COLON + secretKey), CLIENT_CREDENTIALS).subscribeOn(Schedulers.io());
    }
}
