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
	<table>
		<thead></thead>
		<tbody>
			<c:forEach items="${loggers}" var="l">
				<tr>
					<td>${l.name}</td>
					<td>
						<form action="loggers" method="post">
							<input name="logger" type="hidden" value="${l.name}" /> <select
								name="level">
								<option value="" label="select" disabled="disabled">
									<c:forEach items="${levels}" var="level">
										<c:if test="${l.level == level}">
											<option value="${level}" label="${level}" selected='selected' />
										</c:if>
										<c:if test="${l.level != level}">
											<option value="${level}" label="${level}" />
										</c:if>
									</c:forEach>
							</select>
							<button type="submit">Submit</button>
						</form>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>