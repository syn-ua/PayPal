package com.syn_ua.paypal.net.retrofit;

import com.syn_ua.paypal.model.AuthorizationResponseModel;
import com.syn_ua.paypal.model.PayPalAuthorizePaymentModel;
import com.syn_ua.paypal.model.PayPalAuthorizePaymentResponseModel;
import com.syn_ua.paypal.model.PayPalCapturePaymentModel;
import com.syn_ua.paypal.net.PayPalConstants;

import java.util.HashMap;

import retrofit.Response;
import retrofit.http.Body;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.Header;
import retrofit.http.POST;
import retrofit.http.Url;
import rx.Observable;

/**
 * Created by Drihulias Andrii on 23.12.2015.
 */
public interface PayPalAPIInterfaces {
    @FormUrlEncoded
    @POST(PayPalConstants.AUTH_V2_URL)
    Observable<AuthorizationResponseModel> authenticate(@Header(PayPalConstants.AUTHORIZATION) String authorizationHeader,
                                                     @Field("grant_type") String grantType);

    @POST(PayPalConstants.AUTHORIZE_PAYMENT)
    Observable<Response<PayPalAuthorizePaymentResponseModel>> authorizePayment(@Header(PayPalConstants.AUTHORIZATION) String authorizationHeader,
                                                                               @Body PayPalAuthorizePaymentModel payPalAuthorizePaymentModel);

    @POST
    Observable<HashMap<String, Object>> capturePayment(@Header(PayPalConstants.AUTHORIZATION) String authorizationHeader,
                                                       @Url String url,
                                                       @Body PayPalCapturePaymentModel payPalCapturePaymentModel);
}
