package com.blife.exception;

import com.blife.model.ReturnDTO;

/**
 * Created by chen on 2017/6/16.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe: 登录异常
 */
public class LoginException extends BlifeException {

    public LoginException(ReturnDTO returnDTO) {
        super(returnDTO);
    }

    public LoginException(String error) {
        super(error);
    }

    public LoginException(int code, String error) {
        super(code, error);
    }
}
