package com.wmx.jr.service;

import com.wmx.jr.bean.PageBeanVo;
import com.wmx.jr.bean.UserInfoVo;
import com.wmx.jr.bean.UserInfoVoExample;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserInfoService {

    List<UserInfoVo> getUserInfoAll(UserInfoVoExample userInfoVoExample);

    List<UserInfoVo> getUserInfoAll(PageBeanVo pageBeanVo);


    int insertBatch(List<UserInfoVo> userInfoVoList);

    UserInfoVo selectUserInfoById(Long userId);

    int updateUserInfoById(UserInfoVo userInfoVo);

    int updateUserInfoBatch(List<UserInfoVo> userInfoVos);
}
