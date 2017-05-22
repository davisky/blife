package com.blife.sys.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by chen on 2017/5/22.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe:
 */
@Aspect
@Component
public class DataSourceAop {
    private  Logger logger = LoggerFactory.getLogger(getClass());

    @Before("execution(* com.blife.sys.repository..*.select*(..)) || execution(* com.blife.sys.repository..*.get*(..))")
    public void setReadDataSourceType() {
        DataSourceContextHolder.read();
        logger.info("dataSource切换到：Read");
    }

    @Before("execution(* com.blife.sys.repository..*.insert*(..)) || execution(* com.blife.sys.repository..*.update*(..))")
    public void setWriteDataSourceType() {
        DataSourceContextHolder.write();
        logger.info("dataSource切换到：write");
    }
}
