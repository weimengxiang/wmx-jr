package com.wmx.jr.service.imp;

import com.wmx.jr.bean.PageBeanVo;
import com.wmx.jr.bean.UserInfoVo;
import com.wmx.jr.bean.UserInfoVoExample;
import com.wmx.jr.dao.UserInfoVoMapper;
import com.wmx.jr.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserInfoServiceImp implements UserInfoService {

    @Autowired
    private UserInfoVoMapper userInfoVoMapper;

    @Override
    public List<UserInfoVo> getUserInfoAll(UserInfoVoExample userInfoVoExample) {
        List<UserInfoVo> userInfoVos = userInfoVoMapper.selectByExample(userInfoVoExample);
        return userInfoVos;
    }

    @Override
    public List<UserInfoVo> getUserInfoAll(PageBeanVo pageBeanVo) {

        return userInfoVoMapper.selectUserInfoAll(pageBeanVo);
    }

    @Override
    public int insertBatch(List<UserInfoVo> userInfoVoList) {
        int size = userInfoVoMapper.insertBatch(userInfoVoList);
        return size;
    }

    @Override
    public UserInfoVo selectUserInfoById(Long userId) {
        return userInfoVoMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int updateUserInfoById(UserInfoVo userInfoVo) {
        return userInfoVoMapper.updateByPrimaryKeySelective(userInfoVo);
    }

    @Override
    public int updateUserInfoBatch(List<UserInfoVo> userInfoVos) {
        userInfoVoMapper.updateUserInfoBatch(userInfoVos);
        return 0;
    }

}
