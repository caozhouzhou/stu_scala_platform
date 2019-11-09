package com.jdwa.dao;

import com.jdwa.pojo.UserType;
import com.jdwa.pojo.UserTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTypeMapper {
    long countByExample(UserTypeExample example);

    int deleteByExample(UserTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserType record);

    int insertSelective(UserType record);

    List<UserType> selectByExample(UserTypeExample example);

    UserType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserType record, @Param("example") UserTypeExample example);

    int updateByExample(@Param("record") UserType record, @Param("example") UserTypeExample example);

    int updateByPrimaryKeySelective(UserType record);

    int updateByPrimaryKey(UserType record);
}