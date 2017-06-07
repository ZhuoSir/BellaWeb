package com.creheart.bella.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * Created by sunny-chen on 2017/6/4.
 */
@Controller
@RequestMapping(value = "/Bella/Login")
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }

}
