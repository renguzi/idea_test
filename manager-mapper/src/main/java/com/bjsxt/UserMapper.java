package com.bjsxt;

import java.util.List;

/**
 * @Author: Asher Huang
 * @Date: 2019-09-29
 * @Description: com.bjsxt
 * @Version:1.0
 */
interface UserMapper {

    void insertUser(Users users);
    List<Users> selectUserAll();
}

