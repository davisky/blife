package com.blife.sys.model;


import com.blife.commone.model.BaseEntity;

import java.io.Serializable;

/**
 * Created by chen on 2017/3/31.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe: 区域信息表。
 */
public class SysArea extends BaseEntity<SysArea> {

    /**
     * varchar(64) NULL名称
     */
    private String name;
    /**
     * int(11) NULL排序
     */
    private Integer sort;
    /**
     * varchar(64) NULLdkey
     */
    private String jkey;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getJkey() {
        return jkey;
    }

    public void setJkey(String jkey) {
        this.jkey = jkey;
    }

    @Override
    public void preInsert(Long insertUserId) {

    }

    @Override
    public void preUpdate(Long updateUserId) {

    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
