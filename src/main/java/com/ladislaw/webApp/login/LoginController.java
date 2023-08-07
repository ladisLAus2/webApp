package com.ladislaw.webApp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String loggingJSP(@RequestParam String name,@RequestParam String lastname, ModelMap model){
        model.put("name", name);
        model.put("lastname", lastname);

        return "login";
    }
}
