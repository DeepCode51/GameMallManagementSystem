<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<%  
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8"> 
<title>addCard.jsp</title>
</head>   
<script type="text/javascript">
       function reg(){
    	   var phone=document.getElementById("tel").value;
    	   if(!(/^1[3456789]\d{9}$/.test(phone))){
    		   alert("手机号码有误，请重填");  
    		   return false;
    	   }
       }
     </script>  
<style type="text/css">
  form{width:500px;margin: 0 auto;background-color: white;font-size:14px;color:#808080 ;}
  span{color:#850000;font-weight:bold;}
  input{width:400px;height:40px;}
  input[type="submit"]{width:400px;height:30px;margin-left:80px;background-color: #850000;color:white;border:0px;}
</style>
</head>    
<body style="width:95%;margin:  0 auto">
	<form:form  modelAttribute="user" action="addUser1"    method="post" ><Br>
	<h2>申请注册</h2>
	<Br>
	              登录账号：
		    <form:input  path="loginaccount"  ></form:input><br>
		    <form:errors path="loginaccount"></form:errors>
		    <br>
		   登录密码：
		    <form:password  path="password" /><br>
		    <form:errors path="password"></form:errors>
		    <br>
		    用户姓名：
		    <form:input type="text" path="fullname"     /><br>
		     <form:errors path="fullname"></form:errors>
		    <br>
		    用户电话：
		    <form:input type="text" path="tel"     id="tel"  /><br>
		   <form:errors path="tel"></form:errors>
		    <br>
		    <input type="submit" value="注册"   onClick="return reg()" style="width:300px;"/>
	</form:form> <Br><Br> <span style="color:red;font-weight: bold;font-size: 15px;"><form:errors></form:errors></span>
</body>
</html>
		
