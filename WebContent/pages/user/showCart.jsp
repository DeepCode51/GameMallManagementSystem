<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8"> 
<title>deleteSelect.jsp</title>
	<style type="text/css">
	     .auto-style1 {
             width:90%;margin:0 auto;margin-top:10px;border:1px solid #ada2a2;font-size:14px;color:#808080 ;border-collapse:collapse;border: 1px solid #ada2a2;
        }
       .auto-style1  tr {
            height:40px;
        }
        .auto-style1 td{
            border-collapse:collapse;
            border: 1px solid #ada2a2;height:40px;text-align: center;
            }
        .txt {
            width:29%;height:28px;border: 1px solid #ada2a2;
        }
         input[type="submit"]{width:100px;height:30px;background-color: white;color:black;border:5px solid #850000;}
         input{width:300px;height:20px;background-color: white;color:black;margin-top: 1px;}
	</style>
</head>
<body>
	<table class="auto-style1" >
		<tr>
		    <th></th>
			<th>游戏名称 </th>
			<th>数量</th>
			<th>游戏单价 </th>
			<th>游戏总价 </th>
			<th>管理</th>
		</tr>
		<c:forEach items="${list}" var="cart">
			<tr>
				<td><img src='static/images/${cart.images }' style="width: 100px;height: 100px"> </td>
				<td>${cart.jname }</td>
				<td>${cart.nums }</td>
				<td>${cart.price }元</td>
				<td>${cart.totalprice}元</td>
				<td>
					<a href="deleteCart?cid=${cart.cid }">
					 删除
					</a>
				</td>
			</tr>
		</c:forEach>
		<tr><th colspan="6">
		<form action="addOrders" method="post" style="width:100%;margin: 0 auto;margin-top: 10px;margin-left: 10px">
                        <input type="text" name="a" placeholder="游戏账号……" required="required"><Br>
                     <input type="text" name="b" placeholder="昵称……" required="required"><Br>
                    <input type="text" name="c" placeholder="QQ/微信……" required="required"><Br>
     <input type="submit" value="结账" />
        </form>
		</th></tr>
	</table>
</body>
</html>