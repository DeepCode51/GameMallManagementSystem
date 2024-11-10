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
        a{color:#ccc;text-decoration: none;}
	</style>
</head>
<body>
    <a href="updateOrders"><button>游戏发货</button></a>
	<table class="auto-style1" >
		<tr>
			<th>购买信息</th>
			
			<th>购买日期 </th>
			<th>状态</th>
		</tr>
		<c:forEach items="${list}" var="orders">
			<tr>
				<td>${orders.jewelryinfo }</td>
				<%-- <td>${orders.userinfo }</td> --%>
				<td>${orders.buydate }</td>
				<td>${orders.orderstate }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>