<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script src="js/calculation.js"></script>
<title>Insert title here</title>
 <style>
            body{background: rgb(65, 56, 71);}
            #table{margin-left:200px; width: 50%; padding-top: 40px;}
            td>#btn{border-radius: 10px; width: 280px; height: 180px; font-size: 30px; font-weight: 600; background: #E0E3DA; color: black;}
            td>#btn:hover{background:#A593E0; color:#fffff3;}
            td>#area{border-radius: 10px;}
            .area1{background: white; color: black; height: 30px; line-height: 30px; font-size: 20px; font-weight: 600;padding-left:20px;}
			a:link { color: red; text-decoration: none;}
 			a:visited { color: black; text-decoration: none;}
 			a:hover { color: #fffff3; text-decoration: none;}

출처: https://it77.tistory.com/126 [시원한물냉의 사람사는 이야기]
            
        </style>
</head>
<body>
		<jsp:include page="../common/header.jsp"/>
		<jsp:include page="../common/menubar.jsp"/>
        <section id="table">
            <article>
            <c:if test="${requestScope.zeroPrice == 0}">
                <table>
                    <tr>
                        <c:url var="tableNo" value="/order/orderMenu"><c:param name="tableNo" value="1"/></c:url>
                        <td><button id="btn" class="table1 btn" type="button" onclick="location.href='${tableNo}'">1번 테이블</button></td>
                        <c:url var="tableNo" value="/order/orderMenu"><c:param name="tableNo" value="2"/></c:url>
                        <td><button id="btn" class="table2 btn" type="button" onclick="location.href='${tableNo}'">2번 테이블</button></td>
                        <c:url var="tableNo" value="/order/orderMenu"><c:param name="tableNo" value="3"/></c:url>
                        <td><button id="btn"  class="table3 btn"type="button" onclick="location.href='${tableNo}'">3번 테이블</button></td>
                        <c:url var="tableNo" value="/order/orderMenu"><c:param name="tableNo" value="4"/></c:url>
                        <td><button id="btn"  class="table4 btn"type="button" onclick="location.href='${tableNo}'">4번 테이블</button></td>
                        <c:url var="tableNo" value="/order/orderMenu"><c:param name="tableNo" value="5"/></c:url>
                        <td><button id="btn" class="table5 btn" type="button" onclick="location.href='${tableNo}'">5번 테이블</button></td>
                    </tr>
                    <tr>
                        <td><div id="area" class="area area1 table1price"> 가격: 0</div></td>
                        <td><div id="area" class="area area1 table2price"> 가격: 0</div></td>
                        <td><div id="area" class="area area1 table3price"> 가격: 0</div></td>
                        <td><div id="area" class="area area1 table4price"> 가격: 0</div></td>
                        <td><div id="area" class="area area1 table5price"> 가격: 0</div></td>
                    </tr>


                    <tr>
                       	<c:url var="tableNo" value="/order/orderMenu"><c:param name="tableNo" value="6"/></c:url>
                        <td><button id="btn" class="table6 btn" type="button" onclick="location.href='${tableNo}'">6번 테이블</button></td>
                        <c:url var="tableNo" value="/order/orderMenu"><c:param name="tableNo" value="7"/></c:url>
                        <td><button id="btn" class="table7 btn" type="button" onclick="location.href='${tableNo}'">7번 테이블</button></td>
                        <c:url var="tableNo" value="/order/orderMenu"><c:param name="tableNo" value="8"/></c:url>
                        <td><button id="btn"  class="table8 btn"type="button" onclick="location.href='${tableNo}'">8번 테이블</button></td>
                        <c:url var="tableNo" value="/order/orderMenu"><c:param name="tableNo" value="9"/></c:url>
                        <td><button id="btn"  class="table9 btn"type="button" onclick="location.href='${tableNo}'">9번 테이블</button></td>
                        <c:url var="tableNo" value="/order/orderMenu"><c:param name="tableNo" value="10"/></c:url>
                        <td><button id="btn" class="table10 btn" type="button" onclick="location.href='${tableNo}'">10번 테이블</button></td>
                    </tr>
                    <tr>
                        
                        <td><div id="area" class="area area1 table6price"> 가격: 0</div></td>
                        <td><div id="area" class="area area1 table7price"> 가격: 0</div></td>
                        <td><div id="area" class="area area1 table8price"> 가격: 0</div></td>
                        <td><div id="area" class="area area1 table9price"> 가격: 0</div></td>
                        <td><div id="area" class="area area1 table10price"> 가격: 0</div></td>
                    </tr>
                </table>
                </c:if> <!-- requestScope.zeroPrice == 0 일 때 -->
                
                <c:if test="${!empty requestScope.list}">
                <table>
                    <tr>
                    	<c:url var="tableNo" value="/order/orderMenu"><c:param name="tableNo" value="1"/></c:url>
                        <td><button id="btn" class="table1 btn" type="button" onclick="location.href='${tableNo}'">1번 테이블</button></td>
                        <c:url var="tableNo" value="/order/orderMenu"><c:param name="tableNo" value="2"/></c:url>
                        <td><button id="btn" class="table2 btn" type="button" onclick="location.href='${tableNo}'">2번 테이블</button></td>
                        <c:url var="tableNo" value="/order/orderMenu"><c:param name="tableNo" value="3"/></c:url>
                        <td><button id="btn"  class="table3 btn"type="button" onclick="location.href='${tableNo}'">3번 테이블</button></td>
                        <c:url var="tableNo" value="/order/orderMenu"><c:param name="tableNo" value="4"/></c:url>
                        <td><button id="btn"  class="table4 btn"type="button" onclick="location.href='${tableNo}'">4번 테이블</button></td>
                        <c:url var="tableNo" value="/order/orderMenu"><c:param name="tableNo" value="5"/></c:url>
                        <td><button id="btn" class="table5 btn" type="button" onclick="location.href='${tableNo}'">5번 테이블</button></td>
                    </tr>
                    <tr>
                   		<td><div id="area" class="area area1 table1price"> 가격: <fmt:formatNumber value="${requestScope.oneTable.TOTAL_PRICE}" groupingUsed="true"/> </div></td>
                        <td><div id="area" class="area area1 table2price"> 가격: <fmt:formatNumber value="${requestScope.twoTable.TOTAL_PRICE}" groupingUsed="true"/> </div></td>
                        <td><div id="area" class="area area1 table3price"> 가격: <fmt:formatNumber value="${requestScope.threeTable.TOTAL_PRICE}" groupingUsed="true"/> </div></td>
                        <td><div id="area" class="area area1 table4price"> 가격: <fmt:formatNumber value="${requestScope.fourTable.TOTAL_PRICE}" groupingUsed="true"/> </div></td>
                        <td><div id="area" class="area area1 table5price"> 가격: <fmt:formatNumber value="${requestScope.fiveTable.TOTAL_PRICE}" groupingUsed="true"/> </div></td>
                    </tr>


                    <tr>
                   		<c:url var="tableNo" value="/order/orderMenu"><c:param name="tableNo" value="6"/></c:url>
                        <td><button id="btn" class="table6 btn" type="button" onclick="location.href='${tableNo}'">6번 테이블</button></td>
                        <c:url var="tableNo" value="/order/orderMenu"><c:param name="tableNo" value="7"/></c:url>
                        <td><button id="btn" class="table7 btn" type="button" onclick="location.href='${tableNo}'">7번 테이블</button></td>
                        <c:url var="tableNo" value="/order/orderMenu"><c:param name="tableNo" value="8"/></c:url>
                        <td><button id="btn"  class="table8 btn"type="button" onclick="location.href='${tableNo}'">8번 테이블</button></td>
                        <c:url var="tableNo" value="/order/orderMenu"><c:param name="tableNo" value="9"/></c:url>
                        <td><button id="btn"  class="table9 btn"type="button" onclick="location.href='${tableNo}'">9번 테이블</button></td>
                        <c:url var="tableNo" value="/order/orderMenu"><c:param name="tableNo" value="10"/></c:url>
                        <td><button id="btn" class="table10 btn" type="button" onclick="location.href='${tableNo}'">10번 테이블</button></td>
                    </tr>
                    <tr>
                        
                        <td><div id="area" class="area1 table6price"> 가격: <fmt:formatNumber value="${requestScope.sixTable.TOTAL_PRICE}" groupingUsed="true"/> </div></td>
                        <td><div id="area" class="area1 table7price"> 가격: <fmt:formatNumber value="${requestScope.sevenTable.TOTAL_PRICE}" groupingUsed="true"/></div></td>
                        <td><div id="area" class="area1 table8price"> 가격: <fmt:formatNumber value="${requestScope.eightTable.TOTAL_PRICE}" groupingUsed="true"/></div></td>
                        <td><div id="area" class="area1 table9price"> 가격: <fmt:formatNumber value="${requestScope.nineTable.TOTAL_PRICE}" groupingUsed="true"/></div></td>
                        <td><div id="area" class="area1 table10price"> 가격: <fmt:formatNumber value="${requestScope.tenTable.TOTAL_PRICE}" groupingUsed="true"/></div></td>
                    </tr>
                </table>
                </c:if> <!-- !empty requestScope.list 일 때 -->
            </article>
        </section>
    </body>

    
    
</body>
</html>