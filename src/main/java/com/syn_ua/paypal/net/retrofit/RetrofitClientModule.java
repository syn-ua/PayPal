package com.syn_ua.paypal.net.retrofit;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.logging.HttpLoggingInterceptor;
import com.syn_ua.paypal.BuildConfig;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;

/**
 * Created by Dryhulias on 22.12.2015.
 */
@Module
public class RetrofitClientModule {


    private PayPalAPIInterfaces iPayPalAPI;

    public RetrofitClientModule() {
        OkHttpClient clientOkHTTP = new OkHttpClient();

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        clientOkHTTP.interceptors().add(interceptor);
        clientOkHTTP.setConnectTimeout(100L, TimeUnit.SECONDS);
        clientOkHTTP.setReadTimeout(100L, TimeUnit.SECONDS);
        clientOkHTTP.setWriteTimeout(100L, TimeUnit.SECONDS);
        String test = BuildConfig.PAY_PAL_SERVER_URL;
        Retrofit client = new Retrofit.Builder()
                .baseUrl(test)
                .client(clientOkHTTP)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        iPayPalAPI = client.create(PayPalAPIInterfaces.class);
    }

    @Singleton
    @Provides
    public PayPalAPIInterfaces provideIPayPalAPI() {
        return iPayPalAPI;
    }


}
