<%@page import="com.study.web.entity.Persion"%>

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>管理成员名单页面</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" href="jquery-easyui-1.4.3/themes/icon.css"
	type="text/css"></link>
<link rel="stylesheet"
	href="jquery-easyui-1.4.3/themes/default/easyui.css" type="text/css"></link>
<script type="text/javascript" src="jquery-easyui-1.4.3/jquery.min.js"></script>
<script type="text/javascript"
	src="jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="jquery-easyui-1.4.3/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">
  		
  	</script>


</head>

<body>

	<table align="center" width="1000px" border="1px">
		<tr>
			<th>编号</th>
			<th>姓名</th>
			<th>年龄</th>
			<th>性别</th>
			<th>信誉度</th>
		</tr>

		<tr>

			<td id="pNumbers" align="center"></td>
			<td id="pName" align="center"></td>
			<td id="pAge" align="center"></td>
			<td id="pGender" align="center"></td>
			<td id="pReputation" align="center"></td>
		</tr>

	</table>
</body>
</html>
