<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script src="js/calculation.js"></script>
<title>Insert title here</title>
 <style>
            body{background: rgb(65, 56, 71);}
            #table{margin: auto; width: 50%; padding-top: 40px;}
            td>#btn{border-radius: 10px; width: 182px; height: 80px; font-size: 18px; font-weight: 600; background: #E0E3DA; color: black;}
            td>#btn:hover{background:#A593E0; color:#fffff3;}
            td>#area{border-radius: 10px;}
            .area1{background: white; color: black; height: 30px; line-height: 30px; font-size: 14px; font-weight: 600;}

            
        </style>
</head>
<body>
  
		<jsp:include page="../common/header.jsp"/>
		<jsp:include page="../common/menubar.jsp"/>
        <section id="table">
            <article>
                <table>
                    <tr>
                        <td><button id="btn" class="table1" type="button" onclick="location.href = 'order.html'">1번 테이블</button></td>
                        <td><button id="btn" class="table2" type="button" onclick="location.href = 'order.html'">2번 테이블</button></td>
                        <td><button id="btn"  class="table3"type="button" onclick="location.href = 'order.html'">3번 테이블</button></td>
                        <td><button id="btn"  class="table4"type="button" onclick="location.href = 'order.html'">4번 테이블</button></td>
                        <td><button id="btn" class="table5" type="button" onclick="location.href = 'order.html'">5번 테이블</button></td>
                    </tr>
                    <tr>
                        <td><div id="area" class="area1 table1price"> 가격:</div></td>
                        <td><div id="area" class="area1 table2price"> 가격:</div></td>
                        <td><div id="area" class="area1 table3price"> 가격:</div></td>
                        <td><div id="area" class="area1 table4price"> 가격:</div></td>
                        <td><div id="area" class="area1 table5price"> 가격:</div></td>
                    </tr>


                    <tr>
                        <td><button id="btn" class="table6" type="button" onclick="location.href = 'order.html'">6번 테이블</button></td>
                        <td><button id="btn" class="table7" type="button" onclick="location.href = 'order.html'">7번 테이블</button></td>
                        <td><button id="btn" class="table8" type="button" onclick="location.href = 'order.html'">8번 테이블</button></td>
                        <td><button id="btn" class="table9" type="button" onclick="location.href = 'order.html'">9번 테이블</button></td>
                        <td><button id="btn" class="table10" type="button" onclick="location.href = 'order.html'">10번 테이블</button></td>
                    </tr>
                    <tr>
                        
                        <td><div id="area" class="area1 table6price"> 가격:</div></td>
                        <td><div id="area" class="area1 table7price"> 가격:</div></td>
                        <td><div id="area" class="area1 table8price"> 가격:</div></td>
                        <td><div id="area" class="area1 table9price"> 가격:</div></td>
                        <td><div id="area" class="area1 table10price"> 가격:</div></td>
                    </tr>
                </table>
            </article>
        </section>
    </body>

    
    
</body>
</html>