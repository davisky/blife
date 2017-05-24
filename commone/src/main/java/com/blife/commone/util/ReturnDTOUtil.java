package com.blife.commone.util;


import com.blife.commone.enumns.HttpCodeEnum;
import com.blife.commone.model.ReturnDTO;

/**
 * 返回工具类
 */
public class ReturnDTOUtil {


    /**
     * 请求成功
     * @return
     */
    public static ReturnDTO success() {
        return new ReturnDTO(HttpCodeEnum.OK.getCode(), HttpCodeEnum.OK.getMessage());
    }


    /**
     * 成功请求
     *
     * @param data
     * @return
     */
    public static ReturnDTO success(Object data) {
        return new ReturnDTO(HttpCodeEnum.OK.getCode(), data);
    }


    /**
     * 参数错误
     * @return
     */
    public static ReturnDTO paramError() {
        return new ReturnDTO(HttpCodeEnum.INVALID_REQUEST.getCode(), HttpCodeEnum.INVALID_REQUEST.getMessage());
    }

    /**
     * 参数错误
     * @param data
     * @return
     */
    public static ReturnDTO paramError(Object data) {
        return new ReturnDTO(HttpCodeEnum.INVALID_REQUEST.getCode(), HttpCodeEnum.INVALID_REQUEST.getMessage(), data);
    }

    /**
     * 没有权限
     * @return
     */
    public static ReturnDTO unAuthorized() {
        return new ReturnDTO(HttpCodeEnum.UNAUTHORIZED.getCode(),HttpCodeEnum.UNAUTHORIZED.getMessage());
    }

    /**
     * 没有权限
     * @param data
     * @return
     */
    public static ReturnDTO unAuthorized(Object data) {
        return new ReturnDTO(HttpCodeEnum.UNAUTHORIZED.getCode(),HttpCodeEnum.UNAUTHORIZED.getMessage(),data);
    }


    /**
     *  禁止访问
     * @return
     */
    public static ReturnDTO forbidden() {
        return new ReturnDTO(HttpCodeEnum.FORBIDDEN.getCode(),HttpCodeEnum.FORBIDDEN.getMessage());
    }

    /**
     * 禁止访问
     * @param data
     * @return
     */
    public static ReturnDTO forbidden(Object data) {
        return new ReturnDTO(HttpCodeEnum.FORBIDDEN.getCode(),HttpCodeEnum.FORBIDDEN.getMessage(), data);
    }


    /**
     * 资源不存在
     * @return
     */
    public static ReturnDTO notFound() {
        return new ReturnDTO(HttpCodeEnum.NOT_FOUND.getCode(),HttpCodeEnum.NOT_FOUND.getMessage());
    }


    /**
     * 资源不存在
     * @param data
     * @return
     */
    public static ReturnDTO notFound(Object data) {
        return new ReturnDTO(HttpCodeEnum.NOT_FOUND.getCode(),HttpCodeEnum.NOT_FOUND.getMessage(), data);
    }


    /**
     * 请求的格式不正确
     * @return
     */
    public static ReturnDTO notAcceptable() {
        return new ReturnDTO(HttpCodeEnum.NOT_ACCEPTABLE.getCode(),HttpCodeEnum.NOT_ACCEPTABLE.getMessage());
    }


    /**
     * 请求的格式不正确
     * @param data
     * @return
     */
    public static ReturnDTO notAcceptable(Object data) {
        return new ReturnDTO(HttpCodeEnum.NOT_ACCEPTABLE.getCode(),HttpCodeEnum.NOT_ACCEPTABLE.getMessage(), data);
    }


    /**
     * 数据已经被删除
     * @return
     */
    public static ReturnDTO gone() {
        return new ReturnDTO(HttpCodeEnum.GONE.getCode(),HttpCodeEnum.GONE.getMessage());
    }


    /**
     * 数据已经被删除
     * @param data
     * @return
     */
    public static ReturnDTO gone(Object data) {
        return new ReturnDTO(HttpCodeEnum.GONE.getCode(),HttpCodeEnum.GONE.getMessage(), data);
    }


    /**
     * 实体参数校验错误
     * @return
     */
    public static ReturnDTO unprocesableEntity() {
        return new ReturnDTO(HttpCodeEnum.UNPROCESABLE_ENTITY.getCode(),HttpCodeEnum.UNPROCESABLE_ENTITY.getMessage());
    }


    /**
     * 实体参数校验错误
     * @param data
     * @return
     */
    public static ReturnDTO unprocesableEntity(Object data) {
        return new ReturnDTO(HttpCodeEnum.UNPROCESABLE_ENTITY.getCode(),HttpCodeEnum.UNPROCESABLE_ENTITY.getMessage(), data);
    }


    /**
     * 服务器错误
     * @return
     */
    public static ReturnDTO error() {
        return new ReturnDTO(HttpCodeEnum.INTERNAL_SERVER_ERROR.getCode(),HttpCodeEnum.INTERNAL_SERVER_ERROR.getMessage());
    }


    /**
     * 服务器错误
     * @param data
     * @return
     */
    public static ReturnDTO error(Object data) {
        return new ReturnDTO(HttpCodeEnum.INTERNAL_SERVER_ERROR.getCode(),HttpCodeEnum.INTERNAL_SERVER_ERROR.getMessage(), data);
    }

    /**
     * 未知错误
     * @return
     */
    public static ReturnDTO unKnowError() {
        return new ReturnDTO(HttpCodeEnum.UN_KNOW_ERROR.getCode(),HttpCodeEnum.UN_KNOW_ERROR.getMessage());
    }

    /**
     * 未知错误
     * @param data
     * @return
     */
    public static ReturnDTO unKnowError(Object data) {
        return new ReturnDTO(HttpCodeEnum.UN_KNOW_ERROR.getCode(),HttpCodeEnum.UN_KNOW_ERROR.getMessage(), data);
    }


    /**
     * 自定义返回
     * @param error
     * @param data
     * @return
     */
    public static ReturnDTO custom(int code,String error,Object data) {
        return new ReturnDTO(code,error,data);
    }
}
