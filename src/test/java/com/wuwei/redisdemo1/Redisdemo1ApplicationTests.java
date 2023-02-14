package com.wuwei.redisdemo1;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wuwei.redisdemo1.mapper.UserMapper;
import com.wuwei.redisdemo1.po.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Redisdemo1ApplicationTests {
    @Autowired
    UserMapper userMapper;
    @Test
    void contextLoads() {
        System.out.println("git add");
        System.out.println("commit add");
    }

}
