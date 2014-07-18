<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Echo Application</title>
</head>
<body>
	<h1>SQL page</h1>


	<form:form modelAttribute="echoForm"
		action="${pageContext.request.contextPath}/echo/result" method="post">
		<form:label path="sql">Please Enter SQLStatement :</form:label>
		<br />
		<textarea name="sql" cols="50" rows="10"></textarea>
<%-- 		<form:input path="sql" type="text" name="sql"></form:input>--%>
		<br />
		<form:errors path="sql" cssStyle="color:red" />
		<input type="submit" />
	</form:form>

	<br />
	<form:form modelAttribute="employeeList"
		action="${pageContext.request.contextPath}/echo/employees"
		method="post">
		<button type="submit" name="employee" value="従業員一覧参照">従業員一覧参照</button>
	</form:form>

	<form:form modelAttribute="customerList"
		action="${pageContext.request.contextPath}/echo/customers"
		method="post">
		<button type="submit" name="customer" value="顧客一覧参照">顧客一覧参照</button>
	</form:form>
</body>
</html>