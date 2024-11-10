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
	</style>
</head>
<body>
	<table class="auto-style1" >
	     <tr>
			<th>游戏类型编号</th>
			<th>游戏类型名称</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${list}" var="forms" varStatus="status">
			<tr >
				<td>${status.index+1 }</td>
				<td>${forms.fname }</td>
				<td>
					<a  href="deleteForms?fid=${forms.fid }" class="txt">
					  删除
					</a>
				</td>
			</tr>
		</c:forEach>
		
	</table>
	

</body>
</html>