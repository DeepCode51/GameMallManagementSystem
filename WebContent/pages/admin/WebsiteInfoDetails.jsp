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
    textarea{width:400px;height:200px;}
  input[type="submit"]{width:400px;height:30px;margin-left:50px;background-color: #850000;color:white;border:0px;}
</style>
</head>    
<body>
	<form action="updateWebsiteInfo" method="post"  enctype="multipart/form-data" >
	       <input type="hidden" name="wid"  required="required" value="${WebsiteInfo.wid}"/>
		   <div>要点：<input type="text" name="info_name"  required="required" value="${WebsiteInfo.info_name}"/></div><br>
		   <div>内容：<textarea name="info_detail"  required="required">${WebsiteInfo.info_detail}</textarea></div><br>
		    <input type="submit" value="保存" />
	</form>
</body>
</html>
