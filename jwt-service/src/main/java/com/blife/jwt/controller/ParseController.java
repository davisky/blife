package com.blife.jwt.controller;

import com.blife.jwt.service.FetchService;
import com.blife.jwt.service.ParseService;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chen on 2017/5/9.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe: jwt 解析控制器
 */
@RestController
@RequestMapping(value = "/parse")
public class ParseController {

    @Autowired
    private ParseService parseService;
    @Autowired
    private FetchService fetchService;

    /**
     * jwt 解析
     * 使用用户提供的jwt，解析为 header playload  signature
     *
     * @param jwt
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/v1", method = RequestMethod.POST)
    public Claims parseJWT(@RequestParam(value = "jwt") String jwt) throws Exception {
        if (fetchService.hasJwt(jwt)) {
            return parseService.parseJWT(jwt);//解析jwt字符串
        }
        return null;
    }
}
