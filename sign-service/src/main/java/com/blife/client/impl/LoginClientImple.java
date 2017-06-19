package com.blife.client.impl;

import com.blife.client.LoginClient;
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

    @Override
    public String webLogin(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password) {
        return null;
    }
}
