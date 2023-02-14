package com.wuwei.redisdemo1.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@TableName(value = "xx_user")
@Data
public class User implements Serializable {
    private Integer userId;

    private String userName;

    private String userPassword;
}
