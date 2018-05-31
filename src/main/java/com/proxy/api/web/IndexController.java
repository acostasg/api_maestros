package com.proxy.api.web;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {""})
public class IndexController implements ErrorController {

    private static final String PATH = "/error";

    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public String HomeAction() {
        return "Welcome to Ubesol api public";
    }

    @RequestMapping(value = PATH)
    public String ErrorAction() {
        return "Welcome to Ubesol api public, error page.";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}
