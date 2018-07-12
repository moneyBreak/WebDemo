<%--
  Created by IntelliJ IDEA.
  User: money
  Date: 2018/7/11
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Insert title here</title>
</head>
<body>
登录名: ${requestScope.username }
密码: ${requestScope.pass}
</body>
</html>
