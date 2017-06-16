package com.blife.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

/**
 * Created by chen on 2017/6/16.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe: spring  容器操作工具
 */
@Configuration
public class BeanTool implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;

    }

    /**
     * 获取容器bean
     *
     * @param classname
     * @return
     */
    public static Object getBean(Class classname) {
        try {
            Object restTemplate = applicationContext.getBean(classname);
            return restTemplate;
        } catch (Exception e) {
            return "";
        }
    }


}
