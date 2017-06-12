package com.blife.sys.controller;

import com.blife.commone.model.ReturnDTO;
import com.blife.commone.util.ReturnDTOUtil;
import com.blife.sys.exception.ParamException;
import com.blife.sys.model.SysMenu;
import com.blife.sys.model.SysUser;
import com.blife.sys.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

/**
 * Created by chen on 2017/5/19.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe:
 */
@RestController
public class SysUserController {

    Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private SysUserService sysUserService;

    @RequestMapping(value = "/v1/login", method = RequestMethod.POST)
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {

        return "token";
    }


    @RequestMapping(value = "/v1/add", method = RequestMethod.POST)
    public void add(@RequestParam("username") String username, @RequestParam("password") String password) {
        SysUser sysUser = new SysUser();
        sysUser.setPassword(password);
        sysUser.setLoginName(username);
        sysUserService.addUser(sysUser);
    }

    @RequestMapping(value = "/v1/getbyid", method = RequestMethod.GET)
    public ReturnDTO add(@RequestParam("id") String id) {

        String method = Thread.currentThread().getStackTrace()[1].getMethodName();
        logger.info(method);
        logger.info(String.valueOf(getClass()));
        return ReturnDTOUtil.success(sysUserService.getById(id));
    }

    @RequestMapping(value = "/v1/add1", method = RequestMethod.GET)
    public void add() {
        SysUser sysUser = new SysUser();
        sysUser.setPassword("1");
        sysUser.setLoginName("!");
        sysUserService.addUser(sysUser);
    }

    @RequestMapping(value = "/cache/{s}/{cs}", method = RequestMethod.GET)
    @Cacheable(value = "test",key = "d")
    public ReturnDTO cache(@PathVariable("s") int s,@PathVariable("cs") String cs) {

        SysMenu sysMenu = new SysMenu();
        if (s == 1) {

            sysMenu.setName("1");
            sysMenu.setPath(cs);
        }
        if (s == 2) {
            sysMenu.setName("2");
            sysMenu.setPath(cs);
        }
        return ReturnDTOUtil.success(sysMenu);
    }


    @RequestMapping(value = "/cache", method = RequestMethod.PUT)
    @CachePut(value = "test",key = "#sysMenu.name")
    public ReturnDTO upcache(SysMenu sysMenu) {

        return ReturnDTOUtil.success(sysMenu);
    }
}
