package com.example.demo.user;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {

    @RequestMapping("/user")
    public Principal user(Principal principal) {
        return principal;
    }
}
