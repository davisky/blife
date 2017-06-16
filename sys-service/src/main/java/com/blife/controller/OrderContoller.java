package com.blife.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chen on 2017/6/1.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe:
 */
@RestController
public class OrderContoller {


    @ApiOperation(value = "获取未发货订单", notes = "获取未发货订单列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "value", value = "", required = true, dataType = "string")
    })
    @RequestMapping(value = "/v1/order/list/m",method = RequestMethod.GET)
    public void test1(){

    }

    @ApiOperation(value = "获取未发货订单详情", notes = "获取未发货订单详情根据id")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "value", value = "订单id", required = true, dataType = "string")
    })
    @RequestMapping(value = "/v1/order/{id}",method = RequestMethod.GET)
    public void test2(){

    }

    @ApiOperation(value = "修改某个订单", notes = "修改某个订单")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "value", value = "订单id", required = true, dataType = "string")
    })
    @RequestMapping(value = "/v1/order/{id}",method = RequestMethod.POST)
    public void test12(){

    }

    @ApiOperation(value = "获取已发货订单详情", notes = "获取已发货订单详情根据id")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "value", value = "用户id", required = true, dataType = "string")
    })
    public void test3(){

    }

    @ApiOperation(value = "获取订单号", notes = "获取订单号")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "value", value = "", required = true, dataType = "string")
    })
    @RequestMapping(value = "/v1/order/number/{id}",method = RequestMethod.GET)
    public void test4(){

    }




    @ApiOperation(value = "获取不符合规定订单列表", notes = "获取不符合规定订单列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "value", value = "", required = true, dataType = "string")
    })
    @RequestMapping(value = "/v1/order/list/v",method = RequestMethod.GET)
    public void test5(){

    }




    @ApiOperation(value = "获取某个客户订单列表", notes = "获取某个客户订单列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "value", value = "用户id", required = true, dataType = "string")
    })
    @RequestMapping(value = "/v1/order/list/user",method = RequestMethod.GET)
    public void test6(){

    }

}
