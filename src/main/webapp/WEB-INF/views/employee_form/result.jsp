<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page import="com.example.databaseSample.model.Employee"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Form Result</title>
</head>
<h1>従業員一覧</h1>
<c:forEach items="${employeeList}" var="employee">
結果：${fn:length(employeeList)}件です
<c:choose>
		<c:when test="${fn:length(employeeList) == 0}">
		</c:when>
		<c:otherwise>
			<table border="1">
				<tr>
					<th>番号</th>
					<th>名前</th>
				<tr>
					<td><c:out value="${employee.employeeid}" /></td>
					<td><c:out value="${employee.employeename}" /></td>
			</table>
			<form:form action="${pageContext.request.contextPath}/employee_form">
				<button type="submit">戻る</button>
			</form:form>
		</c:otherwise>
	</c:choose>
</c:forEach>
</body>
</html>