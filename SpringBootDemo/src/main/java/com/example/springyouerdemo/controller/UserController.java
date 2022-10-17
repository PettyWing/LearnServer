package com.example.springyouerdemo.controller;

import com.example.springyouerdemo.entity.MyResource;
import com.example.springyouerdemo.entity.SysUser;
import com.example.springyouerdemo.entity2.User;
import com.example.springyouerdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@ResponseBody  // RestController = Controller + ResponseBody
@RequestMapping("/user")
public class UserController {

    @Autowired
    MyResource myResource;
    @Autowired
    UserService userService;
    @Resource
    RedisTemplate<String, Object> redisTemplate;

    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @RequestMapping("/saveUser")
    public SysUser saveUser() {
        SysUser user = new SysUser();
        // 记得每次id要加
        user.setId("21");
        user.setUsername("spring boot11");
        user.setNickname("spring boot11");
        user.setPassword("abc123");
        user.setIsDelete(0);
        try {
            userService.saveUser(user);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return user;
    }

    @RequestMapping("/saveUser2")
    public User saveUser2() {
        User user = new User();
        // 记得每次id要加
        user.setId("22");
        user.setUsername("spring boot12");
        user.setNickname("spring boot12");
        user.setPassword("abc123");
        user.setIsDelete(0);
        try {
            userService.saveUser2(user);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return user;
    }

    /**
     * 从redis获取user，如果没有则去id为21的那个
     *
     * @return
     */
    @RequestMapping("/getUserByRedis")
    public SysUser getUser() {
        SysUser user = null;
        if (redisTemplate.opsForValue().get("user") != null) {
            user = (SysUser) redisTemplate.opsForValue().get("user");
            // 表明从redis获取
            user.setSex(1);
            return user;
        } else {
            try {
                user = userService.queryUserByIdCustom("21");
                // 表明非redis获取
                user.setSex(0);
                redisTemplate.opsForValue().set("user", user);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return user;
    }

}
