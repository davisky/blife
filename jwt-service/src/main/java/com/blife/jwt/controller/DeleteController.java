package com.blife.jwt.controller;

import com.blife.jwt.service.DeleteService;
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
 * Describe: 删除token
 */
@RestController
@RequestMapping(value = "/delete")
public class DeleteController {

    @Autowired
    private DeleteService deleteService;
    /**
     * 删除token，使用用户提供的jwt，把改key 从redis中删除
     * 如要使用在用户登出
     * @param jwt
     * @return
     */
    @RequestMapping(value = "/v1",method = RequestMethod.POST)
    public boolean delete(@RequestParam("jwt")String jwt){
        deleteService.delete(jwt); //从redis中删除jwt
        return true;
    }
}
