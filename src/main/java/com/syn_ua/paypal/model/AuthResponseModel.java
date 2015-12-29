package com.syn_ua.paypal.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Drihulias Andrii on 16.12.2015.
 */
public class AuthResponseModel {
    @SerializedName("token")
    private String token;
    @SerializedName("profile")
    private ProfileData profile;

    private class ProfileData {
        @SerializedName("ID_PERSON")
        private String idPerson;
        @SerializedName("ID_PROFILE")
        private String idProfile;
        @SerializedName("ID_STATUS")
        private String idStatus;
        @SerializedName("ID_CIVILITY")
        private String idCivility;
        @SerializedName("PRENOM")
        private String firstName;
        @SerializedName("NOM")
        private String lastName;
        @SerializedName("DT_BIRTH")
        private String birthDay;
        @SerializedName("PHONE_NUM")
        private String phone;
        @SerializedName("MOBILE")
        private String mobile;
        @SerializedName("EMAIL")
        private String email;
        @SerializedName("PHOTO")
        private String photo;
        @SerializedName("NATIONALITY")
        private String nationaity;
        @SerializedName("EXPERIENCE")
        private String experience;
        @SerializedName("DESCRIPTION")
        private String description;
    }
}
