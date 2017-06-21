package com.blife.controller;

import com.blife.enumns.HttpCodeEnum;
import com.blife.exception.BlifeException;
import com.blife.model.ReturnDTO;
import com.blife.service.LoginService;
import com.blife.util.ReqParamVerification;
import com.blife.util.ReturnDTOUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private LoginService loginService;

    /**
     * web 端登录
     *
     * @param username 用户名
     * @param password 密码
     * @param code     验证码
     * @return
     */

    @RequestMapping(value = "/v1/web", method = RequestMethod.POST)
    public ReturnDTO webLogin(@RequestParam("username") String username, @RequestParam("password") String password,
                              @RequestParam(value = "code", required = false) String code) throws Exception {

        //校验参数
        if (!ReqParamVerification.passwod(password) || !ReqParamVerification.username(username)) {
            logger.info("参数校验失败。");
            throw new BlifeException(HttpCodeEnum.USERNAME_OR_PASSWORD_ERR);
        }

        //登录逻辑
        String token = loginService.webLogin(username, password, code);
        // ctrl+b 热部署测试;
        //String token = "dd";

        return ReturnDTOUtil.success(token);
    }

    /**
     * 移动端登录
     *
     * @return
     */
    @RequestMapping(value = "/v1/phone", method = RequestMethod.POST)
    public ReturnDTO phoneLogin() {
        ReturnDTO returnDto = new ReturnDTO();
        return returnDto;
    }


}
