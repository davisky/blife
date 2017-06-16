package com.blife.service;


import com.blife.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by chen on 2017/5/12.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe: 从redis 中获取jwt
 */
@Service
public class FetchService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 获取jwt的value
     *
     * @param jwt
     * @return
     */
    public String fetch(String jwt) {
        return stringRedisTemplate.opsForValue().get(jwt);
    }

    /**
     * 是否存在jwt
     *
     * @param jwt
     * @return 是 返回true ，否 返回false
     */
    public boolean hasJwt(String jwt) {
        String value = stringRedisTemplate.opsForValue().get(jwt);
        if (!StringUtils.isEmpty(value)) {
            return true;
        }
        return false;
    }
}
