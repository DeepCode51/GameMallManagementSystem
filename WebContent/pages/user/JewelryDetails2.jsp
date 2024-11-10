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
<style type="text/css">
 input[type="submit"]{width:400px;height:30px;background-color: white;color:black;border:5px solid #850000;}
  input{width:0px;height:0px;background-color: white;color:black;}
</style>
<title>后台首页</title>
</head>
<script type="text/javascript">
       function check(){
    	   var count1=document.getElementById("count1").value;
    	   var count2=document.getElementById("count2").value;
    	   if(count2<count1){
    		   alert("等待补充游戏账号");
    		   return false;
    		}
    	   }
  </script>
  <style>
  </style>
<body style="width: 95%;margin: 0 auto;margin-top: 50px;">
     <img src='static/images/${Jewelry.images}' style="float:left;width: 400px;height: 300px;margin-left: 300px;">
	 <div style="float:left;width:500px;margin-top: 10px;margin-left: 50px;" >
	    ${Jewelry.jname}   <br><br> 
	      游戏价钱：${Jewelry.jewelry_price}<br><br>
	      游戏销量：${Jewelry.jewelry_sale}<br><br>
	      游戏账号剩余：${Jewelry.jewelry_store}<br><br>
	      游戏语言：${Jewelry.condition}<br><br>
	      发行日期：${Jewelry.service}<br><br>
 </div><Br><br>
  <form action="addCart" method="post" style="width:310px;margin: 0 auto;margin-top: 50px;">
		    <input type="hidden" value="${Jewelry.jid}" name="jid"/>
		 <input type="hidden" value="${Jewelry.jewelry_price}" name="price"/>
		 <input type="hidden" id="count2"  value="${Jewelry.jewelry_store}"><br><br>
		    <input type="number" value="1" name="nums"  id="count1"   required="required" /><br><br><br><br>
		    <input type="submit" value="加入购物车" onClick="return check()"  />
	</form> 
</body>
</html>


