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
        a{color:#f00;text-decoration: none;}
	</style>
</head>
<body>
	<table class="auto-style1" >
		<tr>
			<th>信息图片</th>
			<th>信息要点</th>
			<th>信息内容</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${list}" var="WebsiteInfo">
			<tr>
			<td><img src='static/images/${WebsiteInfo.info_img }' style="width: 100px;height: 100px"></td> 
				<td>${WebsiteInfo.info_name }</td>
				<td>${WebsiteInfo.info_detail }</td>
				<td width="100">
					<a  href="deleteWebsiteInfo?wid=${WebsiteInfo.wid }">
					    删除
					</a>||
					<a href="selectWebsiteInfoByID?wid=${WebsiteInfo.wid }">
					  修改
					</a>
					
				</td>
			</tr>
		</c:forEach>
	</table>
	<a href="pages/admin/addWebsiteinfo.jsp" target="center">发布信息</a>
</body>
</html>