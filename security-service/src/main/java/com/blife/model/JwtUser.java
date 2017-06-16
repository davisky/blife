package com.blife.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

/**
 * Created by chen on 2017/6/1.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe:
 */
public class JwtUser implements UserDetails {



    private List<JwtRole> jwtRoles;

    public List<JwtRole> getJwtRoles() {
        return jwtRoles;
    }

    public void setJwtRoles(List<JwtRole> jwtRoles) {
        this.jwtRoles = jwtRoles;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return jwtRoles;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }



    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
