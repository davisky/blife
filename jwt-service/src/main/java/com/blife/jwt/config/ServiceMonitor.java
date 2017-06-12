package com.blife.jwt.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.boot.actuate.metrics.GaugeService;
import org.springframework.stereotype.Component;

/**
 * Created by chen on 2017/6/12.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe:
 */
@Aspect
@Component
public class ServiceMonitor {
    @Autowired
    private CounterService counterService;
    @Before("execution(* com.blife.jwt.controller.*.*(..))")
    public void countServiceInvoke(JoinPoint joinPoint) {
        counterService.increment(joinPoint.getSignature() + "");
    }

    @Autowired
    private GaugeService gaugeService;
    @Around("execution(* com.blife.jwt.controller.*.*(..))")
    public void latencyService(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        pjp.proceed();
        long end = System.currentTimeMillis();
        gaugeService.submit(pjp.getSignature().toString(), end - start);
    }
}