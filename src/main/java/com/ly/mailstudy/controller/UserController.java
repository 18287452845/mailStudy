package com.ly.mailstudy.controller;

import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import cn.dev33.satoken.util.SaResult;
import com.ly.mailstudy.entity.User;
import com.ly.mailstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;


    @RequestMapping("doLogin")
    public SaResult doLogin(@RequestBody User user) {
        boolean login = userService.login(user);

        // 此处仅作模拟示例，真实项目需要从数据库中查询数据进行比对
        if(login) {
            StpUtil.login(user.getUsername());
            SaTokenInfo saTokenInfo = StpUtil.getTokenInfo();
            return SaResult.data(saTokenInfo);
        }
        return SaResult.error("用户名或密码错误");
    }

    // 查询登录状态，浏览器访问： http://localhost:8081/user/isLogin
    @RequestMapping("isLogin")
    public Boolean isLogin() {
        List<String> roleList = StpUtil.getRoleList();
        roleList.forEach(System.out::println);
        System.out.println(roleList);

        return  StpUtil.isLogin();
    }

}
