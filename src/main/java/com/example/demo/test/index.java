package com.example.demo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wyx
 * &#064;date  2024/2/2 14:53
 * @version 1.0
 */
@Controller
public class index {

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "hello world!";
    }
}
