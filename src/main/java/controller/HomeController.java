package controller;


import domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "jsonRequest";
    }

    @RequestMapping(value = "saveUser",method = RequestMethod.POST)
    public String saveUser(@RequestBody List<User> users){
        users.forEach(e->System.out.println(e));
        return "json";
    }


    @RequestMapping(value = "/json",produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public User json(){
        User user = new User();
        user.setPassword("password");
        user.setEmail("汤姆@google.com");
        return user;
    }

}
