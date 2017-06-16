package com.blife.exception;

/**
 * Created by chen on 2017/6/9.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe:
 */
public class ParamException extends RuntimeException {

    public ParamException(String code, String name) {

        this.code = code;
        this.name = name;
    }

    private String code;
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
