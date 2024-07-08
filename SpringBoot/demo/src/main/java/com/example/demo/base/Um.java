package com.example.demo.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Um {
    @GetMapping("/Um")
    @ResponseBody

    public String base(){
        return "엄";
    }
}
