## bridges

> 桥梁健康预警系统（重构）

### 2020-07-17 创建工程

* 根据源工程进行页面优化
* 代码重构
* 加入新的功能（计划）

### 2020-07-18 基础框架搭建

* 引入connect前端模板
* thymeleaf模板页面的构建
* 用户登录控制与页面跳转
* 导航栏定制
* Contents内容下的三个主页面的跳转控制

### 2020-07-18 页面重新规划

共计 13 个页面

* Contents
    * Monitor（核心状态面板）
    * Calendar （日历报警面板）
    * Info （个人信息、项目信息、留言板）
* Maintain
    * Alert
        * Alert List （报警列表）
    * Bridge
        * Bridge List （桥梁列表）
        * Sensor List （传感器列表）
        * Add Bridge （添加桥梁）
        * Add Sensor （添加传感器）
    * User
        * User List （用户列表）
        * Role List （角色/权限组列表）
        * Permission List （权限列表）
        * Add User （添加用户）
        * Add Role （添加角色/权限组）
        
 ### 2020-07-18 页面定制
 
 * 列表类页面（可复用）
    * 报警列表 #4
    * 桥梁列表 #5
    * 传感器列表 #6
    * 用户列表 #9
    * 角色列表 #10
    * 权限列表 #11