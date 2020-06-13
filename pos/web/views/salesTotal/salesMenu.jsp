<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>

</head>
<body>
  <!-- chart가 생성될 공간 -->
  <div id="bar_chart_div"></div>
</body>
 
<script>
google.charts.load('current', {'packages':['bar','corechart']});
 
    function schedulerSuccessAndFailChart() {
        var data = google.visualization.arrayToDataTable([
               [""
            	,"제육볶음", {role:'annotation'}
                , "순두부찌개", {role:'annotation'}
                , "된장찌개", {role:'annotation'}],
               ["이번 달 매출량"
                ,413, 413 
                ,24, 24
                ,130, 130] //앞에있는 숫자가 마우스 오버시 나타나는 데이터, 뒤에 있는 숫자가 화면 로드시 바로 보여지는 데이터 
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