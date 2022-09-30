<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ include file="/WEB-INF/Top&Bottom/top.jsp" %>


<style>
	.card{
		width:600px;
		margin: auto;
	}
	.card-header{
		width:400px;
		margin: auto;
	}
	.form-select{
		width: fit-content;
		block-size: fit-content;
		display: inline-block;
	}
	.form-control{
		width: fit-content;
		block-size: fit-content;
		display: inline-block;
	}
	a{
		text-decoration: none;
	}
	.text-white{
		text-align:center;
		width: 120px;
		height:50px;
		padding-top: 10px;
	}
	td{
		padding-left: 20px;
		padding-bottom: 10px;
	}
</style>


 <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">
	function remove(){
		if(confirm("정말로 삭제하시겠습니까?")){
			location.href="admin_delete.th?t_num=${tb.t_num }&pageNumber=${pageNumber}";			
		}else{
			return false;
		}
	}

      google.charts.load('current', {'packages':['corechart', 'bar']});
      google.charts.setOnLoadCallback(drawStuff);

      function drawStuff() {

        var button = document.getElementById('change-chart');
        var chartDiv = document.getElementById('chart_div');

        var data = google.visualization.arrayToDataTable([
          ['Year', 'Last Year', 'This Year'],
          ['2018', 8000, 15.3],
          ['2019', 24000, 20],
          ['2020', 30000, 4],
          ['2021', 40000, 5],
          ['2022', 50000, 13.1]
        ]);

        var materialOptions = {
          width: 570,
          chart: {
            title: 'Boda Sales',
            subtitle: 'Last Year on the left, This Year on the right'
          },
          series: {
            0: { axis: 'distance' }, // Bind series 0 to an axis named 'distance'.
            1: { axis: 'brightness' } // Bind series 1 to an axis named 'brightness'.
          },
          axes: {
            y: {
              distance: {label: 'Sales'}, // Left y-axis.
              brightness: {side: 'right', label: 'Boda Sales Graph'} // Right y-axis.
            }
          }
        };

        var classicOptions = {
          width: 570,
          series: {
            0: {targetAxisIndex: 0},
            1: {targetAxisIndex: 1}
          },
          title: 'Nearby galaxies - distance on the left, brightness on the right',
          vAxes: {
            // Adds titles to each axis.
            0: {title: 'parsecs'},
            1: {title: 'apparent magnitude'}
          }
        };

        function drawMaterialChart() {
          var materialChart = new google.charts.Bar(chartDiv);
          materialChart.draw(data, google.charts.Bar.convertOptions(materialOptions));
          button.innerText = 'Change to Classic';
          button.onclick = drawClassicChart;
        }

        function drawClassicChart() {
          var classicChart = new google.visualization.ColumnChart(chartDiv);
          classicChart.draw(data, classicOptions);
          button.innerText = 'Change to Material';
          button.onclick = drawMaterialChart;
        }

        drawMaterialChart();
    };
    </script>

<%
ServletContext context =  config.getServletContext();
String path = context.getContextPath()+"/resources/극장 이미지/";
%>
<div class="container">
      <div class="page-header" id="banner">
        <div class="row">
          <div class="col-lg-8 col-md-7 col-sm-6">
           <img class="logo" src="<%=request.getContextPath() %>/resources/logo_image/영화관 상세보기.png" style="margin-left:40%;width:450px; height:110px"><br>
          </div>
        </div>
      </div>
</div>
<form>
	<table class="card mb-3">
		<tr>
			<th colspan="2" scope="row" class="card text-white bg-primary mb-3">매출현황</th>
		</tr>
		<tr>
			<td colspan="2">
			  
	    		<div id="chart_div" style="width: 600px; height: 300px;"></div>
			</td>
		</tr>
	
		<tr>
			<th scope="row" class="card text-white bg-primary mb-3">번호</th>
			<td>${tb.t_num }</td>
		</tr>
		<tr>
			<th scope="row"  class="card text-white bg-primary mb-3">코드</th>
			<td>${tb.t_code}</td>
		</tr>
		<tr>
			<th scope="row" class="card text-white bg-primary mb-3">설립일</th>
			<td>
			<fmt:parseDate var="tday" value="${tb.t_day}" pattern="yyyy-MM-dd"/>
			<fmt:formatDate value="${tday}" var="day" pattern="yyyy-MM-dd"/>
			${day }
			</td>
		</tr>
		<tr>
			<th scope="row" class="card text-white bg-primary mb-3">지역</th>
			<td>${tb.t_region }</td>
		</tr>
		<tr>
			<th scope="row" class="card text-white bg-primary mb-3">주소</th>
			<td>${tb.t_gu }&nbsp;${tb.t_address }</td>
		</tr>
		<tr>
			<th scope="row" class="card text-white bg-primary mb-3">위치</th>
			<td>${tb.t_location }</td>
		</tr>
		<tr>
			<th scope="row" class="card text-white bg-primary mb-3">영화관</th>
			<td>${tb.t_theater }</td>
		</tr>
		<tr>
			<th scope="row" class="card text-white bg-primary mb-3">이미지</th>
			<td><img src="<%=path %>${tb.t_img }" width="400" height="200"></th>
		</tr>
		<tr>
			<th scope="row" class="card text-white bg-primary mb-3">전화번호</th>
			<td>${tb.t_tel }</td>
		</tr>
		<tr>
			<th scope="row" class="card text-white bg-primary mb-3">주차 가능 여부</th>
			<td>${tb.t_parking }</td>
		</tr>
		<tr>
			<th scope="row" class="card text-white bg-primary mb-3">상영관</th>
			<td>${tb.t_name } 관</td>
		</tr>
		<tr>
			<th scope="row" class="card text-white bg-primary mb-3">좌석 수</th>
			<td>${tb.t_seat } 석</td>
		</tr>
		<tr>
			<th scope="row" class="card text-white bg-primary mb-3">상영종류</th>
			<td>${tb.t_premium }</td>
		</tr>
		
	</table>
	<br>
	<center>
				<input type="button"  class="btn btn-outline-primary" value="목록보기" onclick="location.href='admin_list.th?pageNumber=${pageNumber}'">
				<input type="button"  class="btn btn-outline-primary" value="수정하기" onclick="location.href='a_update.th?t_num=${tb.t_num }&pageNumber=${pageNumber}'">
				<input type="button"  class="btn btn-primary"value="삭제하기" onclick="return remove()">
	</center>
</form>

    <%@ include file="/WEB-INF/Top&Bottom/bottom.jsp" %>