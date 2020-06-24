<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<title>신규고객 등록</title>
<style>
	#memberArea{margin-left:300px; padding-top:20px; width:1300px; height:600px; }
	#memberArea>table{width:100%; border:2px solid #fffff3; font-size:23px;}
	#memberArea>table tr{border-top:1px solid #fffff3; line-height:90px; }
	#memberArea>table th{width:16.66%; color:#E0E3DA; border-bottom:1px solid #fffff3; border-right:1px solid #fffff3;}
	#memberArea>table td{width:16.66%; text-align:center; border-bottom:1px solid #fffff3;}
	#memberArea>table input{width: 50%; height: 40px; margin-left: 10px; font-size:23px;}
	#memberArea>table select{width: 50%; height: 40px; margin-left: 10px; font-size:23px;}
	#memberArea>#btnArea{margin:auto; width:30%; top:800px; left:580px; text-align:center;}
	#memberArea>#btnArea>button{width:60%; height:70px; border-radius:10px; font-size:28px; font-weight:600;}
	#btnArea button:hover{background-color:#A593E0; color:#fffff3;}
</style>
</head>
<body>

	<%@ include file="/views/common/header.jsp" %>
	<%@ include file="/views/common/menubar.jsp" %>
	
	<form action="<%=request.getContextPath() %>/memberInsert.me" method="post">
	<div id="memberArea">
		<h1 align="center">신규고객 등록</h1>
		<br>
			<table>
				<tr>
					<th>회사명</th><td><input type="text" id="cName" name="cName" required></td>
				</tr>
				<tr>
					<th>부서명</th><td><input type="text" id="dept" name="dept" required></td>
				</tr>
				<tr>
					<th>연락처</th><td><input type="tel" id="phone" name="phone" required></td>
				</tr>
				<tr>
					<th>외상금액</th><td><input type="number" id="charge" name="charge" value=0></td>
				</tr>
				<tr>
					<th>선불금액</th><td><input type="number" id="prePaid" name="prePaid" value=0></td>
				</tr>
				<tr>
					<th>탈퇴여부</th>
					<td>
						<select name="status" id="status">
							<option value="Y">Y</option>
							<option value="N">N</option>
						</select>
					</td>
				</tr>
				
			</table>
	
			<br><br>
			<div id="btnArea">
				<button type="submit" id="memberInsert">등록하기</button>
				<!-- <button type="button" id="memberUpdate">수정/삭제</button>	 -->
				<!-- <button type="button" id="goBack">이전으로</button> -->
			</div>
		</div>
	</form>
	
	
	<!-- <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br> -->
</body>













</html>
