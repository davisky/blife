**pom管理**

```
           <groupId>com.blife</groupId>
           <artifactId>blife</artifactId>
```

   不同的模块用 xxx-service 命名，如 config-service



**包名管理**

   包名用 com.blife.xx   如 config-service 模块的包名 com.blife.config




**接口命名规则**

   控制器类中，@RestController 不写  @RequestMapping
   方法中 写`@RequestMapping(value = "/v1/xx",method = RequestMethod.POST)` xx 表示功能，v1，表示版本号，如果新增版本，则新增方法。v2...




**http状态码**

200 OK - [GET]：服务器成功返回用户请求的数据，该操作是幂等的（Idempotent）。

400 INVALID REQUEST - [POST/PUT/PATCH]：用户发出的请求有错误，服务器没有进行新建或修改数据的操作，该操作是幂等的。

401 Unauthorized - [*]：表示用户没有权限（令牌、用户名、密码错误）。

403 Forbidden - [*] 表示用户得到授权（与401错误相对），但是访问是被禁止的。

404 NOT FOUND - [*]：用户发出的请求针对的是不存在的记录，服务器没有进行操作，该操作是幂等的。

406 Not Acceptable - [GET]：用户请求的格式不可得（比如用户请求JSON格式，但是只有XML格式）。

410 Gone -[GET]：用户请求的资源被永久删除，且不会再得到的。

422 Unprocesable entity - [POST/PUT/PATCH] 当创建一个对象时，发生一个验证错误。

500 INTERNAL SERVER ERROR - [*]：服务器发生错误，用户将无法判断发出的请求是否成功。

00 UN_KNOW_ERROR - 未知错误。

**权限**
 使用全类名+方法名做匹配


**注意**
 1、不要在熔断器中抛异常。


**使用方式**

 1、如果遇到业务上的异常，使用BlifeException：如 用户名密码参数验证不通过
 ```

        //校验参数
        if (!ReqParamVerification.passwod(password) || !ReqParamVerification.username(username)) {
            logger.info("参数校验失败。");
            throw new BlifeException(HttpCodeEnum.USERNAME_OR_PASSWORD_ERR);
        }

使用 throw new BlifeException(HttpCodeEnum.USERNAME_OR_PASSWORD_ERR);  抛异常的方式
 ```

2、操作返回 使用 ReturnDTOUtil 如
```
    return ReturnDTOUtil.success(token);
```


请求流程
![请求流程](data:image/png;base64,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)
