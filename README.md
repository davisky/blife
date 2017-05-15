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



