<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.payment{float:left;}
	#orderView{width:700px; margin-left:50px;}
	#orderList{width:100%; height:550px; border:2px solid #fffff3; overflow:auto; border-radius:10px;}
	#orderView>h2>input{width:20px; height:25px; background-color:#566270; border:0px; font-size:25px; font-weight:600;}
	#orderView>h2{text-align:center;}
	#orderView>#orderList>table{width:100%;}
	#orderView>#orderList>table th{width:33.33%; font-size:20px; border-bottom:1px solid black;}
	#orderView>#orderList>table td{text-align:center; height:30px; font-size:20px;}
	
	#orderView>#resultPriceZone{width:100%; height:50px; border:2px solid #fffff3; border-radius:10px; margin-top:10px; background-color:#E0E3DA;}
	#orderView>#resultPriceZone>p{margin:auto; line-height:50px; padding-left:70px; font-size:20px;}
	#orderView>#resultPriceZone>p>#resultPrice{border:0px; background-color:#E0E3DA; font-size:20px;}
	
	#inputArea{margin-left:150px; margin-top:100px; width:350px;}
	#inputArea>p{margin-bottom:10px; float:right;}
	#inputArea>p>label{font-size:20px; font-weight:600;}
	#inputArea>p>input{width:200px; height:30px;}
	
	#btnArea{position:fixed; left:850px; top:770px;}
	#btnArea>button{width:200px; height:80px; margin-right:15px; border-radius:10px; background-color:#E0E3DA; font-size: 25px; font-weight:600; color:#black;}
</style>
</head>
<body>
	<jsp:include page="${contextPatn }/views/common/header.jsp"/>
	<jsp:include page="${contextPath }/views/common/menubar.jsp"/>
	
	<div class="payment" id="orderView">
		<h2><input type="text" name="tableNo" value="3">번 테이블</h2>
		<div id="orderList">
			<table>
				<tr><th>시간</th><th>메뉴</th><th>수량</th></tr>
				<tr><td>19:07:32</td><td>칼국수</td><td>1</td></tr>			
				<tr><td>19:07:32</td><td>제육볶음(중)</td><td>1</td></tr>
				<tr><td>19:07:32</td><td>제육볶음(중)</td><td>1</td></tr>
				<tr><td>19:07:32</td><td>제육볶음(중)</td><td>1</td></tr>
				<tr><td>19:07:32</td><td>제육볶음(중)</td><td>1</td></tr>
				<tr><td>19:07:32</td><td>제육볶음(중)</td><td>1</td></tr>
				<tr><td>19:07:32</td><td>제육볶음(중)</td><td>1</td></tr>
				<tr><td>19:07:32</td><td>제육볶음(중)</td><td>1</td></tr>
				<tr><td>19:07:32</td><td>제육볶음(중)</td><td>1</td></tr>
				<tr><td>19:07:32</td><td>제육볶음(중)</td><td>1</td></tr>
				<tr><td>19:07:32</td><td>제육볶음(중)</td><td>1</td></tr>
				<tr><td>19:07:32</td><td>제육볶음(중)</td><td>1</td></tr>
				<tr><td>19:07:32</td><td>제육볶음(중)</td><td>1</td></tr>
				<tr><td>19:07:32</td><td>제육볶음(중)</td><td>1</td></tr>				
			</table>
		</div>
		<div id="resultPriceZone">
			<p ><label>총 금액 : </label><input type="text" name="totalPrice" id="resultPrice" value="100000" readonly></p>
		</div>
	</div>
	
	<div class="payment" id="inputArea">
		<p><label>회사명 : </label><input type="text" name="company"></p>
		<p><label>부서명 : </label><input type="text" name="department"></p>
		<p><label>결제 금액 : </label><input type="text" id="price" name="price"></p>
	</div>
	<br clear="both">
	<div id="btnArea">
		<button type="button" id="cash">현금</button><button type="button" id="card">카드</button><button type="button" id="credit">외상</button>
	</div>
</body>
<script>
	$(function(){
		$("#cash").click(function(){	//현금 결제 버튼
			$.ajax(){
				
			}
		})
		$("#card").click(function(){	//카드 결제
			
		})
		$("#credit").click(function(){	//외상
			
		})
	})
</script>
</html>