<%--
  Created by IntelliJ IDEA.
  User: LiuKang
  Date: 2016/3/4
  Time: 15:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="user" items="${users}">
    <%--这里${user.user_name}的取值实际上是调用.get方法即getUser_name()应该需要知道get+第一个字母大写User_nmae--%>
    ${user.id}:${user.user_name}
    <br>
</c:forEach>
</body>
</html>
