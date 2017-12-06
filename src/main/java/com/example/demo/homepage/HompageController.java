package com.example.demo.homepage;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class HompageController {

    @RequestMapping(method = RequestMethod.GET, path = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String homepage(){
        return "homepage";
    }
}
