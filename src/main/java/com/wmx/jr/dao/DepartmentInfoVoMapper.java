package com.wmx.jr.dao;

import com.wmx.jr.bean.DepartmentInfoVo;
import com.wmx.jr.bean.DepartmentInfoVoExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DepartmentInfoVoMapper {
    int countByExample(DepartmentInfoVoExample example);

    int deleteByExample(DepartmentInfoVoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DepartmentInfoVo record);

    int insertSelective(DepartmentInfoVo record);

    List<DepartmentInfoVo> selectByExample(DepartmentInfoVoExample example);

    DepartmentInfoVo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DepartmentInfoVo record, @Param("example") DepartmentInfoVoExample example);

    int updateByExample(@Param("record") DepartmentInfoVo record, @Param("example") DepartmentInfoVoExample example);

    int updateByPrimaryKeySelective(DepartmentInfoVo record);

    int updateByPrimaryKey(DepartmentInfoVo record);
}