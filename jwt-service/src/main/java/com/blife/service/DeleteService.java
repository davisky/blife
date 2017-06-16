package com.blife.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by chen on 2017/5/10.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe: 删除key服务
 */
@Service
public class DeleteService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 删除redis的一个key
     * @param key
     */
    public void delete(String key){
        stringRedisTemplate.delete(key);
    }
}
