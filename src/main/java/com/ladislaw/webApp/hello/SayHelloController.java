package com.ladislaw.webApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "Say hello to us";
    }

    @RequestMapping("/hellohtml")
    @ResponseBody
    public String sayHelloHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<h1>HTML TEXT</h1>");
        return buffer.toString();
    }

    @RequestMapping("/hellojsp")
    public String sayHelloJSP() {
        return "sayHello";
    }


}


