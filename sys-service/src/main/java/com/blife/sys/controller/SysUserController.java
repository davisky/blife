package com.blife.sys.controller;

import com.blife.commone.model.ReturnDTO;
import com.blife.commone.util.ReturnDTOUtil;
import com.blife.sys.model.SysUser;
import com.blife.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chen on 2017/5/19.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe:
 */
@RestController
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping(value = "/v1/add",method = RequestMethod.POST)
    public void add(@RequestParam("username") String username,@RequestParam("password") String password){
        SysUser sysUser=new SysUser();
        sysUser.setPassword(password);
        sysUser.setLoginName(username);
        sysUserService.addUser(sysUser);
    }

    @RequestMapping(value = "/v1/getbyid",method = RequestMethod.GET)
    public ReturnDTO add(@RequestParam("id") String id){

        return ReturnDTOUtil.success(sysUserService.getById(id));
    }

    @RequestMapping(value = "/v1/add1",method = RequestMethod.GET)
    public void add(){
        SysUser sysUser=new SysUser();
        sysUser.setPassword("1");
        sysUser.setLoginName("!");
        sysUserService.addUser(sysUser);
    }
}
