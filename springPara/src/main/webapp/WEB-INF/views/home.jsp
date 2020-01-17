<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<p>requst를 통해 파라미터를 가져오는 방법 /request  </p>
<p>map를 통해 파라미터를 가져오는 방법 /map  </p>
<p>@RequestParam를 통해 파라미터를 가져오는 방법 /requestParam?a=1&b=2  </p>
<p>모델 클래스를 통해 파라미터를 가져오는 방법 /model  </p>
<p>pathVariable를 통해 파라미터를 가져오는 방법 /path/1/2  </p>

</body>
</html>
