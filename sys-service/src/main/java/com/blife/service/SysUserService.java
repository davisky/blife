package com.blife.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.blife.model.SysUser;
import com.blife.repository.SysUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by chen on 2017/4/21.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe: 系统用户service
 */
@Service
@Transactional(readOnly = true)
@CacheConfig(cacheNames = "cache:")
public class SysUserService extends ServiceImpl<SysUserDao, SysUser> {

    @Autowired
    private SysUserDao sysUserDao;


    @Cacheable(cacheNames = "user",key="#id")
    public SysUser getById(String id) {
        return sysUserDao.selectById(id);
    }


    @Transactional(readOnly = false)
    public int addUser(SysUser sysUser) {
        return sysUserDao.insert(sysUser);
    }


    @Cacheable(cacheNames = "user",key="#username")
    public void login(String username, String password) {
    }
}
