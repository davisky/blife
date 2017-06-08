package com.blife.security.util;

import org.json.JSONObject;

/**
 * Created by chen on 2017/6/7.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe:
 */
public class JSONResult{
    public static String fillResultString(Integer status, String message, Object result){
        JSONObject jsonObject = new JSONObject(){{
            put("status", status);
            put("message", message);
            put("result", result);
        }};
        return jsonObject.toString();
    }
}
