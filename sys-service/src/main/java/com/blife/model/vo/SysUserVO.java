package com.blife.model.vo;

import com.baomidou.mybatisplus.annotations.TableName;
import com.blife.model.SysCompany;
import com.blife.model.SysRole;
import com.blife.model.SysUser;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by chenjianan on 2016/12/13-20:00.
 * <p>
 * Describe: 系统用户bean
 */
@TableName("sys_user")
public class SysUserVO extends SysUser {
    private SysRole sysRole;    // 根据角色查询用户条件
    private List<SysRole> sysRoleList = Lists.newArrayList(); // 拥有角色列表

    private SysCompany sysCompany;    // 归属公司

    @JsonIgnore
    public SysRole getSysRole() {
        return sysRole;
    }

    public void setSysRole(SysRole sysRole) {
        this.sysRole = sysRole;
    }

    @JsonIgnore
    public List<SysRole> getSysRoleList() {
        return sysRoleList;
    }

    public void setSysRoleList(List<SysRole> sysRoleList) {
        this.sysRoleList = sysRoleList;
    }

    @JsonIgnore
    public SysCompany getSysCompany() {
        return sysCompany;
    }

    public void setSysCompany(SysCompany sysCompany) {
        this.sysCompany = sysCompany;
    }
}
