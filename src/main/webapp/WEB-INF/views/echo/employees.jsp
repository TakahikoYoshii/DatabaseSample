<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page import="com.example.databaseSample.model.Employee"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Employees</title>
</head>
<body>
<h1>
	従業員一覧
</h1>

	<table border="1">
		<tr>
			<th>番号</th>
			<th>名前</th>
			<th>身長</th>
			<th>体重</th>
			<th>E-mailアドレス</th>
			<th>入社年</th>
			<th>血液型</th>
			<th>誕生日</th>
		</tr>
		<c:forEach items="${employeeList}" var="employee">
			<tr>
				<td><c:out value="${employee.employeeid}" /></td>
				<td><c:out value="${employee.employeename}" /></td>
				<td><c:out value="${employee.height}" /></td>
				<td><c:out value="${employee.weight}" /></td>
				<td><c:out value="${employee.email}" /></td>
				<td><c:out value="${employee.hirefiscalyear}" /></td>
				<td><c:out value="${employee.bloodtype}" /></td>
				<td><c:out value="${employee.birthday}" /></td>
			</tr>
		</c:forEach>
	</table>
	<form:form action="${pageContext.request.contextPath}/echo/">
	<button type="submit">戻る</button>
	</form:form>
</body>
</html>