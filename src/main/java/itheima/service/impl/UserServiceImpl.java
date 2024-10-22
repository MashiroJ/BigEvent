package itheima.service.impl;

import itheima.mapper.UserMapper;
import itheima.pojo.User;
import itheima.service.UserService;
import itheima.utils.Md5Util;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public void register(String username, String password) {
        //判断用户是否存在
        User user = userMapper.getByUsername(username);
        //如果用户名字存在
        if (user != null) {
            throw new RuntimeException("用户已存在");
        }
        //如果用户名不存在则注册
        String newPassword = Md5Util.getMD5String(password);
        userMapper.register(username, newPassword);
    }
}
