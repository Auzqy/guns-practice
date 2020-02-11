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

## 添加定制模块

### 1. 新建数据库表
eg: guns-rest/db/guns_rest.sql

### 2. 代码生成 
src/test/java/com/stylefeng/guns/generator/EntityGenerator.java

### 3. 产生管理菜单目录（即系统管理->菜单管理）
3.1 执行生成后的 guns-admin/src/main/java/House.sql
3.2 通过（系统管理->菜单管理）配置 所需的页面层级
3.3 通过（系统管理->角色管理）配置 可以看到该页面的角色，刷新后即可看到该页面
3.4 编辑对应的页面，以满足需要的显示需求


## au 认为可以优化的地方

### todo 1. 为每一个list添加查询条件，放到list列表旁边，弹出框的形式
### todo 2. 把生成的模版改成 lombok