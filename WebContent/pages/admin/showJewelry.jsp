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
        a{color:#ccc;text-decoration: none;}
	</style>
</head>
<body>
	<table class="auto-style1" >
		<tr>
			<th>游戏图片</th>
			<th>游戏名称</th>
			<th>游戏价钱</th>
			<th>游戏账号剩余 </th>
			<th>游戏销量</th>
			<th>游戏语言</th>
			<th>游戏发行日期</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${list}" var="Jewelry">
			<tr>
			<td><img src='static/images/${Jewelry.images }' style="width: 100px;height: 100px"></td> 
				<td>${Jewelry.jname }</td>
				<td>${Jewelry.jewelry_price }元</td>
				<td>${Jewelry.jewelry_store }件</td>
				<td>${Jewelry.jewelry_sale }件</td>
				<td>${Jewelry.condition }</td>
				<td>${Jewelry.service }</td>
				<td>
					<a  href="deleteJewelry?jid=${Jewelry.jid }">
					   删除
					</a>||
					<a href="selectJewelryByID?jid=${Jewelry.jid }">
					   修改
					</a>
				</td>
			</tr>
		</c:forEach>
		<Tr><td colspan="8" style="text-align: right;">
<c:if test="${pageCur!=1 }"><a href="selectJewelry?pageCur=${pageCur-1}"><span>上一页</span></a></c:if> 
当前页面：第${pageCur}页 共 ${totalPage}页
<c:if test="${pageCur!=totalPage }"><a href="selectJewelry?pageCur=${pageCur+1 }">下一页</a> 
</c:if></td></Tr>		
	</table>
</body>
</html>