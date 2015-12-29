package com.syn_ua.paypal.net.retrofit;


import com.syn_ua.paypal.main.PayPalManager;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Dryhulias on 23.12.2015.
 */
@Singleton
@Component(modules = {RetrofitClientModule.class})
public interface RetrofitComponent {
    void inject(PayPalManager payPalManager);
    PayPalAPIInterfaces provideIPayPalAPI();
}
