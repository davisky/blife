package com.blife.service;

import com.blife.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by chen on 2017/5/12.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe: 刷新token
 */
@Service
public class RefreshService {
    @Autowired
    private SaveService saveService;
    @Autowired
    private FetchService fetchService;

    /**
     * 刷新token的有效时间
     * @param jwt
     * @return
     */
    public boolean refersh(@RequestParam("jwt")String jwt){
        String value=fetchService.fetch(jwt);
        if (!StringUtils.isEmpty(value)) {
            saveService.save(jwt,value);
            return true;
        }
        return false;
    }
}
