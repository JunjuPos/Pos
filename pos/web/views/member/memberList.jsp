<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객관리</title>
<style>
	#memberArea{margin-left:230px; padding-top:20px; width:1700px; height:600px; }
	#memberArea>table{width:100%; border:2px solid #fffff3; font-size:23px;}
	#memberArea>table tr{border-top:1px solid #fffff3; line-height:70px;}
	#memberArea>table th{width:60px; border-bottom:1px solid #fffff3; color:#E0E3DA;}
	#memberArea>table td{width:60px; text-align:center; }
	#lastTh{width:150px;}
	
	#memberChargeBtn{width:45%; height:50px; border-radius:10px; font-size:20px; font-weight:600;}
	#memberUpdateBtn{width:45%; height:50px; border-radius:10px; font-size:20px; font-weight:600;}
	#memberChargeBtn:hover{background-color:#A593E0; color:#fffff3;}
	#memberUpdateBtn:hover{background-color:#A593E0; color:#fffff3;}
	
	#memberArea>#btnArea{margin:0 auto; width:30%; top:800px; left:600px;}
	#memberArea>#btnArea>button{width:50%; height:50px; border-radius:10px; font-size:28px; font-weight:600; margin-left:120px;}
	#btnArea button:hover{background-color:#A593E0; color:#fffff3;}
</style>
</head>
<body>
	<jsp:include page="${contextPath }/views/common/header.jsp"/>
	<jsp:include page="${contextPath }/views/common/menubar.jsp"/>
	
	
	<div id="memberArea">
		<h1 align="center">고객관리</h1>
		<br>
		<table>
			<tr>
				<th>회사명</th><th>부서명</th><th>연락처</th><th>외상금액</th><th>선불금액</th><th>탈퇴여부</th><th id="lastTh"></th>
			</tr>
			
			<c:if test="${empty mlist }">
				<tr>
					<td colspan="7">등록된 고객이 없습니다.</td>
				</tr>
			</c:if>
			
			<c:if test="${!empty mlist }">
				<c:forEach var="m" items="${requestScope.mlist }">
					<tr>
						<%-- <td>${m.mNo }</td> --%>
						<td>${m.company }</td>
						<td>${m.dept }</td>
						<td>${m.phone }</td>
						<td>${m.cMoney }</td>
						<td>${m.mDeposit }</td>
						<td>${m.status }</td>
						<td>
							<button type="button" id="memberChargeBtn">외상결제</button>
							<button type="button" id="memberUpdateBtn">수정</button>
						</td>
					</tr>
				</c:forEach>
			</c:if><!-- mlist if end -->
		</table>
		
		
		
		<br><br>
		<div id="btnArea">
			<button type="button" id="memberInsert">신규등록</button>	
		</div>
		
		<!-- pagingArea -->
		<div id="pagingArea" align="center">
			<!-- '이전'버튼 -->
			<c:if test="${pi.currentPage ==1 }">
				이전&nbsp;
			</c:if>
	
			<c:if test="${pi.currentPage >1 }">
				<c:url var="mlistBack" value="memberList.me">
					<c:param name="currentPage" value="${pi.currentPage-1 }"/>
				</c:url>
				<a href="${mlistBack }">이전</a>
			</c:if>
			
			<!-- '번호' 버튼 -->
			<c:forEach var="p" begin="${pi.startPage }" end="${pi.endPage }">
				<c:if test="${p eq pi.currentPage }">
					<font color="#A593E0" size="4"><b>[${p }]</b></font>
				</c:if>
				
				<c:if test="${p ne pi.currentPage }">
					<c:url var="mlistCheck" value="memberList.me">
						<c:param name="currentPage" value="${p }"/>
					</c:url>
					<a href="${mlistCheck }">${p }</a>
				</c:if>
			</c:forEach>
		
			<!-- '이후' 버튼 -->
			<!-- 끝페이지 일때는 클릭이 되지 않겠금 -->
			<c:if test="${pi.currentPage == pi.maxPage }">
				&nbsp;[이후]
			</c:if>
			
			<!-- 마지막 페이지가 아닐경우 -->
			<c:if test="${pi.currentPage < pi.maxPage }">
				<c:url var="mListEnd" value="memberList.me">
					<c:param name="currentPage" value="${pi.currentPage +1 }"/>
				</c:url>
			</c:if>
		
		</div><!-- pageinArea end -->
			
	</div><!-- memberArea end -->
</body>













</html>