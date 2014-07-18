<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.LinkedHashMap"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SQL Result</title>
</head>
<body>
	<h1>結果</h1>

	<table border="1">
		<tr>
			<%
				ArrayList<LinkedHashMap<String, String>> result = (ArrayList<LinkedHashMap<String, String>>) request.getAttribute("result");
			if(!result.isEmpty()){	
				for(String columnsName : result.get(0).keySet()){
				out.println("<th>"+columnsName+"</th>");
				}
			}
			%>
		</tr>
			<%
			for(int i = 0; i <result.size(); i++){
				LinkedHashMap<String, String> map = result.get(i);
				out.print("<tr>");
				for(String columnsName : result.get(0).keySet()){
				out.println("<td>"+map.get(columnsName)+"</td>");
				}
				out.print("</tr>");
			}
			%>
	</table>
	<form:form action="${pageContext.request.contextPath}/echo/">
		<button type="submit">戻る</button>
	</form:form>
</body>
</html>