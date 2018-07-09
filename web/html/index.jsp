<%--
  Created by IntelliJ IDEA.
  User: money
  Date: 2018/7/4
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <meta charset="utf-8">
    <title>Insert title there</title>
  </head>
  <body>
  <div>
登录名:${sessionScope.username}
密码: ${sessionScope.pass}
  </div>
  </body>
</html>
