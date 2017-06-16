package com.blife.util;

/**
 * Created by chen on 2017/6/16.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe: 请求参数 规则 校验
 */
public class ReqParamVerification {
    /**
     * 用户名最少长度
     */
    private static final int USERNAMELENGTH=6;

    /**
     * 密码最少长度
     */
    private static final int PASSWORDENGTH=8;

    /**
     * 用户名规则校验
     *
     * @param username
     * @return
     */
    public static boolean username(String username) {
        if (StringUtils.isEmpty(username)) {
            return false;
        }
        if (username.length() < USERNAMELENGTH) {
            return false;
        }
        // TODO 更多规则（根据客户需要）
        return true;
    }

    /**
     * 密码规则
     * @param passwod
     * @return
     */
    public static boolean passwod(String passwod) {
        if (StringUtils.isEmpty(passwod)) {
            return false;
        }
        if (passwod.length() < PASSWORDENGTH) {
            return false;
        }
        // TODO 更多规则（根据客户需要）
        return true;
    }
}
