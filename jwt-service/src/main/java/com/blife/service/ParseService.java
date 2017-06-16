package com.blife.service;

import com.blife.constant.Constant;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;

/**
 * Created by chen on 2017/5/12.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe: jwt 的 解析
 */
@Service
public class ParseService {

    /**
     * 解析 jwt
     * @param jwt
     * @return
     * @throws Exception
     */
    public Claims parseJWT(String jwt) throws Exception {
        SecretKey key = Constant.generalKey();
        Claims claims = Jwts.parser()
                .setSigningKey(key)
                .parseClaimsJws(jwt).getBody();
        return claims;
    }
}
