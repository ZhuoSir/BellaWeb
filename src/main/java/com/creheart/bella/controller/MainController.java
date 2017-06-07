package com.creheart.bella.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * Created by sunny-chen on 2017/6/4.
 */
@Controller
@RequestMapping(value = "/Bella")
public class MainController {

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String mainPage() {
        return "main";
    }

}
