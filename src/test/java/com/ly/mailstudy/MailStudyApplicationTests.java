package com.ly.mailstudy;

import com.ly.mailstudy.entity.User;
import com.ly.mailstudy.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MailStudyApplicationTests {
@Autowired
    UserMapper userMapper;
    @Test
    void contextLoads() {
        List<User> users=userMapper.selectList(null);
        User admin = userMapper.selectById("admin");
        System.out.println(admin);
    }

}
