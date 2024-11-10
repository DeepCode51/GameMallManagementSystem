<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
     <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
 <base href="<%=basePath%>">
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="static/Assets/css/reset.css"/>
<script type="text/javascript" src="static/Assets/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="static/Assets/js/js_z.js"></script>
<link rel="stylesheet" type="text/css" href="static/Assets/css/thems.css">
<style type="text/css">
a{color:#850000;font-weight:bold;margin-left: 10px;}
</style>
</head>
<body>
<!--头部-->
<div class="head clearfix">
    <div><h3>游戏商城后台</h3></a></div>
    <div class="head_r">
    	<div class="Jewelrycar">
    	
    	 <a href="userMain">进入前台</a>
    	</div>
    </div>
</div>
<ul class="nav clearfix">
  <li><a href="selectJewelry?pageCur=1" target="center">游戏管理</a></li>
  <li><a href="selectForms1" target="center">添加游戏</a></li>
  <li><a href="selectForms" target="center">游戏类型管理</a></li>
  <li><a href="pages/admin/addForms.jsp" target="center">添加游戏类型</a></li>
  <li><a href="selectUser" target="center">用户管理</a></li>
  <li><a href="selectOrders" target="center">处理订单</a></li>
  <li><a href="selectOrders1" target="center">历史订单</a></li>
  <li><a href="selectWebsiteInfo" target="center">游戏资讯</a></li>
</ul>
<iframe src="pages/admin/adminbac.jsp" style="width:99%;height:600px;" name="center"></iframe>
 
</body>
</html>
