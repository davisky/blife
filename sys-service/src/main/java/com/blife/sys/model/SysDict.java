package com.blife.sys.model;

import com.blife.commone.model.TreeEntity;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

/**
 * Created by chen on 2017/4/10.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe: 系统数据字典 实体类
 */
public class SysDict extends TreeEntity<SysDict> {

    private String jkey; //varchar(64) NULLkey
    private String jvalue; //varchar(1000) NULLvalue

    /**
     * varchar(64)NULL所在公司id
     */
    private String sysCompanyId;

    @Length(min = 0, max = 64, message = "key长度必须介于 1 和 64 之间")
    public String getJkey() {
        return jkey;
    }

    public void setJkey(String jkey) {
        this.jkey = jkey;
    }

    @Length(min = 0, max = 1000, message = "value长度必须介于 1 和 1000 之间")
    public String getJvalue() {
        return jvalue;
    }

    public void setJvalue(String jvalue) {
        this.jvalue = jvalue;
    }

    @Length(min = 0, max = 64, message = "公司id长度必须介于 1 和 64 之间")
    public String getSysCompanyId() {
        return sysCompanyId;
    }

    public void setSysCompanyId(String sysCompanyId) {
        this.sysCompanyId = sysCompanyId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
