package com.blife.jwt.service;

import com.blife.commone.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by chen on 2017/5/12.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe: 更新token
 */
@Service
public class UpdateService {
    @Autowired
    private FetchService fetchService;
    @Autowired
    private CreateService createService;
    @Autowired
    private DeleteService deleteService;
    @Autowired
    private SaveService saveService;

    /**
     * 删除原来的jwt 创建一个新的，保存到redis
     * @param jwt
     * @return
     */
    public String update(String jwt){
        String value=fetchService.fetch(jwt);
        if (!StringUtils.isEmpty(value)) {
            deleteService.delete(jwt);
            jwt=  createService.create(value);
            saveService.save(jwt,value);
            return jwt;
        }
        return null;
    }


}
