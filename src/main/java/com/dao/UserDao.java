package com.dao;

import com.domain.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by LiuKang on 2016/2/29.
 */
@Component
public interface UserDao {
    @Insert("insert INTO users (user_name) VALUES (#{name})")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    void createUser(User user);

    @Delete("delete from users where id = #{id_delete}")
    void deleteUser(@Param(value = "id_delete") int id);

    @Select("SELECT * FROM users")
    List<User> selectUser();

    @Update("update users set user_name = #{name} where id = #{id_update}")
    void updateUser(@Param(value = "id_update") int id, @Param(value = "name") String name);
}
