package com.blife.model;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by chen on 2017/6/1.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe:
 */
public class JwtRole implements GrantedAuthority {
    @Override
    public String getAuthority() {
        return code;
    }

    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public JwtRole(String code) {
        this.code = code;
    }

    public JwtRole() {
    }
}
