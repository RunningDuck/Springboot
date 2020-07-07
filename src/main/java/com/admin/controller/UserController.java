package com.admin.controller;

import com.admin.model.JsonResult;
import com.admin.model.StatusCode;
import com.admin.model.User;
import com.admin.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUserById/{userId}")
    @ResponseBody
    public JsonResult getUserById(@PathVariable Integer userId){
        User user = userService.getUserById(userId);
        logger.info("查询成功：{}",user.toString());
        return new JsonResult(StatusCode.SUCCESS,"查询成功",user);
    }
}
