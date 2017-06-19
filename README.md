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
![请求流程](https://github.com/javanan/blife/readme/dbprocess.png)