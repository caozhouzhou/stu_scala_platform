package com.jdwa.service;

import com.jdwa.dao.UserMapper;
import com.jdwa.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by czz on 2019/11/10.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper mapper;
    public List<User> findUsers(){
        return mapper.selectByExample(null);
    }
}
