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
div{float:left;margin-top: 10px;text-align: center;margin-left: 90px;}
a{text-decoration: none;FONT-SIZE: 15px;  COLOR: black;  FONT-FAMILY:  Microsoft YaHei; }
.input1{position:absolute;left:400px;width:500px;height:38px;border:1px solid #d4f1ff;top:30px;}
  .input2{position:absolute;left:900px;width:100px;height:40px;color:black;font-weight:bold;top:30px;border:0px;}
</style>
</head>
<body style="width: 95%;margin: 0 auto">
    <c:forEach items="${list}" var="Jewelry" > 
	                   <div >
	                      <a href="selectJewelryByID1?jid=${Jewelry.jid}" >
	                      <img src='static/images/${Jewelry.images}' ><br>
	                       ${Jewelry.jname}<br>
	                                                ￥${Jewelry.jewelry_price}元<br>
	                                                已经售出${Jewelry.jewelry_sale}件<br>
	                         </a>
	                      </div>
	    </c:forEach>
</body>
</html>


