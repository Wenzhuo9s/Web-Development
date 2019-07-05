package com.wz.blog.Service;

import com.wz.blog.po.User;

public interface UserService {
    User checkUser(String username, String password);
}
