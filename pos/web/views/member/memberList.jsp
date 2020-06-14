<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객관리</title>
<style>
	#memberArea{margin-left:230px; padding-top:20px; width:1700px; height:600px; }
	#memberArea>table{width:100%; border:2px solid #fffff3; font-size:23px;}
	#memberArea>table tr{border-top:1px solid #fffff3; line-height:70px;}
	#memberArea>table th{width:60px; border-bottom:1px solid #fffff3; color:#E0E3DA;}
	#memberArea>table td{width:60px; text-align:center; }
	#lastTh{width:150px;}
	
	#memberChargeBtn{width:45%; height:50px; border-radius:10px; font-size:20px; font-weight:600;}
	#memberUpdateBtn{width:45%; height:50px; border-radius:10px; font-size:20px; font-weight:600;}
	
	#memberArea>#btnArea{margin:0 auto; width:30%; top:800px; left:600px;}
	#memberArea>#btnArea>button{width:50%; height:50px; border-radius:10px; font-size:28px; font-weight:600; margin-left:120px;}
	
</style>
</head>
<body>
	<jsp:include page="${contextPath }/views/common/header.jsp"/>
	<jsp:include page="${contextPath }/views/common/menubar.jsp"/>
	
	
	<div id="memberArea">
		<h1 align="center">고객관리</h1>
		<br>
		<table>
			<tr>
				<th>회사명</th><th>부서명</th><th>연락처</th><th>외상금액</th><th>선불금액</th><th>탈퇴여부</th><th id="lastTh"></th>
			</tr>
			<tr>
				<td>가나</td>
				<td>ㅁㄴㅇ</td>
				<td>010-6686-8286</td>
				<td>100000</td>
				<td>0</td>
				<td>n</td>
				<td>
					<button type="button" id="memberChargeBtn">외상결제</button>
					<button type="button" id="memberUpdateBtn">수정</button>
				</td>
			</tr>
		</table>
		
		<br><br>
		<div id="btnArea">
			<button type="button" id="memberInsert">신규등록</button>	
		</div>
	</div>
</body>













</html>