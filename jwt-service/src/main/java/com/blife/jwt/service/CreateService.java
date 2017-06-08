package com.blife.jwt.service;

import com.blife.jwt.constant.Constant;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.crypto.SecretKey;
import java.util.Date;
import java.util.Map;

/**
 * Created by chen on 2017/5/10.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe: 创建 jwt
 */
@Service
public class CreateService {


    /**
     * 创建一个 新的jwt
     *
     * @param value
     * @return
     */
    public String create(String value/*,Map<String, Object> claims*/) {

        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);
        SecretKey key = Constant.generalKey();
        JwtBuilder builder = Jwts.builder()
                .setIssuer(Constant.JWT_ISSUSER)
                .setId(String.valueOf(value))/*.setClaims(claims)*/
                .setIssuedAt(now)
                .setSubject(value)
                .signWith(signatureAlgorithm, key);
/*        if (ttlMillis >= 0) {
            long expMillis = nowMillis + ttlMillis;
            Date exp = new Date(expMillis);
            builder.setExpiration(exp);
        }*/
        return builder.compact();
    }

}
