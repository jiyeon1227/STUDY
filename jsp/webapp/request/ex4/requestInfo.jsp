<%@ page contentType = "text/html; charset=utf-8" %>

<html>
<head><title>클라이언트 및 서버 정보</title>
<meta charset="utf-8">
</head>
<body>

<!-- model1에서 많이 사용하니까 꼭 알아두기
void setCharacterEncoding(String env) : 한글 인코딩 처리
String getParameter(String name) : name에 해당하는 파라미터 값을 구함
String[] getParameterValues(String name) : checkbox 같이 여러 개의 파라미터 값을 구함
String getRemoteAddr() : client의 IP주소를 구함 
-->



클라이언트IP = <%= request.getRemoteAddr() %> <br><!-- // 브라우저에서 localhost 대신에 내 ip를 입력하면 내 ip조소가 찍힘 -->
요청정보길이 = <%= request.getContentLength() %> <br>
요청정보 인코딩 = <%= request.getCharacterEncoding() %> <br>
요청정보 컨텐트타입 = <%= request.getContentType() %> <br>
요청정보 프로토콜 = <%= request.getProtocol() %> <br>
요청정보 전송방식 = <%= request.getMethod() %> <br>
요청 URI = <%= request.getRequestURI() %> <br>
컨텍스트 경로 = <%= request.getContextPath() %> <br>
서버이름 = <%= request.getServerName() %> <br>
서버포트 = <%= request.getServerPort() %> <br>

</body>
</html>