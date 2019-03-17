package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wzy on 2019/1/30 22:34
 **/

@Controller
public class homeController {

    @RequestMapping("/test")
    public String test(){

        System.out.println("/test");
        return "test";
    }


    @RequestMapping(value = "/home",params = "login")
    public String login(){

        return "login";
    }
}
