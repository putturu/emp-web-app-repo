
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>List of Employees</h1>
	
	<table border="1">
	    <tr><th>Empno</th><th>Ename</th><th>Job</th><th>Mgr</th><th>Hiredate</th><th>Salary</th>
	    					<th>Commission</th><th>Deptno</th></tr>
		<c:forEach var="e" items="${employeeList}">
			<tr><td>${e.empno}</td><td>${e.ename }</td><td>${e.job}</td><td>${e.mgr }</td>
				<td>${e.hiredate }</td><td>${e.sal }</td><td>${e.comm }</td>
				<td>${e.deptno}</td> </tr>
		</c:forEach>	
	
	</table>
</body>
</html>

