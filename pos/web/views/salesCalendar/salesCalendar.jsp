<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>매출통계</title>
<!-- request.getContextPath대신 ${contextPath}로 하니까 실행이 안되는 이유? -->
<link href='<%=request.getContextPath() %>/css/core_main.css' rel='stylesheet'/>
<link href='<%=request.getContextPath() %>/css/daygrid_main.css' rel='stylesheet'/>
<script src='<%=request.getContextPath() %>/js/core_main.js'></script>
<script src='<%=request.getContextPath() %>/js/inter_main.js'></script>
<script src='<%=request.getContextPath() %>/js/daygrid_main.js'></script>
</head>
<body>

<script>
	//'DOM' : 동일한 문서를 표현하고 저장하고 조작하는 방법
	//'DOMContentLoaded' : 초기 HTML 문서를 완전히 불러오고 분석했을 때 발생(스타일시트, 이미지, 하위프레임 로딩은 기다리지 않음)
	//					   'load' 보다 빨리 실행된다. 문서의 로드 시점 관련
	
	document.addEventListener('DOMContentLoaded', function() {
	  var calendarEl = document.getElementById('calendar');

	  var calendar = new FullCalendar.Calendar(calendarEl, {
	    plugins: [ 'interaction','dayGrid' ],	//월 캘린더
	  	dateClick : function(info){
//	  		alert("내가 클릭한 날짜는 "+info.dateStr);   
			var clickDate = info.dateStr;
			
			$.ajax({
				url:"${contextPath}/sales.cal",
				type:"post",
				data:{clickDate:clickDate},
				success:function(data){
					
				},
				error:function(data){
					alert("ajax failed");
				}
			})
	  	}
	  });
	  
	  
	  calendar.render();
	});
</script>
</body>
<div id="calendar"></div>

</html>