package com.jdwa.test;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.jdwa.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.Arrays;
import java.util.List;

/**
 * 1.声明一个mockMvc，用来虚拟请求
 * 2.加上类注解@WebAppConfiguration,否则WebApplicationContext注入不生效
 * 3.注入WebApplicationContext
 * 4.初始化mockmvc
 * 5.调用mockMvc对象的perform方法模拟发送请求，返回值MvcResult result
 * 6.通过返回值result.getRequest()，获取MockHttpServletRequest request
 * 7.从request取出存在request域中的page属性（pageInfo值）
 * 8.解析pageInfo
 * Created by czz on 2019/11/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:springmvc.xml"})
public class MvcTest {
    //将容器自身注入
    @Autowired
    WebApplicationContext ctx;
    //用于虚拟mvc请求并获得结果
    private MockMvc mockMvc;
    @Before
    public void init(){
        System.out.println("init.......");
        mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
    }

    @Test
    public void testMvc()throws Exception{
        System.out.println("mockMvc:"+mockMvc);
        MvcResult result = mockMvc.perform(
                MockMvcRequestBuilders.get("/user/list")
                        .param("pageNum","1")
        ).andReturn();
        MockHttpServletRequest request = result.getRequest();
        System.out.println("request:"+request);
        PageInfo page = (PageInfo) request.getAttribute("page");
        System.out.println("当前页:"+page.getPageNum());
        System.out.println("总页数:"+page.getPages());
        System.out.println("总记录数:"+page.getTotal());
        System.out.println("显示的页码:"+ Arrays.toString(page.getNavigatepageNums()));
        List<User> us =page.getList();
        for (User user:us){
            System.out.println("用户名："+user.getUname());
            System.out.println("密码："+user.getPasswd());
            System.out.println("性别："+user.getGender());
            System.out.println("邮箱："+ user.getEmail());


        }

    }
}
