package com.example.demo.security.user;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class UserInfoFromOauth {

    String userId;
    String email;
    String name;
    String givenName;
    String familyName;
    String profilePictureUrl;
    String profileUrl;
    String locale;
}

