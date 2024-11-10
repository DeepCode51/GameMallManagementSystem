<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<body >
  ${errorMessage}
	<form action="updateUser" method="post" style="width:500px;margin-top: 10px">
		<input type="hidden" name="uid"  value="${user.uid }"  />
		<div>
		<h2>用户资料</h2>
		    登录账号：
		    <input type="text" name="loginaccount" disabled="disabled" value="${user.loginaccount }" required="required"  /><br><br>
		    登录密码：
		    <input type="password" name="password" value="${user.password }"  id="password"  required="required"  /><br><br>
		    用户姓名：
		    <input type="text" name="fullname"  value="${user.fullname}"  id="fullname" required="required"  /><br><br>
		    用户电话：
		    <input type="text" name="tel" value="${user.tel }"   id="tel"  /><br><br>
		     <input type="submit" value="保存"   onClick="return reg()" style="width:300px;"/>
		</div>
	</form><br>
</body>
</html>
