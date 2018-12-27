package com.example.demo.controller;

import com.example.demo.pojo.OneUser;
import com.example.demo.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserText {
    @Autowired
    private UserService userService;
    private Logger logger = Logger.getLogger(UserText.class);

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String text1() {
       /* String s="";
        MyThread myThread=new MyThread();
        Users users=new Users();
        users.setUserName("倍轻松");
        users.setPwd("123456");
        myThread.setUser(users);
        Thread thread=new Thread(myThread);
        thread.start();*/
        logger.info("come in  userController");
        return "ss";
    }

    public void fileUp() {
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public Integer findById(Integer name) {
        return userService.findByName(name);
    }
}
