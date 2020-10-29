package com.example.herokudemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chase
 * @since 2020/10/29 10:38
 */
@RestController
public class HerokuDemoController {

    @RequestMapping("/")
    public String index() {
        return "Hello Heroku!";
    }

}
