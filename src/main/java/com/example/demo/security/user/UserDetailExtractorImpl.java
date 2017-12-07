package com.example.demo.security.user;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class UserDetailExtractorImpl implements UserDetailExtractor{

    /**
     *
     * @return the authentication for the currently logged in user
     */
    private Authentication userAuthentication() {
        return SecurityContextHolder.getContext().getAuthentication();
    }


    /**
     *
     * @return UserDetailFromOauth object from information returned by Oauth.
     *
     */
    @Override
    public UserDetailFromOauth getUserInfo() {
        Map<String, String> userDetailsMap = getUserDetailsFromOauth();

        return UserDetailFromOauth.builder()
                .userId(userDetailsMap.get("id"))
                .email(userDetailsMap.get("email"))
                .name(userDetailsMap.get("name"))
                .givenName(userDetailsMap.get("given_name"))
                .familyName(userDetailsMap.get("family_name"))
                .profilePictureUrl(userDetailsMap.get("picture"))
                .profileUrl(userDetailsMap.get("link"))
                .locale(userDetailsMap.get("locale"))
                .build();
    }

    private Map<String,String> getUserDetailsFromOauth(){
        return (Map<String, String>) ((OAuth2Authentication)userAuthentication()).getUserAuthentication().getDetails();
    }
}
