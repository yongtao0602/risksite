package com.wpt.risk.dal.dao;

import com.wpt.risk.dal.pojo.PUser;

public interface PUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_user
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_user
     *
     * @mbggenerated
     */
    int insert(PUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_user
     *
     * @mbggenerated
     */
    int insertSelective(PUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_user
     *
     * @mbggenerated
     */
    PUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PUser record);
}