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
	<form:form modelAttribute="echoForm" action="${pageContext.request.contextPath}/echo/hello">
		<form:label path="name">Input Your Name:</form:label>
		<form:input path="name" />
		<form:errors path="name" cssStyle="color:red" />
		<input type="submit" />
	</form:form>
</body>
</html>