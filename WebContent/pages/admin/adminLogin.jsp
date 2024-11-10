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
body{background-image: url(static/images/loginback.jpg);background-repeat: no-repeat;background-size: 100% 100%;}
  form{idth:900px;height:300px;margin: 0 auto;text-align: center;margin-top: 50px;}
  button{background-color: white;color:black;border:5px solid white;}
  h1{color:black;}
  input[type="submit"]{width:400px;height:40px;background-color: #3bf100;color:black;border:5px solid #3bf100;}
  input{width:600px;height:40px;background-color: white;color:black;}
  span{color:black;font-weight:bold;}
</style>
</head>    
<body>
<a href="userMain"><button>返回首页</button></a>
<c:if test="${not empty mess  }">
		<script type="text/javascript">
			alert("${mess}")
		</script>
</c:if>
	<form action="adminLogin1" method="post" ><Br><Br>
	    <h1>后 台 登 录</h1>
		 <span>账号：</span><input type="text" name="loginaccount" required="required"/><br><br>
		  <span>密码：</span> <input type="password" name="password" required="required"/><br><br>
		    <input type="submit" value="登录" style="width:200px;"/><Br><Br>
	</form> 
	<Br><Br><Br><Br><Br><Br><Br><Br><Br><Br><Br><Br><Br><Br>
</body>
</html>
