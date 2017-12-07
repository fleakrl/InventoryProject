package com.example.demo.user.controller;

import com.example.demo.security.user.UserDetailExtractor;
import com.example.demo.security.user.UserInfoFromOauth;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {

    private final UserDetailExtractor userDetailExtractor;

    @RequestMapping("/user")
    public UserInfoFromOauth getMyUserInfo(){
        return userDetailExtractor.getUserInfo();
    }
}
