package com.jdwa.dao;

import com.jdwa.pojo.Mark;
import com.jdwa.pojo.MarkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarkMapper {
    long countByExample(MarkExample example);

    int deleteByExample(MarkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Mark record);

    int insertSelective(Mark record);

    List<Mark> selectByExample(MarkExample example);

    Mark selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Mark record, @Param("example") MarkExample example);

    int updateByExample(@Param("record") Mark record, @Param("example") MarkExample example);

    int updateByPrimaryKeySelective(Mark record);

    int updateByPrimaryKey(Mark record);
}