<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <script  src="http://code.jquery.com/jquery-latest.min.js"></script>
        <style>
            .middle{margin:0; margin-left:100px; width: 90%;}
			h2{text-align:center; color:#fffff3;}
            span{display: inline-block;}

            button{background: white; font-size: 20px; font-weight:700; width:180px; height: 71px; border-radius: 10px; }
			button:hover{background:#A593E0; color:#fffff3; cursor:pointer;}
            #menuarea{width: 750px; height: 600px; background: rgb(46, 44, 44); color: white; border-radius: 10px; padding-top:-100px;}
            #menuarea>table{width: 750px; height:50px; border-collapse; font-size:20px;}
            #menuarea>table>tr>th{height:100px; width:150px; background: black; font-size:16px;}
            #menuarea>table>tr>td{text-align:center; height:20px; width:170px; font-size:16px;}
            
			.orderInfo{text-align:center; height:20px; width:170px; font-size:16px; background: rgb(46, 44, 44); color:white; border:0px; }
			
			.menuTable{width:800px;padding-left:50px; padding-top:15px;}
			.menuTable td{display:inline-block;}
            
            #pricearea{margin-left:452px; width: 300px; height: 50px; line-height: 30px; background: rgb(46, 44, 44); color: white; border-radius: 10px;}
            #totalPrice{background:rgb(46, 44, 44); color:#fffff3; font-size:20px; border:0px; border-radius:10px;}
        </style>
</head>
<body>
	<jsp:include page="../common/header.jsp"/>
	<jsp:include page="../common/menubar.jsp"/>
	
		<h2>메뉴 주문</h2>
        <section class="middle">
            <span>
                <form action="${contextPath}/order/orderInsert" method="get" id="orderform">
                    <div id="menuarea" style="overflow: auto;">
                        <table id="orderZone">
                        	<tr><input type="hidden" name="tableNo" value="${tableNo }"></tr>
                        	<tr><input type="hidden" name="tableNo" value="${requstScope.orderList.ORDER_NO[0] }"></tr>
                        	
                            <tr><th>시간</th><th>메뉴</th><th>가격</th><th>수량</th></tr>
                            
                            <c:if test="${!empty requestScope.orderList}">
                           	 <c:forEach var = "o" items="${requestScope.orderList}">
	                            <c:url var="orderNo" value="/order/orderInsert">
	                            	<%-- <c:param name="orderNo" value="${o.ORDER_NO}"/> --%>
	                            	<c:param name="orderDate" value="${o.ORDER_DATE}"/>
	                            </c:url> 
	                            <tr>
	                            	<c:if test="${!empty o.ORDER_NO }">
	                            		<input type="hidden" class="orderInfo" value="${o.ORDER_NO }" name="orderNo">
	                            	</c:if>
		                            	<td><input type="text" id="orderDate" class="orderInfo" value="${o.ORDER_DATE }" name="orderDate" readonly></td>
		                            	<td><input type="text" class="orderInfo" value="${o.MENU2 }" name="orderMenu" readonly></td>
		                            	<!-- ★ 수량높이면 가격도 높일 수 있게   -->
		                            	<td><input type="text" id="orderPrice" class="orderInfo orderPrice" value="${o.PRICE }" name="orderPrice" readonly></td>
		                            	<td><input type="number" id="orderAmount" class="orderInfo" min="1" value="${o.AMOUNT }"  name="orderAmount" ></td>	
	                            </tr>
	                            <script>
	                            	$(function(){
	                            		$("#orderAmount").change(function(){
	                            		var oPrice =(Number)("<c:out value='${o.PRICE}'/>");
	                            		console.log(oPrice);
	                            		var oAmount = (Number)($().val());
	                            		console.log(oAmount);
	                            		var total = oPrice * oAmount;
	                            		console.log(total);
	                            		$("#orderPrice").val(total);
	                            		})
	                            	})
	                            </script>
                            </c:forEach>
                            </c:if>
                            <c:if test="${empty requestScope.orderList}">

                           		<input type="hidden" class="orderInfo" value="zero" name="orderNo">	                          
                            </c:if>
                        </table>
                    </div>
                </form>
            </span>

            <span>
                <article>
                    <table class="menuTable">
	                    <tr>
                    	<c:forEach var="menu" begin="0" step="1" items="${requestScope.menuList }">
	                        <td><button class="menu" value="${menu.PRICE}">${menu.MENU}</button></td>
                        </c:forEach>
	                    <tr>    
	                    <!-- ★ 주류/음료 list새로 불러오기  -->
                     <%--    <c:forEach var="m" items="${requestScope.menuList }">
                        <c:if test=${m.CATEGORY eq '주류/음료'}>
                        <tr>
                            <td><button class="menu" value="${m.PRICE }" >${m.MENU }</button></td>
                        </tr>
                        </c:if>
                        </c:forEach> --%>
                       
                        <tr>
                            <td><button id="order" style="background: gray;" onclick="order();">주문</button></td>
                            <td><button style="background: gray;">주문 취소</button></td>
                            <td><button style="background: gray;">결제</button></td>
                        </tr>
                    </table>
                </article>
            </span>
            
            <br clear="both">
            
            <div id="pricearea"><input type="text" id="totalPrice"></div>
            
         </section>
         
         <script>
                $(function(){
                    $orderZone = $("#orderZone");
                    var html = "";
                    $totalPrice = $("#totalPrice");
                    
                    var total = 0;
                    $(".menu").click(function(){
                        
                        var d = new Date();
                        var $tr = $("<tr>");
                        var menu = $(this).text();
                        var price = (Number)($(this).val());
						var $input = $("<input type='hidden' class='orderInfo' value='zero' name='orderNo'>");
                        


                        $tr.append(
                            "<td><input type='text' class='orderInfo' name='orderDate' value=  " + d.getFullYear()+(d.getMonth()+1)+d.getDate()+'-'+d.getHours()+':'+d.getMinutes()+':'+d.getSeconds() + " readonly></td>" + 
                            "<td><input type='text' class='orderInfo' name='orderMenu' value=  " + $(this).text() + " readonly></td>" +
                            "<td><input type='text' id='orderPrice' class='orderInfo' name='orderPrice' value=  " + (Number)($(this).val())+ " readonly></td>" +
                            "<td><input type='number' id='orderAmount' class='orderInfo'name='orderAmount' min='1' value='1'></td>"
                        )
                        
                        $orderZone.append($input);
                        $orderZone.append($tr);
                       
                        
                        
                        
                        total += price; 
                        
                    	$totalPrice.val(total); 
                    })
                    
                   /* $("#orderAmount").change(function(){
                    	var $upPrice = (Number)($(this).parents().children().children().eq(2).val());
                    	var $amount = (Number)($(this).val());
                    	var $plusPrice = upPrice * amount;
                    	console.log(plusPrice);
                    	$(this).parents().children().children().eq(2).val(plusPrice);
                    	var $price1 = "<c:out value='${pi.currentPage}'/>";
                            
                    }) */
                })

                function order(){
                    $("#orderform").submit();
                }
               
            </script>
</body>
</html>