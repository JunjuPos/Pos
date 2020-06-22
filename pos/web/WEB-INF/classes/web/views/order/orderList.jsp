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
         h1{text-align:center; color:#fffff3;}
            span{display: inline-block;}

            button{background: white; font-size: 20px; font-weight:700; width:180px; height: 71px; border-radius: 10px; }
         	button:hover{background:#A593E0; color:#fffff3; cursor:pointer;}
            #menuarea{width: 750px; height: 600px; background: rgb(46, 44, 44); color: white; border-radius: 10px; padding-top:-100px;}
            #menuarea>table{width: 750px; height:50px; border-collapse; font-size:20px;}
            #menuarea>table>tr>th{height:100px; width:150px; background: black; font-size:16px;}
            #menuarea>table>tr>td{text-align:center; height:20px; width:170px; font-size:16px;}
            
            #removeOrderBtn{width:80px; height:50px; font-size:18px;}
       	   .orderInfo{text-align:center; height:20px; width:150px; font-size:16px; background: rgb(46, 44, 44); color:white; border:0px; }
         
       	  .menuTable{width:800px;padding-left:50px; padding-top:15px;}
       	  .menuTable td{display:inline-block;}
       	     
            #pricearea{margin-left:452px; width: 300px; height: 50px; line-height: 30px; background: rgb(46, 44, 44); color: white; border-radius: 10px;}
            #totalPrice{background:rgb(46, 44, 44); color:#fffff3; font-size:20px; border:0px; border-radius:10px; margin-top:13px; width:90%; text-align:right;}
            
            .basicPrice{maigin:0px; padding:0px; width:0px; height:0px;}
            
            h2{color:#fffff3; margin-left:100px;}
        </style>
</head>
<body>
   <jsp:include page="../common/header.jsp"/>
   <jsp:include page="../common/menubar.jsp"/>
   
      <h1 align="center">메뉴 주문</h1>
      <h2 align="left">${tableNo}번 테이블</h2>  
        <section class="middle">
        
        	<!-- 주문 시작 -->
            <span>
                <form action="${contextPath}/order/orderInsert" method="get" id="orderform">
                    <div id="menuarea" style="overflow: auto;">
                        <table id="orderZone" class="orderZone">
                           <tr><input type="hidden" name="tableNo" value="${tableNo }"></tr>
                            <tr><th>시간</th><th>메뉴</th><th>가격</th><th>수량</th><th></th></tr>
                            <c:if test="${!empty requestScope.orderList}">
                               <c:forEach var = "o" items="${requestScope.orderList}">
                               <c:url var="orderNo" value="/order/orderInsert">
                                  <c:param name="orderDate" value="${o.ORDER_DATE}"/>
                               </c:url> 
                               <tr>
                               		 <input type="hidden" id="basicPrice" class="basicPrice" value="${o.PRICE }" name="orderBasic" readonly>
                                     <td><input type="text" id="orderDate" class="orderInfo" value="${o.ORDER_DATE }" name="orderDate" readonly></td>
                                     <td><input type="text" class="orderInfo" value="${o.MENU }" name="orderMenu" readonly></td>
                               <%--       <td><input type="text" id="orderPrice" class="orderInfo orderPrice" value="${o.PRICE }" name="orderPrice" readonly></td> --%>
                                     <td><input type="text" id="orderPrice" class="orderInfo orderPrice" value="${o.PRICE }" name="orderPrice" readonly></td>
                                     <td><input type="number"  class="orderInfo orderAmount" min="1" value="${o.AMOUNT }"  name="orderAmount" ></td>
                                     <td><button type="button" id="removeOrderBtn" >취소</button></td>   
                               </tr>
                            </c:forEach>
                            </c:if>
                            <c:if test="${empty requestScope.orderList}">
                            </c:if>
                        </table>
                    </div>
                </form>
            </span>
			<script>
			// 수량이 변경될때 가격도 변동(select 된 것만)
            $(function(){
               $(".orderAmount").change(function(){
               var $basicPrice =(Number)($(this).closest('tr').children().val());
               var $Amount = (Number)($(this).val());
               var $total = $basicPrice * $Amount;
               console.log("select $basicPrice" + $basicPrice);
               
               $(this).parents().children().children().eq(2).val($total);
               })
            })
			</script>
			
			
			<!-- MENU 시작 -->
            <span>
                <article>
                    <table class="menuTable">
                       <tr>
                       <c:forEach var="menu" begin="0" step="1" items="${requestScope.menuList }">
                           <td><button class="menu" value="${menu.PRICE}">${menu.MENU}</button></td>
                        </c:forEach>
                       <tr>    
                       <!-- ★ 주류/음료 list새로 불러오기  -->
	                        <tr>
			                      <c:forEach var="menu" items="${requestScope.drinkList }" varStatus="ml">
			                        <c:if test="${drinkList[ml.index].CATEGORY eq '주류/음료'}">
				                            <td><button class="menu" value="${drinkList[ml.index].PRICE }" >${drinkList[ml.index].MENU }</button></td>
			                        </c:if>
			                      </c:forEach> 
	                        </tr>
                       
                        <tr>
                            <td colspan="2"><button id="order" style="background: gray; width:365px;"  onclick="order();">주문</button></td>
                            <td colspan="2"><button id="payment" style="background: gray; width:365px;">결제</button></td>
                        </tr>
                    </table>
                </article>
            </span>
            
            <br clear="both">
            
            <div id="pricearea"><input type="text" id="totalPrice" value="0"></div>
            
         </section>
         
         <script>
                $(function(){
                    $orderZone = $("#orderZone");
                    var html = "";
                    
                    $totalPrice = $("#totalPrice");
                    var total = 0;
                    $appendPrice = 0;	// append 된 가격
                    
                    
                    // select된 것 totalPrice
                 /*   	$('.orderPrice').each(function(){
                   		total += (Number)($(this).val());
                   		
                   	})
                   
                   		console.log("total 가격 : " + total); */


                    
                    $(".menu").click(function(){		// 메뉴를 클릭했을 때 주문칸에 메뉴와 가격 입력
                        
                        var d = new Date();
                        var $tr = $("<tr>");
                        var menu = $(this).text();
                        var price = (Number)($(this).val());
                		$input = $("<input type='hidden' class='basicPrice' name='basicPrice' value=" + (Number)($(this).val())+ " readonly>"); 
                		$removeBtn = $("<td><button type='button' id='removeOrderBtn' >취소</button></td>");
						$tr.prepend($input);
                        $tr.append(
                            "<td><input type='text' class='orderInfo' name='orderDate' value=  " + d.getFullYear()+(d.getMonth()+1)+d.getDate()+'-'+d.getHours()+':'+d.getMinutes()+':'+d.getSeconds() + " readonly></td>" + 
                            "<td><input type='text' class='orderInfo' name='orderMenu' value=  " + $(this).text() + " readonly></td>" +
                            "<td> <input type='text' class='orderInfo orderPrice' name='orderPrice' value=  " + (Number)($(this).val())+ " readonly></td>" +
                            "<td><input type='number' class='orderInfo orderAmount' name='orderAmount' min='1' value='1'></td>"                            
                        )
                        $tr.append($removeBtn);

                        console.log("$input " + $input.val());
                        $orderZone.append($tr);
						
                    	
                    })
                      
                    $toPrice = (Number)($(this).parents().children().children().eq(2).val());
                    $beforeAmount = $(".orderAmount").val();
                    
                    
                   $(document).on("change",".orderAmount",function(){	// 수량이 변경될때 가격도 변동(append 된것 만)
                       var $basicPrice = (Number)($(this).closest('tr').children().val());				// 메뉴에서 불러온 기존 가격
                       var $upPrice = (Number)($(this).parents().children().children().eq(2).val());    //수량으로 변화될 가격
                       var $amount = (Number)($(this).val()); 											// 수량
                   		
                       $upPrice =  $basicPrice * $amount;
                       $(this).parents().children().children().eq(2).val($upPrice);
                       
                       
                       // append 합계금액
                      /*  var $price = (Number)($(this).parents().children().children().eq(2).val());
                       console.log("$price : " + $price);
                       total += $price; 
                       
                   		
                       $totalPrice.val(total);   */
                   })
                   
                   
				// ★ 되는 합계 코드
                    
                    $(document).on("mouseenter","#orderform",function(){	
                    	 $appendPrice = 0;
                    	  $('.orderPrice').each(function(){
                    		  
                       	   $appendPrice += (Number)($(this).val());
                       	   
                       	   })
                       	 console.log("$appendPrice : " + $appendPrice);
                    	  $totalPrice.val($appendPrice);
                       	  
                   })
                    
                   
      
                   $("#payment").click(function(){
                	   var tableNo = $('input[name=tableNo]').val();
                	   location.href="<%=request.getContextPath()%>/paymentSelect?tableNo=" + tableNo;
                   })
                    

                }) 
             	
                
                function order(){
                    $("#orderform").submit();
                }
                

				$("removeOrderBtn").click(function(){
					$(this).closest('tr').remove();
				})
               
               	$(document).on("click","#removeOrderBtn",function(){
               		$(this).closest('tr').remove();
               	})
        </script>
</body>
</html>