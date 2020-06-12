<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <script src="http://code.jquery.com/jquery.min.js"></script>
        <style>
            .middle{margin:0; margin-left:100px; width: 90%;}
			h2{text-align:center; color:#fffff3;}
            span{display: inline-block;}

            /* section>button{width: 100px; height: 100px;} */
            button{background: white; font-size: 20px; font-weight:700; width:180px; height: 71px; border-radius: 10px;}

            #menuarea{width: 750px; height: 600px; background: rgb(46, 44, 44); color: white; border-radius: 10px; padding-top:-100px;}
            #menuarea>table{width: 750px; height:50px; border-collapse; font-size:20px;}
            #menuarea>table>tr>th{height:100px; width:150px; background: black; font-size:16px;}
            #menuarea>table>tr>td{width:150px; background: black;}
			.orderInfo{text-align:center; height:20px; width:170px; font-size:16px; background: rgb(46, 44, 44); color:white; border:0px; }
			
			.menuTable{padding-left:50px; padding-top:15px;}
			
            #pricearea{margin-left:452px; width: 300px; height: 50px; line-height: 30px; background: rgb(46, 44, 44); color: white; border-radius: 10px;}
        </style>
</head>
<body>
	<jsp:include page="../common/header.jsp"/>
	<jsp:include page="../common/menubar.jsp"/>
	
		<h2>메뉴 주문</h2>
        <section class="middle">
            <span>
                <form action="table.html" method="get" id="orderform">
                    <div id="menuarea" style="overflow: auto;">
                        <table id="orderZone">
                            <tr><th>시간</th><th>메뉴</th><th>가격</th><th>수량</th></tr>
                        </table>
                    </div>
                </form>
            </span>

            <span>
                <article>
                    <table class="menuTable">
                        <tr>
                            <td><button class="menu" value="6000" >가정식백반</button></td>
                            <td><button class="menu" value="7000" >칼국수</button></td>
                            <td><button class="menu" value="7000" >수제비</button></td>
                            <td><button class="menu" value="7000" >장칼국수</button></td>
                        </tr>
                        <tr>
                            <td><button class="menu" value="7000" >된장찌개</button></td>
                            <td><button class="menu" value="7000" >김치찌개</button></td>
                            <td><button class="menu" value="7000" >순두부찌개</button></td>
                            <td><button class="menu" value="8000">동태찌개</button></td>
                        </tr>
                        <tr>
                            <td><button class="menu" value="7000" >청국장</button></td>
                            <td><button class="menu" value="7000" >김치볶음밥</button></td>
                            <td><button class="menu" value="13000" >삼겹살</button></td>
                            <td><button class="menu" value="8000">부대찌개</button></td>
                        </tr>
                        <tr>
                            <td><button class="menu" value="30000">닭볶음탕(중)</button></td>
                            <td><button class="menu" value="35000">닭볶음탕(대)</button></td>
                            <td><button class="menu" value="20000">제육볶음(중)</button></td>
                            <td><button class="menu" value="23000">제육볶음(대)</button></td>
                        </tr>
                        <tr>
                            <td><button class="menu" value="20000" >오징어볶음(중)</button></td>
                            <td><button class="menu" value="23000" >오징어볶음(대)</button></td>
                            <td><button class="menu" value="60000" >옻오리</button></td>
                            <td><button class="menu" value="60000" >옻닭</button></td>
                        </tr>
                        <tr>
                            <td><button class="menu" value="60000" >닭백숙</button></td>
                            
                        </tr>
                        <tr>
                            <td><button class="menu" value="4000" >소주</button></td>
                            <td><button class="menu" value="4000" >맥주</button></td>
                            <td><button class="menu" value="3000" >막걸리</button></td>
                            <td><button class="menu" value="2000" >음료수</button></td>
                        </tr>
                        <tr></tr>
                        <tr>
                            <td><button id="order" style="background: gray;" onclick="order();">주문</button></td>
                            <td><button style="background: gray;">주문 취소</button></td>
                            <td><button style="background: gray;">결제</button></td>
                        </tr>
                    </table>
                </article>
            </span>
            
            <br clear="both">
            
            <div id="pricearea"></div>
         </section>
         
         <script>
                $(function(){
                    $orderZone = $("#orderZone");
                    var html = "";
                    totalPrice = 0;
                    $(".menu").click(function(){
                        
                        var d = new Date();
                        var $tr = $("<tr>");
                        var menu = $(this).text();
                        var price = (Number)($(this).val());

                        totalPrice += price;

                        $tr.append(
                            "<td><input type='text' class='orderInfo' name=  " +$(this).text() + " value=  " + d.getFullYear()+(d.getMonth()+1)+d.getDate()+'-'+d.getHours()+':'+d.getMinutes()+':'+d.getSeconds() + " readonly></td>" + 
                            "<td><input type='text' class='orderInfo' name=  " +$(this).text() + " value=  " + $(this).text() + " readonly></td>" +
                            "<td><input type='text' class='orderInfo' name=  " +$(this).text() + " value=  " + $(this).val() + " readonly></td>" +
                            "<td><input type='number' class='orderInfo'name=  " +$(this).text() + " min='1' value='1'></td>"
                        )
                        $orderZone.append($tr);
                    })

                    
                })

                function order(){
                    $("#orderform").submit();
                }
               
            </script>
</body>
</html>