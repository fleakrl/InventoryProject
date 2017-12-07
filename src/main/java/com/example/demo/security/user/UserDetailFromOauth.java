package com.example.demo.security.user;

import lombok.Builder;
import lombok.Value;


/**
 * a user object created from the data returned from Oauth
 *
 * contains useful information about the currently logged in user
 *
 */
@Value
@Builder
public class UserDetailFromOauth {

    String userId;
    String email;
    String name;
    String givenName;
    String familyName;
    String profilePictureUrl;
    String profileUrl;
    String locale;
}

