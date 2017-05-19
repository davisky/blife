package com.blife.sys.model.vo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.blife.commone.constant.Global;
import com.blife.commone.model.DataEntity;
import com.blife.sys.model.SysCompany;
import com.blife.sys.model.SysRole;
import com.blife.sys.model.SysUser;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.collect.Lists;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;
import java.util.Date;
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
