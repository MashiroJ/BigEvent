package itheima.mapper;

import itheima.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("select * from user where username = #{username}")
    User getByUsername(String username);



    @Insert("insert into user(username, password,create_time,update_time) values(#{username}, #{newPassword},now(),now())")
    void register(String username, String newPassword);
}
