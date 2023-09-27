<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 스클립틀릿 태그 (Scriptlet Tag) => 변수 선언 -->
<% 
	// 기본 자료형 변수
	int i = 30;
	double d = 3.14;
	char c1 = 'A';
	char c2 = '자';
	boolean b1 = true;
	boolean b2 = false;

	// 참조형변수 (클래스, 배열, 인터페이스)
	// 1. 클래스
	String str1 = "jsp";
	String str2 = new String("jsp");

	// 2. 배열
	String[] str = {"자바","JSP","oracle","웹표준","파이썬"};

	// for문 사용
	for(int j=0; j<str.length; j++){
		out.println(str[j]+"\t");// out은 jsp내장 객체 -> 브라우저에 출력 (println은 줄바꿈 기능이 없음)
	}
	out.print("<br>");

	// 향상된 for문 사용
	for(String s : str){%> <%-- 스클립틀릿태그안에 표형식태그를 중첩으로 사용 불가능해서 태그를 열고 닫고 해줘야함 --%>
		<%= s %><br>
<%	}

	// 3. 인터페이스 : List (자식구현 클래스 필요함 -> 대표클래스:arraylist
	// List, ArrayList클래스를 임포트해서 사용해야함
	List list = new ArrayList();// 업캐스팅
	list.add(50);
	list.add(42.195);
	list.add('A');
	list.add(true);
	list.add("JSP");
	
	for(int j=0; j<list.size(); j++){// size()중요 !!
		out.print(list.get(j) + "\t");
	}
	out.print("<br>");

%>

<!-- 표현식 태그(Expression Tag) => 변수값을출력 -->
<!-- JSP model1 출력방법 2가지 (표현식태그, out객체 사용) -->
<br>[기본 자료형 변수 출력]<br>
출력 : <%="에스파는 나야 둘이 될수없어" %><br> <!-- // 자바문법을 따르기 때문에 문자열은 반드시 ""에 저장해야함 -->
연산결과 : <%=1+2+3+4+5+6+7+8+9+10%><br>
i = <%=i %><br>
d = <%=d %><br>
c1 = <%=c1 %><br>
c2 = <%=c2 %><br>
b1 = <%=b1 %><br>
b2 = <%=b2 %><br>

<br>[참조형 자료형 변수 출력]<br>
str1 = <%=str1 %><br>
str2 = <%=str2 %><br>