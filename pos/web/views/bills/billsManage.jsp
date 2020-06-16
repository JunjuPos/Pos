<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<title>영수증 관리</title>
<style>
	#billsArea{margin-left:230px; padding-top:20px; width:1700px; height:600px; }
	#dateBar table{width:100%;border:2px solid #fffff3;}
	#dateBar table tr{float:left; line-height:100px;}
	#dateBar table td{width:80%; color:#fffff3; font-size:28px; padding-left:20px; padding-right:25px; }
	#dateBar table input{font-size:28px; font-weight:600;}
	#dateBar table input[type="radio"]{width:20px; height:20px;}
	#dateBar table button{font-size:25px; width:120px; height:45px; font-weight:600; border-radius:10px;}
	#dateBar table button:hover{background-color:#A593E0; color:#fffff3;}
	
	/* #billsList{position:absolute;} */
	#billsList table{position:absolute;text-align:center; width:38%; border:2px solid #fffff3;}
	#billsList table th{font-size:28px; color:#fffff3; border-bottom:1px solid #fffff3;}
	#billsList table td{font-size:25px; color:black; border-bottom:1px solid black;}
	
	#billsDetail table{float:right; width:46%; text-align:center; border:2px solid #fffff3; border-radius:10px;}
	#billsDetail table th{font-size:28px; color:#fffff3; border-bottom:1px solid #fffff3;}
	#billsDetail table td{font-size:25px; color:black; border-bottom:1px solid black;}
	
</style>
</head>
<body>
	<jsp:include page="${contextPath }/views/common/header.jsp"/>
	<jsp:include page="${contextPath }/views/common/menubar.jsp"/>
	
	
	<div id="billsArea">
		<div id="dateBar">
		<h1 align="center">영수증 관리</h1>
		<br>
			<form action="#" method="get">
				<table>
					<tr>
						<td>
							<input type="radio" name="searchDate" id="today" value="today">
							<label for="today">오늘</label>
						</td>
					</tr>	
					<tr>
						<td>
							<input type="radio" name="searchDate" id="week" value="week">
							<label for="week">일주일</label>
						</td>
					</tr>
					<tr>
						<td>
							<input type="radio" name="searchDate" id="month" value="month">
							<label for="month">한달</label>
						</td>
					</tr>
					<tr>
						<td>
							<input type="radio" name="searchDate" id="3months" value="3months">
							<label for="3months">3개월</label>
						</td>
					</tr>
					<tr>
						<td>
							<input type="radio" name="searchDate" id="6months" value="6months">
							<label for="6months">6개월</label>
						</td>
					</tr>
					<tr>
						<td>
							<input type="radio" name="searchDate" id="year" value="year">
							<label for="year">1년</label>
						</td>
					</tr>
					<tr>
						<td><input type="date" name="firstDate" value="2009/01/01"></td>
					</tr>
					<tr>
						<td><input type="date" name="secondDate" value="2009/01/01"></td>
					</tr>
					<tr>
						<td><button type="submit" id="submit">조회하기</button></td>
					</tr>
					
				</table>
			</form>
		
		</div><!-- dateBar end -->
	
		<br><br><br>
		<div id="billsList">
			<table>
				<tr>
					<th>결제번호</th>
					<th>결제시간</th>
					<th>결제방법</th>
					<th>결제금액</th>
				</tr>
			
				<tr>
					<td>1</td>
					<td>2</td>
					<td>3</td>
					<td>4</td>
				</tr>
				
				<tr>
					<td>1</td>
					<td>2</td>
					<td>3</td>
					<td>4</td>
				</tr>
			</table>
		</div><!-- billsList end -->


	<div id="billsDetail">
		<table>
				<tr>
					<th>시간</th>
					<th>메뉴</th>
					<th>수량</th>
				</tr>
			
				<tr>
					<td>1</td>
					<td>2</td>
					<td>3</td>
				</tr>
				
				<tr>
					<td>1</td>
					<td>2</td>
					<td>3</td>
				</tr>
			</table>
	
	</div><!-- billsDetail end -->




	</div><!-- billsArea end -->
</body>
</html>