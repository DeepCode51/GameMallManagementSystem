<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<title>后台首页</title>
<style type="text/css">
*{margin: 0px;padding:0px;}
</style>
</head>
<body>
<c:if test="${not empty mess  }">
		<script type="text/javascript">
			alert("${mess}")
		</script>
</c:if>
	
</body>
</html>


