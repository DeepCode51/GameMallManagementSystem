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
<title>updateJewelry.jsp</title>
<style type="text/css">
  form{width:500px;margin: 0 auto;background-color: white;}
  span{color:#850000;font-weight:bold;}
  input{width:400px;height:40px;}
  input[type="submit"]{width:400px;height:30px;margin-left:80px;background-color: #850000;color:white;}
</style>
</head>    
<body>
	<form action="updateJewelry" method="post"  enctype="multipart/form-data" >
			<input type="hidden" name="jid"  value="${Jewelry.jid }" >
		   <div>游戏名称：<input type="text" name="jname" required="required" value="${Jewelry.jname}"/></div><br><br>
		   <div>游戏价钱：<input type="number" name="jewelry_price" required="required" value="${Jewelry.jewelry_price}"/></div><br><br>
		   <div>游戏账号剩余：<input type="number" name="jewelry_store" required="required" value="${Jewelry.jewelry_store}"/></div><br><br>
		   <div>游戏语言：<input type="text" name="condition" required="required" value="${Jewelry.condition}"/></div><br><br>
		   <div>发行日期：<input type="text" name="service" required="required" value="${Jewelry.service}"/></div><br><br>
		   <div>游戏类型： <select name="fname" required="required" >
					  <c:forEach items="${list}" var="forms">
       <c:if test="${forms.fname==Jewelry.fname}">
       <option  selected="selected" value="${forms.fname }">${forms.fname}</option>
       </c:if>
        <c:if test="${forms.fname!=Jewelry.fname}">
       <option  value="${forms.fname }">${forms.fname}</option>
       </c:if>
       </c:forEach>
					</select></div><br><br>
		    <input type="submit" value="更新" style="width:755px;height:31px;"/>
		   
		
	</form>
</body>
</html>
