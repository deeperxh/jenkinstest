package com.deeperxh.jenkinsdemo;



import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

    @Controller
    @EnableAutoConfiguration
    public class MainController {

        @RequestMapping("/")
        @ResponseBody
        String home() {
            return "Love KK!";
        }


    }

