package com.blife.commone.util;

/**
 * Created by chen on 2017/5/12.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe: 字符串工具类
 */
public class StringUtils {

    /**
     * 判断字符串是否为null 或者length==0
     * @param s
     * @return 是返回 true 否 返回false
     */
    public static boolean isEmpty(String s) {
        if (null == s || s.length() == 0) {
            return true;
        }
        return false;
    }
}
