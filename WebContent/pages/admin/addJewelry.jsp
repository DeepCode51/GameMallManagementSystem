<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%  
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8"> 
<title>addAShop.jsp</title>
<style type="text/css">
  form{width:500px;margin: 0 auto;background-color: white;font-size:14px;color:#808080 ;}
  span{color:#850000;font-weight:bold;}
  input{width:400px;height:40px;}
  input[type="submit"]{width:400px;height:30px;margin-left:80px;background-color: #850000;color:white;bordeR:0px;}
</style>
</head>    
<body>
	<form action="addJewelry" method="post"  enctype="multipart/form-data" >
		   <div>游戏名称：<input type="text" name="jname"  required="required"/><span>*</span></div><br>
		   <div>游戏价钱：<input type="text" name="jewelry_price"  required="required"/><span>*</span></div><br>
		   <div>游戏账号剩余：<input type="text" name="jewelry_store"  required="required"/><span>*</span></div><br>
		   <div>游戏图片：<input type="file" name="imgurl" required="required"/><span>*</span></div><br>
		   <div>游戏语言：<input type="text" name="condition" required="required"/><span>*</span></div><br>
		   <div>发行日期：<input type="text" name="service" required="required"/><span>*</span></div><br>
		   <div>游戏类型：<select name="fname"  >
					<c:forEach items="${list}" var="forms">
					<option >${forms.fname}</option>
					</c:forEach>
					</select></div><br>
		    <input type="submit" value="添加" />
	</form>
</body>
</html>
