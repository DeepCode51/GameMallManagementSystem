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
.input1{position:absolute;left:400px;width:500px;height:38px;border:1px solid #850000;top:30px;}
  .input2{position:absolute;left:900px;width:100px;height:42px;color:black;font-weight:bold;top:30px;border:0px;background-color: #850000;}
</style>
</head>
<body style="width: 95%;margin: 0 auto">
<form action=selectJewelryByJname method="post" target="center" >
          <input type="text"  placeholder="关键字…… " name="jname" class="input1" value=${jname}>
          <input type="submit" value="查找" class="input2">
     </form>
     <Br><BR> <Br><BR>
    <c:forEach items="${list}" var="Jewelry" > 
	                   <div >
	                      <a href="selectJewelryByID1?jid=${Jewelry.jid}" >
	                      <img src='static/images/${Jewelry.images}' ><br>
	                       ${Jewelry.jname}<br>
	                                                ￥${Jewelry.jewelry_price}元
	                         </a>
	                      </div>
	    </c:forEach>
</body>
</html>


