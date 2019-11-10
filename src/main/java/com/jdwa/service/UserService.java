package com.jdwa.service;

import com.jdwa.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by czz on 2019/11/10.
 */
public interface UserService {
    List<User> findUsers();
}
