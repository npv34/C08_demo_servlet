<%--
  Created by IntelliJ IDEA.
  User: ad
  Date: 29/11/2023
  Time: 09:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Xin chao: <%
  String email = request.getAttribute("email").toString();
  out.println(email);
%>
</body>
</html>
