<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList, menu.model.vo.Menu"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<title>메뉴 리스트 페이지</title>
<style>
	#menuListArea{width:80%; margin-left:100px;}
	#menuListArea p{color:#E0E3DA; font-size:30px;}
	
	#category{width:100%; border:0px;}
	#category td button{width:400px; font-size:30px;}
	
	#menuListArea button{margin: 0px; width:200px; height:100px; font-size:25px; font-weight:600; color:#black; background-color:#E0E3DA; border-radius:20px; }
	#menuListArea button:hover{background-color:#A593E0; color:#fffff3;}

	#menuListArea>#btnArea{text-align:center;margin:0 auto; width:30%; top:800px; left:580px;}
	#menuListArea>#btnArea>button{width:60%; height:50px; border-radius:10px; font-size:28px; font-weight:600;}
	#btnArea button:hover{background-color:#A593E0; color:#fffff3;}

	#content{display:none; width:100%; height:500px; background-color:#E0E3DA; border-radius:10px;}
	
	#content_table{padding-left:50px; padding-top:15px;}
    #content_table td{display:inline-block;}
	
</style>

</head>
<body>
< 	<%@ include file="/views/common/header.jsp" %>
	<%@ include file="/views/common/menubar.jsp" %> 
 
	<div id="menuListArea">
		<h1 align="center">메뉴관리</h1>
		<br>
		
		<div id="btnArea">
				<button type="button" id="memberInsert" onclick="menuInsert();">신 메뉴 등록하기</button>
		</div>
		
		
		<br><br><br>
		<table id="category">
			<tr>
				<td><button type="button" id="rice" class="cate" value="1">밥</button></td>
				<td><button type="button" id="noodle" class="cate" value="2">면</button></td>
				<td><button type="button" id="drinks" class="cate" value="3">주류/음료</button></td>
				<td><button type="button" id="etc" class="cate" value="4">기타</button></td>
			</tr>
		</table>
		
		
		<div id="content">
			<table id="content_table">
				<tr>
					<td><button type="button" class="btn" onclick="location.href='#'"></button></td>
				</tr>
			</table>
		</div>
		
	</div> 
	
	<script>
		function menuInsert(){
			location.href="<%=request.getContextPath()%>/views/menu/menuInsert.jsp";
		}
	
		<%-- <%if(insertMsg != null){%>
			alert("<%=insertMsg%>");
		<%}%> --%>
		
		
	
		
		$(function(){
			// 클릭 시 값 불러오는 에잇
			$(".cate").click(function(){
				
				/* if($(this).val() == "rice"){
					$("#rice").css("background", "#A593E0");
					$("#noodle").css("background", "#E0E3DA");
					$("#drinks").css("background", "#E0E3DA");
					$("#etc").css("background", "#E0E3DA");
					
				}else if($(this).val() == "noodle"){
					$("#rice").css("background", "#E0E3DA");
					$("#noodle").css("background", "#A593E0");
					$("#drinks").css("background", "#E0E3DA");
					$("#etc").css("background", "#E0E3DA");
					
				}else if($(this).val() == "drinks"){
					$("#rice").css("background", "#E0E3DA");
					$("#noodle").css("background", "#E0E3DA");
					$("#drinks").css("background", "#A593E0");
					$("#etc").css("background", "#E0E3DA");
					
				}else if($(this).val() == "etc"){
					$("#rice").css("background", "#E0E3DA");
					$("#noodle").css("background", "#E0E3DA");
					$("#drinks").css("background", "#E0E3DA");
					$("#etc").css("background", "#A593E0");
				} */
				
				$("#content").css("display","block");
				
				var option = $(this).val();
				console.log(option);
			     $.ajax({
					url:"<%=request.getContextPath()%>/menuList.mn",
					type:"post",
					data:{option:option},
					success:function(data){
						$contentTable = $("#content_table");
						$contentTable.html("");

						var $tr = $("<tr>");
						
						for(var key in data){
							var $td = $("<td>");
							var $menu = $("<button>").text(data[key].MENU);
							
							$td.append($menu);
							$tr.append($td);
							$contentTable.append($tr);	
						}
						
					},
					error:function(request,status,error){
						alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
					}
					
				})  
			}) 
		})
	</script>
	
	
<script>
	
</script>
</body>
</html>