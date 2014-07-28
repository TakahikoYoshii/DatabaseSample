<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Form</title>
</head>
<body>

	<p>■入力フォーム</p>

	<form:form modelAttribute="bloodType_birthYear" action="${pageContext.request.contextPath}/eemployee_form/" method="post">

		血液型：
		<form:input path="bloodType" type="text" size="40" />
		<form:errors path="bloodType" cssStyle="color:red" />
		<form:errors path="isBloodtype" cssStyle="color:red" />
		<br />
		を：
		<form:radiobutton path="isBloodtype" value="true" />
		含む
		<form:radiobutton path="isBloodtype" value="false" />
		含まない
		<br />
		※カンマ区切りで複数指定可 
		<br /> 
		<br />
		誕生日（西暦）： 
		<form:errors path="birth_year_from" cssStyle="color:red" />
		<form:errors path="birth_year_to" cssStyle="color:red" />
		<form:errors path="where_birth_year" cssStyle="color:red" />
		<form:input type="text" path="birth_year_from" size="40" /> ～ <form:input type="text" path="birth_year_to" size="40" />
		<br /> 
		を： 
		<form:radiobutton path="where_birth_year" value="true" />含む
		<form:radiobutton path="where_birth_year" value="false" />含まない 
		<br />
		
		<br />
		<input type="submit" value="送信"><input type="reset" value="リセット">

	</form:form>

</body>

</html>