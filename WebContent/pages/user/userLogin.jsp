<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%  
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8"> 
<title>Login.jsp</title>
<style type="text/css">
body{background-image: url(static/images/shoplogin.jpg);background-repeat: no-repeat;background-size: 100% 100%;}
  form{width:900px;height:300px;margin: 0 auto;text-align: center;margin-top: 150px;}
</style>
</head>    
<body >
<a href="userMain"><button>返回首页</button></a>
<c:if test="${not empty mess  }">
		<script type="text/javascript">
			alert("${mess}")
		</script>
</c:if>
	<form action="userlogin1" method="post" ><Br><Br>
	    <h1>用户登录</h1>
		 账号：<input type="text" name="loginaccount" required="required"/><br><br>
		 密码： <input type="password" name="password" required="required"/><br><br>
		    <input type="submit" value="登录" style="width:200px;"/><Br><Br>
		   
	</form> 
</body>
</html>
