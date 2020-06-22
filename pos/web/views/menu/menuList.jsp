<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList, menu.model.vo.Menu"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%
	String insertMsg = (String)request.getAttribute("insertMsg");
%> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<title>메뉴 리스트 페이지</title>
<style>
	#menuListArea{width:80%; margin-left:100px;}
	#menuListArea p{color:#E0E3DA; font-size:30px;}
	#menuListArea table{width:100%; border:0px;}
	
	#content{float:left;}
	/* #menuListArea table td{width:100%;} */
	#menuListArea button{margin: 0px; width:200px; height:100px; font-size: 25px; font-weight:600; color:#black; background-color:#E0E3DA; border-radius:20px; }
	#menuListArea button:hover{background-color:#A593E0; color:#fffff3;}

	#menuListArea>#btnArea{text-align:center;margin:0 auto; width:30%; top:800px; left:580px;}
	#menuListArea>#btnArea>button{width:60%; height:50px; border-radius:10px; font-size:28px; font-weight:600;}
	#btnArea button:hover{background-color:#A593E0; color:#fffff3;}


</style>

</head>
<body>
	<%@ include file="/views/common/header.jsp" %>
	<%@ include file="/views/common/menubar.jsp" %>

	<div id="menuListArea">
		<h1 align="center">메뉴관리</h1>
		<br>
		
		<div id="btnArea">
				<button type="button" id="memberInsert" onclick="menuInsert();">신 메뉴 등록하기</button>
		</div>
		
		<table>
			<c:forEach varStatus="i" items="${mnlist }" end="${mnlist.size()-1 }" >
				<c:if test="${mnlist[i.index].CATE_NO eq 1 }">
					<tr>
						<td colspan="5">밥</td>
					</tr>
					<tr id="rice">
						<c:forEach var="mn" begin="0" step="1" items="${mnlist }">
							<td><button value="${mn.MENU }" onclick="goDetail();">${mn.MENU }</button></td>
						</c:forEach>
					</tr>
				</c:if><!-- 카테고리가 1일 때 if end -->
				
				<c:if test="${mnlist[i.index].CATE_NO eq 2 }">
					<tr>
						<td colspan="5">면</td>
					</tr>
					<tr id="rice">
						<c:forEach var="mn" begin="0" step="1" items="${mnlist }">
							<td><button value="${mn.MENU }" onclick="goDetail();">${mn.MENU }</button></td>
						</c:forEach>
					</tr>
				</c:if><!-- 카테고리가 2일 때 if end -->
				
				<c:if test="${mnlist[i.index].CATE_NO eq 3 }">
					<tr>
						<td colspan="5">주류/음료</td>
					</tr>
					<tr id="rice">
						<c:forEach var="mn" begin="0" step="1" items="${mnlist }">
							<td><button value="${mn.MENU }" onclick="goDetail();">${mn.MENU }</button></td>
						</c:forEach>
					</tr>
				</c:if><!-- 카테고리가 3일 때 if end -->
				
				<c:if test="${mnlist[i.index].CATE_NO eq 4 }">
					<tr>
						<td colspan="5">기타</td>
					</tr>
					<tr id="rice">
						<c:forEach var="mn" begin="0" step="1" items="${mnlist }">
							<td><button value="${mn.MENU }" onclick="goDetail();">${mn.MENU }</button></td>
						</c:forEach>
					</tr>
				</c:if><!-- 카테고리가 4일 때 if end -->
				
				
				
			</c:forEach>
				
		</table>

		
		<br><br>
		<!-- pagingArea -->
		<div id="pagingArea" align="center">
			<!-- '이전'버튼 -->
			<c:if test="${pi.currentPage ==1 }">
				이전&nbsp;
			</c:if>
	
			<c:if test="${pi.currentPage >1 }">
				<c:url var="mnlistBack" value="menuList.mn">
					<c:param name="currentPage" value="${pi.currentPage-1 }"/>
				</c:url>
				<a href="${mnlistBack }">이전</a>
			</c:if>
			
			<!-- '번호' 버튼 -->
			<c:forEach var="p" begin="${pi.startPage }" end="${pi.endPage }">
				<c:if test="${p eq pi.currentPage }">
					<font color="#A593E0" size="4"><b>[${p }]</b></font>
				</c:if>
				
				<c:if test="${p ne pi.currentPage }">
					<c:url var="mnlistCheck" value="menuList.mn">
						<c:param name="currentPage" value="${p }"/>
					</c:url>
					<a href="${mnlistCheck }">${p }</a>
				</c:if>
			</c:forEach>
		
			<!-- '이후' 버튼 -->
			<!-- 끝페이지 일때는 클릭이 되지 않겠금 -->
			<c:if test="${pi.currentPage == pi.maxPage }">
				&nbsp;이후
			</c:if>
			
			<!-- 마지막 페이지가 아닐경우 -->
			<c:if test="${pi.currentPage < pi.maxPage }">
				<c:url var="mnListEnd" value="menuList.mn">
					<c:param name="currentPage" value="${pi.currentPage +1 }"/>
				</c:url>
			</c:if>
		
		</div><!-- pageinArea end -->
		
		
	</div>
	
	
	<script>
		function menuInsert(){
			location.href="<%=request.getContextPath()%>/views/menu/menuInsert.jsp";
		}
	
	
		<%if(insertMsg != null){%>
			alert("<%=insertMsg%>");
		<%}%>
	
	
	
	</script>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>