package com.wuwei.redisdemo1.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wuwei.redisdemo1.mapper.UserMapper;
import com.wuwei.redisdemo1.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class RedisController {
    //两个类型
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate <Object,Object> redisTemplate;

    @Resource
    private RedisTemplate <String, User> userRedisTemplate;

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("getkey")
    @ResponseBody
    public String index1(){
        String aaa = stringRedisTemplate.opsForValue().get("aaa");
        return aaa;
    }

    @RequestMapping("getobject")
    @ResponseBody
    public String index2(){
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("user_id",1);
        User user = userMapper.selectOne(queryWrapper);
        System.out.println(user);
        userRedisTemplate.opsForValue().set("obj",user);
        return "success";
    }


}
