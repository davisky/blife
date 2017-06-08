package com.blife.security.respository;

import com.blife.security.model.JwtUser;
import org.mybatis.spring.annotation.MapperScan;

/**
 * Created by chen on 2017/6/1.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe:
 */

public interface JwtUserDao {

    JwtUser loadUserByUsername(String username);

}