package com.wuwei.redisdemo1.config;

import com.wuwei.redisdemo1.po.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

import java.net.UnknownHostException;

@Configuration
public class RedisConfig {
    @Bean
    public RedisTemplate<String, User> userRedisTemplate(RedisConnectionFactory redisConnectionFactory) throws UnknownHostException {
        RedisTemplate<String, User> template = new RedisTemplate();// 更改了RedisTemplate
        //使用了redis里面内置的json序列化器
        Jackson2JsonRedisSerializer<User> jsonRedisSerializer=new Jackson2JsonRedisSerializer(User.class);
        template.setDefaultSerializer(jsonRedisSerializer);// null     new JdkSerializer....

        template.setConnectionFactory(redisConnectionFactory);//设置redis连接  没动
        return template;
    }
}
