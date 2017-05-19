package com.blife.sys.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.blife.sys.model.SysUser;
import com.blife.sys.repository.SysUserDao;
import org.springframework.beans.factory.annotation.Autowired;
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
public class SysUserService extends ServiceImpl<SysUserDao, SysUser> {

    @Autowired
    private SysUserDao sysUserDao;

    public SysUser getById(String id) {
        return sysUserDao.selectById(id);
    }

    @Transactional(readOnly = false)
    public int addUser(SysUser sysUser) {
        return sysUserDao.insert(sysUser);
    }



}
