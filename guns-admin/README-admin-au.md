[TOC]

# Guns admin V4.2 —— by au

## 导入、配置、整合

### Guns 导入

> guns-parent
> maven reimport

### Guns 配置

> project jdk1.8
> 修改 sql 文件，初始化数据库数据
> 修改 yml 文件，au 将原来集成的环境的配置文件修改为了分开的，便于直观修改

### Guns 整合

> 运行 guns-admin GunsApplication
> 后台测试用户: admin 密码: 111111

## 添加定制模块

### 1. 新建数据库表
eg: guns-admin/sql/au_tbl_house.sql

### 2. 登录管理界面 > 代码生成 
### 3. 产生管理菜单目录（即系统管理->菜单管理）
3.1 执行生成后的 guns-admin/src/main/java/House.sql
3.2 通过（系统管理->菜单管理）配置 所需的页面层级
3.3 通过（系统管理->角色管理）配置 可以看到该页面的角色，刷新后即可看到该页面
3.4 编辑对应的页面，以满足需要的显示需求


## au 认为可以优化的地方

### todo 1. 为每一个list添加查询条件，放到list列表旁边，弹出框的形式
### todo 2. 把生成的模版改成 lombok