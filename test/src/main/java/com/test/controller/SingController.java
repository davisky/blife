package com.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chen on 2017/6/6.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe:
 */
@RestController
@RequestMapping(value = "/sing")
public class SingController {

    Logger logger= LoggerFactory.getLogger(getClass());

    @GetMapping(value = "/t")
    public String t(){
        logger.info("哈哈哈嘿嘿或或或或或或或或或或或或或或或或或或或");
        return  "ok";
    }

    @GetMapping(value = "/t1")
    public String t1(){
        logger.info("xxxok======ok");
        return  "ok";
    }
}
