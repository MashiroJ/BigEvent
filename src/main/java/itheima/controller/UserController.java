package itheima.controller;

import itheima.service.UserService;
import itheima.utils.Result;
import jakarta.annotation.Resource;
import jakarta.validation.constraints.Pattern;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;



    /**
     * 处理用户注册请求
     *
     * 该方法通过POST请求处理用户注册逻辑，验证用户名和密码的格式是否符合规范
     * 使用正则表达式确保用户名和密码由5到16个字母、数字、下划线或中划线组成
     * 这种验证确保了数据的一致性和安全性，防止不合法的输入造成安全风险
     *
     * @param username 用户名，必须符合指定的正则表达式格式
     * @param password 密码，必须符合指定的正则表达式格式
     * @return 返回注册结果，成功时返回Result.success()
     */
    @PostMapping("/register")
    public Result register(@Pattern(regexp = "^[a-zA-Z0-9_-]{5,16}$",message = "用户名格式错误")String username, @Pattern(regexp = "^[a-zA-Z0-9_-]{5,16}$",message = "密码格式错误") String password) {
        userService.register(username,password);
        return Result.success();
    }
}
