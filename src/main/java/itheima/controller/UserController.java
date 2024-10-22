package itheima.controller;

import itheima.service.UserService;
import itheima.utils.Result;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/register")
    public Result register(String username, String password) {
        userService.register(username,password);
        return Result.success();
    }
}
