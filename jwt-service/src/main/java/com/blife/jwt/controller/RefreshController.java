package com.blife.jwt.controller;

import com.blife.jwt.service.RefreshService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chen on 2017/5/10.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe: 刷新 token
 */
@RestController
@RequestMapping(value = "/refersh")
public class RefreshController {

    @Autowired
    private RefreshService refreshService;

    /**
     * 刷新token
     * 使用用户提供 jwt ，刷新改jwt在redis的有效时间
     * @param jwt
     * @return
     */
    @RequestMapping(value = "/v1",method = RequestMethod.POST)
    public boolean refersh(@RequestParam("jwt")String jwt){
       return refreshService.refersh(jwt);
    }
}
