package com.blife.sign.controller;

import com.blife.commone.model.ReturnDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chen on 2017/5/8.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe:登录的控制器
 */
@RequestMapping(value = "/login")
@RestController
public class LoginController {

    /**
     * web 端登录
     *
     * @return
     */
    @RequestMapping(value = "/v1/web", method = RequestMethod.POST)
    public ReturnDTO webLogin() {
        ReturnDTO returnDto = new ReturnDTO();
        return returnDto;
    }
}
