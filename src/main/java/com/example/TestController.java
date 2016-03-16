package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Michiel on 16-3-2016.
 */
@Controller
public class TestController {
    @RequestMapping("/test")
    public String test() {
        return "test";
    }
}
