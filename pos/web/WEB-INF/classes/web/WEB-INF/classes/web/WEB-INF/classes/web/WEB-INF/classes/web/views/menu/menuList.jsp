<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<title>메뉴 리스트 페이지</title>
<style>
	#menuListArea{width:80%; margin-left:100px;}
	#menuListArea p{color:#E0E3DA; font-size:30px;}
	#menuListArea table{width:100%; border:0px;}
	#menuListArea table tr{float:left;}
	#menuListArea table td{width:100%;}
	#menuListArea button{margin: 0px; width:200px; height:100px; font-size: 25px; font-weight:600; color:#black; background-color:#E0E3DA; border-radius:20px; }
	#menuListArea button:hover{background-color:#A593E0; color:#fffff3;}

</style>


</head>
<body>
	<jsp:include page="${contextPath }/views/common/header.jsp"/>
	<jsp:include page="${contextPath }/views/common/menubar.jsp"/>

	<div id="menuListArea">
		<h1 align="center">메뉴관리</h1>
		<br>
		<p>밥</p>
		<hr>
		<table>
			<tr><td><button onclick="goDetail();">메뉴1</button></td></tr>
			<tr><td><button onclick="goDetail();">메뉴1</button></td></tr>
			<tr><td><button onclick="goDetail();">메뉴1</button></td></tr>
			<tr><td><button onclick="goDetail();">메뉴1</button></td></tr>
			<tr><td><button onclick="goDetail();">메뉴1</button></td></tr>
			<tr><td><button onclick="goDetail();">메뉴1</button></td></tr>
		</table>
		
		<br>
		<p>면</p>
		<hr>
		<table>
			<tr><td><button onclick="goDetail();">메뉴1</button></td></tr>
			<tr><td><button onclick="goDetail();">메뉴1</button></td></tr>
			<tr><td><button onclick="goDetail();">메뉴1</button></td></tr>
			<tr><td><button onclick="goDetail();">메뉴1</button></td></tr>
			<tr><td><button onclick="goDetail();">메뉴1</button></td></tr>
			<tr><td><button onclick="goDetail();">메뉴1</button></td></tr>
		</table>
		
		<br>
		<p>음료</p>
		<hr>
		<table>
			<tr><td><button onclick="goDetail();">메뉴1</button></td></tr>
			<tr><td><button onclick="goDetail();">메뉴1</button></td></tr>
			<tr><td><button onclick="goDetail();">메뉴1</button></td></tr>
			<tr><td><button onclick="goDetail();">메뉴1</button></td></tr>
			<tr><td><button onclick="goDetail();">메뉴1</button></td></tr>
			<tr><td><button onclick="goDetail();">메뉴1</button></td></tr>
		</table>
		
		
		<br>
		<p>기타</p>
		<hr>
		<table>
			<tr><td><button onclick="goDetail();">메뉴1</button></td></tr>
			<tr><td><button onclick="goDetail();">메뉴1</button></td></tr>
			<tr><td><button onclick="goDetail();">메뉴1</button></td></tr>
			<tr><td><button onclick="goDetail();">메뉴1</button></td></tr>
			<tr><td><button onclick="goDetail();">메뉴1</button></td></tr>
			<tr><td><button onclick="goDetail();">메뉴1</button></td></tr>
		</table>
		
		
	</div>
	
</body>
</html>