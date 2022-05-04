package com.wmx.jr.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wmx.jr.bean.PageBeanVo;
import com.wmx.jr.bean.UserInfoVo;
import com.wmx.jr.bean.UserInfoVoExample;
import com.wmx.jr.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("UserInfo")
@Api(tags = "用户基本信息操作控制类")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    /**
     * 返回所有的用户信息
     * @return
     */
    @ApiOperation(value = "获取所有的用户信息")
    @RequestMapping(value = "getUserInfo",method = RequestMethod.POST)
    public PageInfo<UserInfoVo> getUserInfo(int pageNum,int pageSize){


        PageHelper.startPage(pageNum,pageSize);
        UserInfoVoExample userInfoVoExample = new UserInfoVoExample();
        List<UserInfoVo> userInfoAll = userInfoService.getUserInfoAll(userInfoVoExample);
        PageInfo<UserInfoVo> userInfoVoPageInfo = new PageInfo<>(userInfoAll);
        return userInfoVoPageInfo;
    }

    @RequestMapping(value = "getUserInfoBy",method = RequestMethod.POST)
    public List<UserInfoVo> getUserInfoBy(int pageNum,int pageSize){
        PageBeanVo pageBeanVo = new PageBeanVo();
        pageBeanVo.setPageSize(pageSize);
        pageBeanVo.setStartRow((pageNum-1)*pageSize);

        List<UserInfoVo> userInfoAll = userInfoService.getUserInfoAll(pageBeanVo);
        return userInfoAll;
    }

    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public void insertUserInfo(){
        List<UserInfoVo> UserInfoList = new ArrayList<>();
        for(int i=0;i<5000;i++){
            UserInfoVo userInfoVo = new UserInfoVo();
            userInfoVo.setUserName("weimx"+i);
            userInfoVo.setUserPassword("111111");
            userInfoVo.setDepartmentId("1000"+1);
            userInfoVo.setTimes(1);
            userInfoVo.setCreateProper("ww");
            userInfoVo.setUpdateProper("");

            UserInfoList.add(userInfoVo);
        }
        userInfoService.insertBatch(UserInfoList);
    }

    @RequestMapping(value = "GetUserInfoById",method = RequestMethod.GET)
    public UserInfoVo GetUserInfoById(@RequestParam("UserId") String UserId){
        return userInfoService.selectUserInfoById(Long.parseLong(UserId));
    }

    @RequestMapping(value = "updateUserInfoById",method = RequestMethod.POST)
    public String updateUserInfoById(@RequestBody Map<String,Object> reqMap){
        String json = JSON.toJSONString(reqMap);
        JSONObject reqJson = JSONObject.parseObject(json);
        UserInfoVo userInfo = reqJson.getObject("updateUserInfo", UserInfoVo.class);
        int updateSize = userInfoService.updateUserInfoById(userInfo);
        return String.valueOf(updateSize);
    }
    @RequestMapping(value = "updateUserInfoBatch",method = RequestMethod.POST)
    public String updateUserInfoBatch(@RequestBody Map<String,Object> reqMap){
        String reqJson = JSON.toJSONString(reqMap);
        JSONObject reqObject = JSONObject.parseObject(reqJson);
        ArrayList<UserInfoVo> arrayList = reqObject.getObject("updateUserInfo", ArrayList.class);
        int i = userInfoService.updateUserInfoBatch(arrayList);
        return "";
    }

}
