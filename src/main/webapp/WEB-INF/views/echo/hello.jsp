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
	<p>
		Hello
		<c:out value="${name}" />
		!
	</p>

	<form:form action="${pageContext.request.contextPath}/echo/">
		<button type="submit">戻る</button>
	</form:form>

</body>
</html>