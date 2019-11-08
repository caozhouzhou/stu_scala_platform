package com.jdwa.dao;

import com.jdwa.pojo.UserType;
import com.jdwa.pojo.UserTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_type
     *
     * @mbg.generated Fri Nov 08 23:30:40 CST 2019
     */
    long countByExample(UserTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_type
     *
     * @mbg.generated Fri Nov 08 23:30:40 CST 2019
     */
    int deleteByExample(UserTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_type
     *
     * @mbg.generated Fri Nov 08 23:30:40 CST 2019
     */
    int insert(UserType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_type
     *
     * @mbg.generated Fri Nov 08 23:30:40 CST 2019
     */
    int insertSelective(UserType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_type
     *
     * @mbg.generated Fri Nov 08 23:30:40 CST 2019
     */
    List<UserType> selectByExample(UserTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_type
     *
     * @mbg.generated Fri Nov 08 23:30:40 CST 2019
     */
    int updateByExampleSelective(@Param("record") UserType record, @Param("example") UserTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_type
     *
     * @mbg.generated Fri Nov 08 23:30:40 CST 2019
     */
    int updateByExample(@Param("record") UserType record, @Param("example") UserTypeExample example);
}