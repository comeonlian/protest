<%@ page isELIgnored="false" %> 
<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>论坛登陆首页</title>
</head>
<body>
<center>
	<c:if test="${!empty error}">
		<font color="red"><c:out value="${error }" /></font>
	</c:if>
	<form action="<c:url value="/loginCheck.html"/>" method="post">
		用户名:<input id="userName" name="userName" type="text"/> <br/>
		密码:<input id="password" name="password" type="password" /> <br/>
		<input type="submit" value="登陆"/>
		<input type="reset" value="重置"/>
	</form>
</center>
</body>
</html>