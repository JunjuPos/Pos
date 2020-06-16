<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객관리</title>
<style>
	#memberArea{margin-left:200px; width:1300px; height:600px; }
	#memberArea>table{width:100%; border:2px solid #fffff3;}
	#memberArea>table tr{border-top:1px solid #fffff3;}
	#memberArea>table th{width:16.66%;}
	#memberArea>table td{width:16.66%; text-align:center;}
	#memberArea>#btnArea{margin:auto; width:30%; position:fixed; top:800px; left:580px;}
	#memberArea>#btnArea>button{width:49%; height:50px; border-radius:10px; font-size:28px; font-weight:600;}
	
</style>
</head>
<body>
	<jsp:include page="${contextPath }/views/common/header.jsp"/>
	<jsp:include page="${contextPath }/views/common/menubar.jsp"/>
	
	
	<div id="memberArea">
		<h2 align="center">고객관리</h2>
		<table>
			<tr><th>회사명</th><th>부서명</th><th>연락처</th><th>외상금액</th><th>선불금액</th><th>탈퇴여부</th></tr>
			<tr><td>가나</td><td>ㅁㄴㅇ</td><td>010-6686-8286</td><td>100000</td><td>0</td><td>n</td></tr>
		</table>
		
		<div id="btnArea">
			<button type="button" id="memberInsert">등록</button>
			<button type="button" id="memberUpdate">수정/삭제</button>		
		</div>
	</div>
</body>













</html>