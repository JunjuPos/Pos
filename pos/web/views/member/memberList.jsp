<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList, member.model.vo.Member"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<%
	ArrayList<Member> mlist = (ArrayList<Member>)request.getAttribute("mlist");
	
	String insertMsg = (String)request.getAttribute("insertMsg");
	
%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객관리</title>
<style>
	#memberArea{margin-left:230px; padding-top:20px; width:1700px; height:600px; }
	#memberArea>table{width:100%; border:2px solid #fffff3; font-size:23px;}
	#memberArea>table tr{border-top:1px solid #fffff3; line-height:70px;}
	#memberArea>table th{ border-bottom:1px solid #fffff3; color:#E0E3DA;}
	#memberArea>table td{text-align:center; }
	#lastTh{width:250px;}
 
	#memberChargeBtn{width:45%; height:50px; border-radius:10px; font-size:20px; font-weight:600;}
	#memberUpdateBtn{width:45%; height:50px; border-radius:10px; font-size:20px; font-weight:600;}
	#memberChargeBtn:hover{background-color:#A593E0; color:#fffff3;}
	#memberUpdateBtn:hover{background-color:#A593E0; color:#fffff3;}
	#memberInsertBtn{width:80%; height:50px; border-radius:10px; font-size:20px; font-weight:600;}
	#memberInsertBtn:hover{background-color:#A593E0; color:#fffff3;}

	#pagingArea{font-size:20px;}
	
</style>
</head>
<body>
	<%@ include file="/views/common/header.jsp" %>
	<%@ include file="/views/common/menubar.jsp" %>
	
	
	
	<div id="memberArea">
		<h1 align="center">고객관리</h1>
		<br>
		<table>
			<tr>
				<th id="firstTh">번호</th><th>회사명</th><th>부서명</th><th>연락처</th><th>외상금액</th><th>선불금액</th><th>탈퇴여부</th>
				<th id="lastTh">
					<button type="button" id="memberInsertBtn" onclick="memberInsert();">신규등록</button>	
				</th>
			</tr>
			
			<c:if test="${empty mlist }">
				<tr>
					<td colspan="8">등록된 고객이 없습니다.</td>
				</tr>
			</c:if>
			
			<c:if test="${!empty mlist }">
				<c:forEach var="m" items="${requestScope.mlist }">
					<tr>
						<td>${m.mNo }</td> 
						<%-- <td><input type="hidden" value=<%=mlist.getmNo() %>></td> --%>
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
				&nbsp;이후
			</c:if>
			
			<!-- 마지막 페이지가 아닐경우 -->
			<c:if test="${pi.currentPage < pi.maxPage }">
				<c:url var="mListEnd" value="memberList.me">
					<c:param name="currentPage" value="${pi.currentPage +1 }"/>
				</c:url>
			</c:if>
		
		</div><!-- pageinArea end -->
			
	</div><!-- memberArea end -->
	
	
	<script>
		$(function(){
			$("#memberArea").find("td").mouseenter(function(){
				$(this).parents("tr").css({"background" : "#E0E3DA", "cursor" : "pointer"});
				
			}).mouseout(function(){
				$(this).parents("tr").css({"background" : "#566270"});
			
			}).click(function(){
				var mNo = $(this).parents().children("td").eq(0).text();
				location.href="<%=request.getContextPath()%>/selectOne.me?mNo=" + mNo;
			});
		});
		
		function memberInsert(){
			location.href="<%=request.getContextPath()%>/views/member/memberInsert.jsp";
		};
	
		<%if(insertMsg != null){%>
			alert("<%=insertMsg%>");
		<%}%>
		
	</script>
	
	
		
</body>

</html>