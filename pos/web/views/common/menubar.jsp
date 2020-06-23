<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<title>Insert title here</title>
<style>
	body{background-color:#566270;}
	#side_nav{position: fixed; top: 160px; right: 0px; width: 200px; height: 310px; border: 0px; margin-top:100px;}
	#side_nav>table{width:100%; border:0px;}
	#side_nav>table td{width:100%;}
	#side_nav button{display: block; margin: 0px; width:200px; height:100px; font-size: 25px; font-weight:600; color:#black; background-color:#E0E3DA; border-radius:20px; }
	#side_nav button:hover{background-color:#A593E0; color:#fffff3;}
</style>
</head>
<body>
	<div id="side_nav">
		<table>
			<tr><td><button onclick="mainPage();">테이블 이동</button></td></tr>
			<tr><td><button onclick="salesManage()">매출 관리</button></td></tr>
			<tr><td><button onclick="menuManage()">메뉴 관리</button></td></tr>
			<tr><td><button onclick="memberManage()">고객 관리</button></td></tr>
			<tr><td><button onclick="receiptManage()">영수증 관리</button></td></tr>
			<tr><td><button onclick="creditManage()">외상 결제</button></td></tr>
		</table>
	</div>
	
</body>

<script>
	//서블릿으로 이동
	function mainPage(){
		location.href="${contextPath}/main/mainView";
	}
	function salesManage(){
		location.href="${contextPath}/#";
	}
	function menuManage(){
		location.href="<%=request.getContextPath()%>/menuList.mn";
	}
	function memberManage(){
		location.href="<%=request.getContextPath()%>/memberList.me";
	}
	function receiptManage(){
		location.href="${contextPath}/#";
	}
	function creditManage(){
		location.href="${contextPath}/#";
	}
</script>
</html>