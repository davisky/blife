package com.blife.security.service;

import com.blife.security.model.JwtUser;
import com.blife.security.respository.JwtUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by chen on 2017/6/1.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe:
 */
@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private JwtUserDao jwtUserDao;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
      JwtUser jwtUser=  jwtUserDao.loadUserByUsername(s);
        if (jwtUser == null) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", s));
        } else {
            return jwtUser;
        }
    }
}
