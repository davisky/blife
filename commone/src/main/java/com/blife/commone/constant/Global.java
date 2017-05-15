package com.blife.commone.constant;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Created by chen on 2017/5/15.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe: 全局常量
 */
public class Global {


    /**
     * 当前对象实例
     */
    private static Global global = new Global();

    /**
     * 保存全局属性值
     */
    private static Map<String, String> map = Maps.newHashMap();



    /**
     * 是/否
     */
    public static final String YES = "Y";
    public static final String NO = "N";



    /**
     * 上传文件基础虚拟路径
     */
    public static final String USERFILES_BASE_URL = "/userfiles/";

    /**
     * 获取当前对象实例
     */
    public static Global getInstance() {
        return global;
    }




    /**
     * 页面获取常量
     * @see {fns:getConst('YES')}
     */
    public static Object getConst(String field) {
        try {
            return Global.class.getField(field).get(null);
        } catch (Exception e) {
            // 异常代表无配置，这里什么也不做
        }
        return null;
    }


}
