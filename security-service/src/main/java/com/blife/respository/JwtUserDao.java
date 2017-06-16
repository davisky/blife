package com.blife.respository;

import com.blife.model.JwtUser;

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