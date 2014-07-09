<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page import="com.example.databaseSample.model.Employee"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Employees</title>
</head>
<body>
<h1>
	顧客一覧
</h1>

	<table border="1">
		<tr>
			<th>顧客番号</th>
			<th>顧客コード</th>
			<th>顧客名</th>
			<th>住所</th>
			<th>顧客グループ</th>
			<th>都道府県番号</th>
		</tr>
		<c:forEach items="${customerList}" var="customer">
			<tr>
				<td><c:out value="${customer.customerid}" /></td>
				<td><c:out value="${customer.customercode}" /></td>
				<td><c:out value="${customer.customername}" /></td>
				<td><c:out value="${customer.address}" /></td>
				<td><c:out value="${customer.customerclassid}" /></td>
				<td><c:out value="${customer.prefecturalid}" /></td>
			</tr>
		</c:forEach>
	</table>
	<form:form action="${pageContext.request.contextPath}/echo/">
	<button type="submit">戻る</button>
	</form:form>
</body>
</html>