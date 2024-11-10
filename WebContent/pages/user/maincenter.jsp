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
<c:if test="${not empty mess}">
  <script type="text/javascript">
  alert("${mess}");
  </script>
</c:if>
<div class="space_hx">&nbsp;</div>
<div class="i_mian clearfix">
	<div class="bg_a">&nbsp;</div>
	<div class="i_ma clearfix">
    	
        <div class="i_mar">
            <ul class="i_login">
            	<li class="name">会员登录</li>
                <c:if test="${empty user}">
                <form action="userlogin1" method="post">
                  <li class="clearfix">
                	<span>用户名：</span>
                    <input name="loginaccount" type="text">
                </li>
                <li class="clearfix">
                	<span>密&nbsp;&nbsp;码：</span>
                    <input name="password" type="password">
                </li>
                <li class="btn">
                	<a href="addUser">注册</a>
                    <input name="" type="submit" value="登录">
                </li>
                </form>
                </c:if>
                <c:if test="${not empty user}">
                                         欢迎您：${user.loginaccount}<Br><Br>
                <a href="UserClear" style="color:#850000;font-weight:bold;"><button>退出登录</button></a><br><br>
               <a href="selectUserByUid" target="center"><button>用户资料</button></a>
                </c:if>
            </ul>
        </div>
        <div class="i_mal">
    		<!--幻灯片-->
            <div class="banner">
                <div id="inner">
                    <div class="hot-event">
                        <div class="event-item" style="display: block;">
                            
                                <img src="static/Assets/upload/banner.jpg" class="photo" alt="福瑞星" />
                           
                        </div>
                        <div class="event-item" style="display: none;">
                            
                                <img src="static/Assets/upload/banner.jpg" class="photo" alt="福瑞星" />
                            
                        </div>
                        <div class="event-item" style="display: none;">
                            
                                <img src="static/Assets/upload/banner.jpg" class="photo" alt="福瑞星" />
                            
                        </div>
                        <div class="switch-tab">
                            <a href="#" onClick="return false;" class="current">1</a>
                            <a href="#" onClick="return false;">2</a>
                            <a href="#" onClick="return false;">3</a>
                        </div>
                    </div>
                </div>
                <script type="text/javascript">
                    $('#inner').nav({ t: 6000, a: 500 });
                </script>
            </div>
            <!--幻灯片-->
            <div class="space_hx">&nbsp;</div>
        </div>
    </div>
   
</body>
</html>
