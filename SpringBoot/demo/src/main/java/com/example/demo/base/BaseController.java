package com.example.demo.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//app.get


// MVC -> 뷰 템플릿을 돌려줌
@Controller
public class BaseController {

    @GetMapping("/aaa")    //app.get
    @ResponseBody
    public String base() {
        return "ㅎㅇ";
    }


//    @GetMapping("/Um")
//    @ResponseBody
//
//    public String base1() {
//        return "엄";
//    }
}
