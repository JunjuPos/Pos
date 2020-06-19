<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<style>
	body{background-color:#566270;}
	#header{text-align:center;}
	#header>h1{color:#fffff3;}
	#header>p{float:right; color:#fffff3;}
	#header::after{content:""; display:block; clear:both;}
	
</style>
</head>
<body>
	<header id="header">
		<h1>전주 손칼국수</h1>
		<p id="toDate">현재시간</p>
	</header>
	<hr>
	
</body>
<script>
	$(function(){
		var date = new Date();
		var html = "";
		
		
		window.setInterval(function(){
			var date1 = new Date();
			html += date.getFullYear() + " / " + (date.getMonth()+1) + " / " + date.getDate() + " - "; 
			html +=  date1.getHours() + " : " +date1.getMinutes() + " : " + date1.getSeconds();
			
			$("#toDate").html(html);
			html = "";
		},100)
		
	})
</script>
</html>