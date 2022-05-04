package com.wmx.jr.dao;

import com.wmx.jr.bean.PageBeanVo;
import com.wmx.jr.bean.UserInfoVo;
import com.wmx.jr.bean.UserInfoVoExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserInfoVoMapper {
    int countByExample(UserInfoVoExample example);

    int deleteByExample(UserInfoVoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserInfoVo record);

    int insertSelective(UserInfoVo record);

    int insertBatch(@Param("userInfoVoList") List<UserInfoVo> userInfoVoList);

    List<UserInfoVo> selectByExample(UserInfoVoExample example);

    List<UserInfoVo> selectUserInfoAll(@Param("pageBeanVo") PageBeanVo pageBeanVo);

    UserInfoVo selectByPrimaryKey(Long id);



    int updateByExampleSelective(@Param("record") UserInfoVo record, @Param("example") UserInfoVoExample example);

    int updateByExample(@Param("record") UserInfoVo record, @Param("example") UserInfoVoExample example);

    int updateByPrimaryKeySelective(UserInfoVo record);

    int updateByPrimaryKey(UserInfoVo record);

    int updateUserInfoBatch(@Param("userInfoVoList") List<UserInfoVo> userInfoVoList);
}