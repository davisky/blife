package com.blife.service;

import com.blife.constant.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * Created by chen on 2017/5/10.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe: 保存到 jwt  redis
 */
@Service
public class SaveService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    /**
     * 保存key，value 使用系统默认的固定时间消失（秒为单位）
     * @param jwt
     * @param value
     */
    public void save(String jwt,String value){
        stringRedisTemplate.opsForValue().set(jwt,value, Constant.ttlMillis, TimeUnit.SECONDS);
    }

    /**
     * 保存key，value 固定时间消失（秒为单位）
     * @param jwt
     * @param value
     * @param timeOutSecond
     */
    public void save(String jwt,String value,Long timeOutSecond){
        stringRedisTemplate.opsForValue().set(jwt,value,timeOutSecond, TimeUnit.SECONDS);
    }


}
