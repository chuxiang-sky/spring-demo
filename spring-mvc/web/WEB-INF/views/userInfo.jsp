<%--
  Created by IntelliJ IDEA.
  User: chuxiang_sky
  Date: 2019/04/18
  Time: 23:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="head.jsp"%>
<html>
<head>
    <title>用户信息</title>
</head>
<body>
    <span>ID:${user.id}</span><br/>
    <span>姓名:${user.name}</span><br/>
    <span>年龄:${user.age}</span><br/>
    <span>性别:${user.male?'男':'女'}</span><br/>
    <span>出生日期:<fmt:formatDate value="${user.birthday}" pattern="yyyy-MM-dd"/></span><br/>
</body>
</html>
