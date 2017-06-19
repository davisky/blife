package com.blife.client.impl;

import com.blife.client.LoginClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by chen on 2017/6/19.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe:
 */
@Component
public class LoginClientImple implements LoginClient {

    private Logger logger= LoggerFactory.getLogger(getClass());
    @Override
    public String webLogin(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password) {
        logger.error("webLogin 登录，调用security-service 失败，进入熔断.");
        return null;
    }
}
