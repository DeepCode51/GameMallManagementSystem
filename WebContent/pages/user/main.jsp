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
</head>
<body>
<!--头部-->
<div class="head clearfix">
    <div class="logo"><p style="font-size: 14px;">2021年8月30日，国家新闻出版署下发《关于进一步严格管理切实防止未成年人沉迷网络游戏的通知》（以下简称《通知》）。
    作为网络游戏运营服务市场延伸的基于网络虚拟财产交易平台，密马游戏交易平台对《通知》高度重视、积极响应、并全面落实《通知》中与网络虚拟财产交易有关的各项要求。
    为防止未成年人沉迷网络游戏，密马游戏交易平台已采取严格措施禁止任何未成年人利用密马游戏交易平台购买游戏资产，包括：
1.  已建立和完善用户实名认证系统，积极响应和配合政府的要求；
2.  禁止未成年人的用户（即未年满18周岁的中国公民）参与密马游戏交易平台上的任何交易。</p></a></div>
    <div class="head_r">
    	<div class="shopcar">
    	<c:if test="${not empty user}">
    	 
    	 </c:if>
    	 <a href="adminLogin" ><spring:message code="banner9"></spring:message></a>
    	 </div>
        
    </div>
</div>
<ul class="nav clearfix">
    <li><a href="userMain" ><spring:message code="banner1"></spring:message></a></li>
  <li><a href="selectJewelry2" target="center"><spring:message code="banner2"></spring:message></a></li>
    <li><a href="selectJewelry4" target="center"><spring:message code="banner4"></spring:message></a></li>
  <li><a href="selectCart" target="center"><spring:message code="banner5"></spring:message></a></li>
  <li><a href="selectCart1" target="center"><spring:message code="banner6"></spring:message></a></li>
  <li><a href="i18n?locale=en_US"  class="aa"  ><spring:message code="english"></spring:message></a></li>
  <li><a href="i18n?locale=zh_CN"  class="aa"  ><spring:message code="chinese"></spring:message></a></li>
    
</ul>
<iframe src="pages/user/maincenter.jsp" style="width:99%;height:600px;" name="center"></iframe>

</body>
</html>
