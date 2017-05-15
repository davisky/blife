package com.blife.jwt.controller;

import com.blife.jwt.service.UpdateService;
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
 * Describe: 更新token
 */
@RestController
@RequestMapping(value = "/update")
public class UpdateController {

    @Autowired
    private UpdateService updateService;
    /**
     * 更新token
     * 用户使用jwt 换取一个新的jwt，并从redis中删除原来的jwt值，加入新的jwt，
     * @param jwt
     * @return
     */
    @RequestMapping(value = "/v1",method = RequestMethod.POST)
    public String update(@RequestParam("jwt")String jwt){
        return  updateService.update(jwt);
    }
}
