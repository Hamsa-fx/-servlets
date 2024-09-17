<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import= "com.hamsa.webApps.dto.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body>
<h3> Login Successful!</h3>
<%
  //  User user = (User)session.getAttribute("user");
%>
<%
   //User user = (User)request.getAttribute("user");
%>
<jsp:useBean id="user" class="com.hamsa.webApps.dto.User" scope ="request"></jsp:useBean>

Hello! <%=user.getUserName()%>
Hello <jsp:getProperty property="userName" name ="user"/>
</body>
</html>