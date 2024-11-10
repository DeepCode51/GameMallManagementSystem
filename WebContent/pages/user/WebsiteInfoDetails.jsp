<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<title>前台首页</title>
<style type="text/css">
a{color:black;}
img{width: 150px;height: 150px;}
a{text-decoration: none;FONT-SIZE: 15px;  COLOR: black;  FONT-FAMILY:  Microsoft YaHei; }
</style>
</head>
<body>
<div>
 <h1>${WebsiteInfo.info_name}</h1>
&nbsp;&nbsp;&nbsp;&nbsp;${WebsiteInfo.info_detail}	 <Br><Br>
<img src="static/images/${WebsiteInfo.info_img}" style="width:300px;height:300px;"/>   <Br>  <Br>                 
发布时间：${WebsiteInfo.info_date}  
</div>         
</body>
</html>


