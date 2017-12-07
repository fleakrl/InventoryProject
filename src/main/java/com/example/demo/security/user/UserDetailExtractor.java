package com.example.demo.security.user;

public interface UserDetailExtractor {

    /**
     *
     * @return a UserDetailFromOauth object created from the data returned from Oauth for the currently logged in user
     */
    UserDetailFromOauth getUserInfo();
}
