package com.jdwa.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jdwa.dao.UserMapper;
import com.jdwa.pojo.User;
import com.jdwa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by czz on 2019/11/10.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public String list(@RequestParam(value = "pageNum" ,defaultValue = "1") Integer pageNum,Model model){
        //pageNum,页码；pageSize:每一页大小
        PageHelper.startPage(pageNum,5);
        List<User> users = userService.findUsers();
        //使用pageinfo包装以便于页面显示,navigatePages用于表示连续显示的页数
        PageInfo<User> page = new PageInfo<>(users,5);
        model.addAttribute("page",page);
        return "list";
    }
}
