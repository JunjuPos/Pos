<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List,salesTotal.model.vo.*, menu.model.vo.Menu"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	List<SalesTotalMenu> salestotalMenuList = (List<SalesTotalMenu>)request.getAttribute("menuCountList");
	List<Menu> menuList = (List<Menu>)request.getAttribute("menu");
	System.out.println(salestotalMenuList);
	System.out.println(menuList);

%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
<style>
	#bar_chart_div{width:80%; margin:0 auto;  margin-top:100px; margin-left:130px;}
	.sales{display:inline-block;}
	#subMenu{margin:0 auto; text-align:center;}
	#salesMenu{text-style:bold; color:#E0E3DA;}
	.sales:hover{color:#A593E0;}
	.sales{display:inline-block;}
</style>
</head>
<body>
  <!-- chart가 생성될 공간 -->
<%@include file="/views/common/header.jsp"%> 
<%@include file="/views/common/menubar.jsp"%> 
  <div id="subMenu">
		<h1 id="salesTotal" class="sales">매출통계</h1>&nbsp;&nbsp;&nbsp;
		<h1 id="salesMenu" class="sales">메뉴통계</h1>
  </div>
  <div id="bar_chart_div"></div>
</body>
<script>

$(function(){
	$("#salesTotal").click(function(){
		location.href="${contextPath}/sales/cal";
	})

});
 </script>
<script>
google.charts.load('current', {'packages':['bar','corechart']});
 
    function schedulerSuccessAndFailChart() {
        var data = google.visualization.arrayToDataTable([
        		["",
        	       	   <%for(Menu m : menuList){
 	         				String menu = m.getMENU();
          	         	%>
	         	
        		 			"<%=menu%>" , {role:'annotation'},
        		<%}%>
        		 	
                ],
               ["이번 달 매출량",
            	   <%for(Menu m : menuList){
   	         		String menu="";
   	         		int count=0;
   	         		int price=0;
	   	         		for(SalesTotalMenu stm : salestotalMenuList){
	   	         			if(m.getMENU().equals(stm.getSalesMenu())){
	   	         				menu = m.getMENU();
	   	    	         		count = stm.getSalesCount();
	   	    	         		price = stm.getSalesCountPrice();
	   	         				System.out.println("일치:"+menu+"-"+count);
	   	         			}else{
	   	         				menu=m.getMENU();
	   	         				count=0;
	   	         				price=0;
	   	         			}
	   	         		}
   	         		
   	         	%>
                	<%=price%>, <%=count%>,
              	<%}%>

                ] //앞에있는 숫자가 마우스 오버시 나타나는 데이터, 뒤에 있는 숫자가 화면 로드시 바로 보여지는 데이터 
        ]);
 
       var barChartOption = {
               bars: 'vertical',
               height :700,
               width :'100%',
               legend: { position: "top" },
               isStacked: false,
               tooltip:{textStyle : {fontSize:12}, showColorCode : true},
               animation: { //차트가 뿌려질때 실행될 애니메이션 효과
                 startup: true,
                 duration: 1000,
                 easing: 'linear' },
               annotations: {
                   textStyle: {
                     fontSize: 15,
                     bold: true,
                     italic: true,
                     color: '#871b47',
                     auraColor: '#d799ae',
                     opacity: 0.8
                   }
              }
        };
 
       var chart = new google.visualization.ColumnChart(document.getElementById('bar_chart_div'));
 
       chart.draw(data, barChartOption);
    }
 
    google.charts.setOnLoadCallback(schedulerSuccessAndFailChart);
 
 
 
</script>

</html>