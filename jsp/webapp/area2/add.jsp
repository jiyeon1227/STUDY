<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.util.ArrayList"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<%	
	request.setCharacterEncoding("utf-8");

	String productname = request.getParameter("product");

	ArrayList list = (ArrayList)session.getAttribute("productlist");// 세션에 저장된 값으로 다운캐스팅

	// 만일 null 인 경우 처음 데이터를 추가한 것이므로 새로운 ArrayList 생성
	if(list == null) {
		list = new ArrayList(); // 처음에는 arraylist 객체를 1번 생성해야함
	}

	// ArrayList 에 새로운 데이터 추가
	list.add(productname);
	session.setAttribute("productlist",list);// 세션 설정 -> 세션영역으로 공유하면 목록을 다른 페이지랑도 공유할 수 있음
	
	
	
%>

	<!-- 자바스크립트를 이용해 간단한 메시지 출력  -->
	<script>
		alert("<%=productname %> 이(가)추가 되었습니다.!!");
		history.go(-1);
	</script>
</body>
</html>