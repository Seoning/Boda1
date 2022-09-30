<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="/WEB-INF/common/common.jsp" %>

  <head>
    <meta charset="utf-8">
    <title>Boda 영화예매하기</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Global Site Tag (gtag.js) - Google Analytics -->
    <script async src="https://www.googletagmanager.com/gtag/js?id=UA-23019901-1"></script>
    <script>
      window.dataLayer = window.dataLayer || [];
      function gtag(){dataLayer.push(arguments);}
      gtag('js', new Date());

      gtag('config', 'UA-23019901-1');
    </script>
  </head>
  
  <body>
    <div class="navbar navbar-expand-lg fixed-top navbar-light bg-light">
      <div class="container">
        <a href="movie.look"><img src="<%=request.getContextPath() %>/resources/logo_image/logo_image_1.jpg" style="width:80px; height:40px"></a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav">
          
          <!-- 관리자네비게이션 -->
			<c:if test="${loginInfo.id eq 'admin' }">
			 <li class="nav-item dropdown">
             <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="selectMovie.look" id="download">영화</a>
              <div class="dropdown-menu" aria-labelledby="download">
                <a class="dropdown-item" rel="noopener"   href="selectMovie.look">영화목록</a>
                <a class="dropdown-item" rel="noopener"   href="insertMovie.look">영화추가</a>
                <a class="dropdown-item" rel="noopener"   href="selectIndeMovie.look">독립영화리스트</a>
                <a class="dropdown-item" rel="noopener"   href="insertIndeMovie.look">독립영화추가</a>
              </div>
            </li>
            <li class="nav-item dropdown">
             <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" id="download">극장</a>
             <div class="dropdown-menu" aria-labelledby="download">
                <a class="dropdown-item" rel="noopener"   href="admin_list.th">영화관 리스트</a>
            	 <a class="dropdown-item" rel="noopener"   href="insert.th">영화관 등록</a>
                <a class="dropdown-item" rel="noopener"   href="timeList.th">상영시간표 리스트</a>
                <a class="dropdown-item" rel="noopener"   href="timetableInsert.th">상영시간표 등록</a>
            </div>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="timeList.th">상영시간표</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="admin_bookList.bk">예매</a>
            </li>
             <li class="nav-item dropdown">
               <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" id="download">스토어</a>
              <div class="dropdown-menu" aria-labelledby="download">
                <a class="dropdown-item" rel="noopener"   href="store_ticket.st">영화관람권</a>
                <a class="dropdown-item" rel="noopener"   href="store_popcorn.st">팝콘</a>
                <a class="dropdown-item" rel="noopener"   href="store_beverage.st">음료</a>
                <a class="dropdown-item" rel="noopener"   href="store_snak.st">간식</a>
                <a class="dropdown-item" rel="noopener"   href="store_admin_upload.ad">상품 등록</a>
                <a class="dropdown-item" rel="noopener"   href="store_paylist.st">결제 내역</a>
              </div>
            </li>
             <li class="nav-item dropdown">
	              <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" id="download">이벤트</a>
	              <div class="dropdown-menu" aria-labelledby="download">
	                <a class="dropdown-item" rel="noopener" href="event.et">이벤트 목록</a>
	                <a class="dropdown-item" rel="noopener" href="event_upload_form.et">이벤트 등록</a>
	              </div>
	            </li>
          	</c:if>
          <!-- 사용자네비게이션 -->
          <c:if test="${loginInfo.id ne 'admin' }">
           <li class="nav-item dropdown">
             <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="movie.look" id="download">영화</a>
              <div class="dropdown-menu" aria-labelledby="download">
               <a class="dropdown-item" rel="noopener" href="movie.look">박스오피스</a>
                <a class="dropdown-item" rel="noopener" href="indeMovieList.look">Boda 독립영화관</a>
                <a class="dropdown-item" rel="noopener" href="movie_reopening.look">Boda 재상영관</a>
                <a class="dropdown-item" rel="noopener" href="movie_comingsoon.look">상영예정작</a>
                <a class="dropdown-item" rel="noopener" href="movie_end.look">종영작</a>
              </div>
            </li>
           <li class="nav-item dropdown">
             <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="list.th" id="download">극장</a>
              <div class="dropdown-menu" aria-labelledby="download">
                <a class="dropdown-item" rel="noopener"   href="list.th">극장</a>
                <a class="dropdown-item" rel="noopener"   href="c_Cinema_Info.th">Boda 특별관</a>
              </div>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="booking.bk">빠른예매</a>
            </li>
             <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" id="download">스토어</a>
              <div class="dropdown-menu" aria-labelledby="download">
                <a class="dropdown-item" rel="noopener"   href="store_ticket.st">영화관람권</a>
                <a class="dropdown-item" rel="noopener"   href="store_popcorn.st">팝콘</a>
                <a class="dropdown-item" rel="noopener"   href="store_beverage.st">음료</a>
                <a class="dropdown-item" rel="noopener"   href="store_snak.st">간식</a>
                <a class="dropdown-item" rel="noopener"   href="store_cartlist.st">장바구니</a>
              </div>
            </li>
            <li class="nav-item">
		       <a class="nav-link" href="event.et">이벤트</a>
		     </li>
          </c:if>
          
          </ul>
          <ul class="navbar-nav ms-md-auto">
          	<c:if test="${loginInfo.id eq null }">
            <li class="nav-item">
              <a   rel="noopener" class="nav-link" href="login.bd"><i class="bi bi-github"></i> 로그인</a>
            </li>
            </c:if>
            <c:if test="${loginInfo.id ne null }">
            <li class="nav-item">
            	<a   rel="noopener" class="nav-link">${loginInfo.name}님 반갑습니다!</a>
            </li>
            <c:if test="${loginInfo.id eq 'admin' }">
		            <li class="nav-item">
		              <a   rel="noopener" class="nav-link" href="member_admin.ad"><i class="bi bi-github"></i>회원 관리</a>
		            </li>
	        </c:if>
	         <c:if test="${loginInfo.id ne 'admin' }">
	        <li class="nav-item">
	        <a rel="noopener" class="nav-link" href="myBodapage.bd"><i class="bi bi-github"></i> 마이페이지</a>
	        </li>
	        </c:if>
            <li class="nav-item">
              <a   rel="noopener" class="nav-link" href="logout.bd"><i class="bi bi-github"></i> 로그아웃</a>
            </li>
            </c:if>
           <li class="nav-item dropdown">
             <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="movie.look" id="download">고객센터</a>
              <div class="dropdown-menu" aria-labelledby="download">
                <a class="dropdown-item" rel="noopener" href="list.board">문의게시판</a>
                	<c:if test="${loginInfo.id != 'admin' }">
                <a class="dropdown-item" rel="noopener" href="askList.ask">자주찾는질문</a>
                </c:if>
                	<c:if test="${loginInfo.id == 'admin' }">
               	 <a class="dropdown-item" rel="noopener" href="selectAsk.ask">자주찾는질문 관리</a>
                </c:if>
              </div>
            </li>
          </ul>
        </div>
      </div>
    </div>