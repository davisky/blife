package com.blife.commone.model;

/**
 * Created by chen on 2017/5/8.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe: 返回的 数据模型
 */
public class ReturnDto {
    private boolean flag;
    private Object msg;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Object getMsg() {
        return msg;
    }

    public void setMsg(Object msg) {
        this.msg = msg;
    }
}
