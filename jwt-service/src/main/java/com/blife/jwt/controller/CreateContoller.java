package com.blife.jwt.controller;

import com.blife.jwt.service.CreateService;
import com.blife.jwt.service.SaveService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by chen on 2017/5/9.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe: 创建 jwt
 */
@RestController
@RequestMapping(value = "/create")
public class CreateContoller {


    @Autowired
    private CreateService createService;
    @Autowired
    private SaveService saveService;


    @ApiOperation(value = "创建token", notes = "创建token根据用户的id")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "value", value = "用户id", required = true, dataType = "string")
    })
/*    @ApiResponses(value = {
            @ApiResponse(code = 100,message = "返回100的错误")
    })*/
    /**
     * 根据用户提供的 value 创建一个 jwt字符串，并用该jwt做key，用户的value做value存入redis，设置有效时间为${jwt.valid.time}
     * 主要用于用户登录的jwt 用。
     * @param value
     * @return
     */
    @RequestMapping(value = "/v1/{value}", method = RequestMethod.GET)
    public String create(@PathVariable(value = "value") String value) {
        String jwt = createService.create(value);
        saveService.save(jwt,value); //保存到redis
        return jwt;
    }
}
