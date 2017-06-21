package com.blife.util;

import com.xiaoleilu.hutool.json.JSONObject;
import com.xiaoleilu.hutool.json.JSONUtil;

/**
 * Created by chen on 2017/6/20.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe: json 工具类
 */
public class Json {


    /**
     * 转为实体类对象，转换异常将被抛出
     *
     * @param json      String
     * @param beanClass 实体类对象
     * @return 实体类对象
     */
    public static <T> T toBean(String json, Class<T> beanClass) {
        JSONObject jsonObject = JSONUtil.parseObj(json);
        return JSONUtil.toBean(jsonObject, beanClass, false);
    }

}
