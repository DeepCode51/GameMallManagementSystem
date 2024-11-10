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
a{color:#850000;text-decoration: none;font-family: 微软雅黑;font-size:15px;font-weight: bold;}
img{width: 200px;height: 200px;}
div{float:left;width:200px;margin-top: 10px;text-align: center;margin-left: 20px;}
</style>
</head>
<body style="width: 95%;margin: 0 auto">
         <BR>
       &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;游戏：<c:forEach items="${list1}" var="forms">
     <a href="selectJewelryByFname?fname=${forms.fname }"> ${forms.fname}</a>
      </c:forEach>
     <Br><Br>
    <c:forEach items="${list}" var="Jewelry" > 
	                   <div >
	                      <a href="selectJewelryByID1?jid=${Jewelry.jid}" >
	                      <img src='static/images/${Jewelry.images}' ><br>
	                       ${Jewelry.fname}<br>
	                       ${Jewelry.jname}<br>
	                                                ￥${Jewelry.jewelry_price}元
	                         </a>
	                      </div>
	    </c:forEach>
</body>
</html>


