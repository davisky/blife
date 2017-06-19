package com.blife.client;

import com.blife.client.impl.LoginClientImple;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by chen on 2017/6/19.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe: 登录客户端
 */

@FeignClient(value ="security-service" ,fallback = LoginClientImple.class)
public interface LoginClient {

        @PostMapping(value = "/login")
        String webLogin(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password);


}
