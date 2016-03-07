package com.control;

import com.domain.User;
import com.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Control {
    @Autowired
    private MyService myService;


    @RequestMapping(value = "/index")
    public String test(){
        System.out.println(myService.getUsers());
        return "index";
    }

    @RequestMapping(value = "/getAll")
    public String getAll(Model model){
        List<User> users= myService.getUsers();
        model.addAttribute("users", users);
        return "success";
    }
}
