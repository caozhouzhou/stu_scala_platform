package com.jdwa.test;

import com.jdwa.dao.UserMapper;
import com.jdwa.dao.UserTypeMapper;
import com.jdwa.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

/**
 * Created by czz on 2019/11/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {


    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserTypeMapper typeMapper;

    @Autowired
    private SqlSession sqlSession;

    @Test
    public void testCrud(){
//        UserType type = new UserType();
//        type.setId(1);
//        type.setName("老师");
//        type.setDuty("Chinese");
//        type.setInfo("教语文");
//        typeMapper.insertSelective(type);

//                UserType type1 = new UserType();
//        type1.setId(2);
//        type1.setName("学生");
//        type1.setDuty("study");
//        type1.setInfo("好好学习，天天向上");
//        typeMapper.insertSelective(type1);
//
//                UserType type2 = new UserType();
//        type2.setId(3);
//        type2.setName("家长");
//        type2.setDuty("care");
//        type2.setInfo("关心，呵护，引导，监督");
//        typeMapper.insertSelective(type2);
//
//        UserType type3 = new UserType();
//        type3.setId(4);
//        type3.setName("游客");
//        type3.setDuty("nothing");
//        type3.setInfo("查看，鉴赏，使用");
//        typeMapper.insertSelective(type3);
//
//        User user1 = new User();
//        user1.setId(1);
//        user1.setTypeId(2);
//        user1.setRoleId(1);
//        user1.setUname("cxl");
//        user1.setPasswd("123456");
//        userMapper.insertSelective(user1);
//
//        User user2 = new User();
//        user2.setId(2);
//        user2.setTypeId(2);
//        user2.setRoleId(1);
//        user2.setUname("cyy");
//        user2.setPasswd("123456");
//        userMapper.insertSelective(user2);
//
//        User user3 = new User();
//        user3.setId(3);
//        user3.setTypeId(2);
//        user3.setRoleId(1);
//        user3.setUname("cjy");
//        user3.setPasswd("123456");
//        userMapper.insertSelective(user3);
//
//        User user4 = new User();
//        user4.setId(4);
//        user4.setTypeId(2);
//        user4.setRoleId(1);
//        user4.setUname("cxy");
//        user4.setPasswd("123456");
//        userMapper.insertSelective(user4);

//        MarkMapper markMapper = sqlSession.getMapper(MarkMapper.class);

        UserMapper uMapper = sqlSession.getMapper(UserMapper.class);
        for (int i=5;i<=1005;i++){
            String roleId = UUID.randomUUID().toString();
            String name = roleId.substring(0,5)+i;
            User user4 = new User();
            user4.setId(i);
            user4.setTypeId(2);
            user4.setRoleId(roleId);
            user4.setUname(name);
            user4.setPasswd(roleId.substring(6,10));
            user4.setGender("M");
            user4.setEmail(name+"@goldensecurity.com");
            uMapper.insertSelective(user4);
        }

    }
}
