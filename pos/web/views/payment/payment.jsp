<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.text.DecimalFormat" %>
<%@ page import="java.util.*" %>
<%
	DecimalFormat formatter = new DecimalFormat("###,###");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전주손칼국수</title>
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
	
	#inputArea{margin-left:150px; margin-top:100px; width:500px; height:500px; }
	#inputArea>p{margin-bottom:10px; float:right;}
	#inputArea>p>label{font-size:20px; font-weight:600;}
	#inputArea>p>input{width:200px; height:30px; font-size:20px;}
	
	#keypad{margin:auto; width:100%;}
	#keypad>button{width:166.66px; height:60px; font-size:25px; border-radius:10px; background-color:#fffff3;}
	
	#btnArea{position:fixed; left:850px; top:770px;}
	#btnArea>button{width:200px; height:80px; margin-right:15px; border-radius:10px; background-color:#E0E3DA; font-size: 25px; font-weight:600; color:#black;}
</style>
</head>
<body>
	<%-- <jsp:include page="${contextPath}/views/common/header.jsp"/> --%>
	<%-- <jsp:include page="${contextPath}/views/common/menubar.jsp"/> --%>
	<%@ include file="/views/common/header.jsp" %>
	<%@ include file="/views/common/menubar.jsp" %>
	
	<div class="payment" id="orderView">
		<h2><input type="text" name="tableNo" value="${tableNo }">번 테이블</h2>
		<div id="orderList">
			<table>
				<tr><th>시간</th><th>메뉴</th><th>수량</th></tr>
				<c:forEach var="orderList" items="${orderList }">
					<tr><td>${orderList.ORDER_DATE }</td><td>${orderList.MENU }</td><td>${orderList.AMOUNT }</td></tr>
				</c:forEach>
			</table>
		</div>
		<div id="resultPriceZone">
			<p ><label>총 금액 : </label><input type="text" name="totalPrice" id="resultPrice" value="${totalPrice }" readonly></p>
		</div>
	</div>
	
	<div class="payment" id="inputArea">
		<p><label>회사명 : </label><input type="text" name="company"></p>
		<p><label>부서명 : </label><input type="text" name="department"></p>
		<p><label>결제 금액 : </label><input type="text" id="price" name="price" style="text-align:right;"></p>
		<p><label>결제 시간 : </label><input type="text" id="payment_toDate" readonly></p>
		<br clear="both">
		<div id="keypad">
			<button type="button" id="one" class="number">1</button><button type="button" id="two" class="number">2</button><button type="button" id="tree" class="number">3</button>
			<button type="button" id="four" class="number">4</button><button type="button" id="five" class="number">5</button><button type="button" id="six" class="number">6</button>
			<button type="button" id="seven" class="number">7</button><button type="button" id="eight" class="number">8</button><button type="button" id="nine" class="number">9</button>
			<button type="button" id="zero" class="number">0</button><button type="button" id="ce" class="cancel">CE</button><button type="button" id="back" class="back">←</button>
			
		</div>
	</div>
	<br clear="both">
	<div id="btnArea">
		<button type="button" id="cash">현금</button>
		<button type="button" id="card">카드</button>
		<!-- 외상결제 시 조건문으로 처리로 있고없고 -->
		<button type="button" id="credit">외상</button>
	</div>
</body>
<script>
	$(function(){
		var date = new Date();
		$("#payment_toDate").val(date.getFullYear()+""+(date.getMonth()+1)+""+date.getDate()+"-" + date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());
		
		$number = "";
		$(".number").click(function(){	//숫자패드 클릭시
			$number += $(this).html();
			$("#price").val($number);
		})
		$("#ce").click(function(){	//숫자패드 초기화
			$("#price").val("");
			$number = "";
		})
		$("#back").click(function(){
			$number = $number.substr(0,$number.length-1);
			$("#price").val($number);
		})
		
		$("#cash").click(function(){	//현금 결제 버튼
			$resultPrice = (Number)($("#resultPrice").val());
			$price = (Number)($("#price").val());
			$.ajax({
				type:"get",
				url : "<%=request.getContextPath()%>/payment",
				data: {resultPrice:$resultPrice, price:$price, payMethod:"cash"},
				success:function(data){
					
				},
				error:function(data){
					
				}
			});
		})
		$("#card").click(function(){	//카드 결제
			$resultPrice = (Number)($("#resultPrice").val());
			$price = (Number)($("#price").val());
			$.ajax({
				type:"get",
				url : "<%=request.getContextPath()%>/payment",
				data: {resultPrice:$resultPrice, price:$price, payMethod:"card"},
				success:function(data){
					
				},
				error:function(data){
					
				}
			});
		})
		$("#credit").click(function(){	//외상
			$resultPrice = (Number)($("#resultPrice").val());
			$price = (Number)($("#price").val());
			$.ajax({
				type:"get",
				url : "<%=request.getContextPath()%>/payment",
				data: {resultPrice:$resultPrice, price:$price, payMethod:"credit"},
				success:function(data){
					
				},
				error:function(data){
					
				}
			});
		})
	})
</script>
</html>