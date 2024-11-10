<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%  
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8"> 
<title>addCard.jsp</title>
<style type="text/css">
  form{width:500px;margin: 0 auto;background-color: white;font-size:14px;color:#808080 ;}
  span{color:#850000;font-weight:bold;}
  input{width:400px;height:40px;}
  input[type="submit"]{width:400px;height:30px;margin-left:80px;background-color: #850000;color:white;border:0px;}
</style>
</head>    
<body><Br>
	<form action="addForms" method="post" style="">
		    添加游戏类型：<input type="text" name="fname" /><span>*</span><br><br>
		 <input type="submit" value="添加" />
	</form>
</body>
</html>
