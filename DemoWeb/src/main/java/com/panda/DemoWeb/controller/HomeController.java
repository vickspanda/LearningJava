package com.panda.DemoWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
    @RequestMapping("/")
    @ResponseBody
    public String greet(){
        return "Welcome to my Website !!!";
    }
}

@RestController
class MainController{
    @RequestMapping("/main")
    public String mainMessage(){
        return "Another Way of Sending the Message to the Host !!!";
    }

    @RequestMapping("/about")
    public String aboutMessage(){return "About page while learning SpringBoot";}
}
