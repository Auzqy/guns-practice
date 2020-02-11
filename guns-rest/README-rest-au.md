[TOC]

# Guns rest V4.2 —— by au

### Guns 整合

> 导入数据库表 guns-rest/db/guns_rest.sql
> 修改 yml 文件

> 运行 guns-rest GunsRestApplication
> 后台测试用户: admin 密码: admin

#### 请求接口
1. 获取 token（POST 或者 GET 都是可以的）
http://localhost:8080/auth?userName=admin&password=admin

2. 访问所需接口
请求 header 中需要携带
key:    "Authorization"
value:  "Bearer ${token}"

获得加密后的请求信息（因为没有前端，自己模拟一下）
使用 src/test/java/com/stylefeng/guns/jwt/DecryptTest.java
将获得的结果，作为请求体发送（JSON.toJSONString(baseTransferEntity)）


## 添加定制模块

### 1. 新建数据库表
eg: guns-rest/db/guns_rest.sql

### 2. 代码生成 
src/test/java/com/stylefeng/guns/generator/EntityGenerator.java
