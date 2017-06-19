package com.blife.service;

import com.blife.client.LoginClient;
import com.blife.exception.BlifeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by chen on 2017/6/16.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe:
 */
@Service
public class LoginService {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private LoginClient loginClient;
    /**
     * web 端登录
     * @param usermame
     * @param password
     * @param code
     */
    public String webLogin(String usermame, String password, String code) {
      return   loginClient.webLogin(usermame,password);

    }
}
