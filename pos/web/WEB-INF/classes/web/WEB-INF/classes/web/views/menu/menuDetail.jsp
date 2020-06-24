<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<title>메뉴등록/수정</title>
<style>
	#menuArea{margin-left:300px; padding-top:20px; width:1300px; height:600px; }
	#menuArea>table{width:100%; border:2px solid #fffff3; font-size:23px;}
	#menuArea>table tr{border-top:1px solid #fffff3; line-height:90px; }
	#menuArea>table th{width:16.66%; color:#E0E3DA; border-bottom:1px solid #fffff3; border-right:1px solid #fffff3;}
	#menuArea>table td{width:16.66%; text-align:center; border-bottom:1px solid #fffff3;}
	#menuArea>table input{width: 50%; height: 40px; margin-left: 10px; font-size:23px;}
	#menuArea>table select{width: 50%; height: 40px; margin-left: 10px; font-size:23px;}
	#menuArea>#btnArea{margin:auto; width:30%; top:800px; left:580px;}
	#menuArea>#btnArea>button{width:49%; height:50px; border-radius:10px; font-size:28px; font-weight:600;}
	#btnArea button:hover{background-color:#A593E0; color:#fffff3;}
</style>
</head>
<body>
	<%@ include file="/views/common/header.jsp" %>
	<%@ include file="/views/common/menubar.jsp" %>
	
	
	<div id="menuArea">
		<h1 align="center">메뉴등록/수정</h1>
		<br>
		<table>
			<tr>
				<th>메뉴명</th><td><input type="text" id="mnName" name="mnName"></td>
			</tr>
			<tr>
				<th>카테고리</th>
				<td>
					<select name="cate" id="cate">
						<option value="rice">밥</option>
						<option value="noddle">면</option>
						<option value="drinks">음료</option>
						<option value="etc">기타</option>
					</select>
				</td>
			</tr>
			<tr>
				<th>가격</th><td><input type="number" id="price" name="price"></td>
			</tr>
			<tr>
				<th>삭제여부</th>
				<td>
					<select name="mnStatus" id="mnStatus">
						<option value="Y">Y</option>
						<option value="N">N</option>
					</select>
					
				</td>
			</tr>
			
		</table>
	
		<br><br>
		<div id="btnArea">
			<button type="button" id="menuInsert">등록</button>
			<button type="button" id="menuUpdate">수정/삭제</button>	
			<!-- <button type="button" id="goBack">이전으로</button> -->
		</div>
	</div>
	
	
	<!-- <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br> -->
</body>









