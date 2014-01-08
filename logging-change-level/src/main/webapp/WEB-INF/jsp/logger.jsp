<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logger</title>
</head>
<body>
	<c:forEach items="${loggers}" var="l">
		<dl>
			<dt>${l.name}
			<dt>
			<dd>${l.level}</dd>
		</dl>
	</c:forEach>
</body>
</html>