package com.wuwei.redisdemo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecKillController {

    @RequestMapping("seckillPage")
    public String index(){
        return "seckillPage";
    }
}
