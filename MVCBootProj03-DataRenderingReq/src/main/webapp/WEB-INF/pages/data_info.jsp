<%@ page isELIgnored="false" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:choose>
<c:when test="${!empty eList }">
<table align="center" border="2" bgcolor="cyan">
<tr><th>EMP NO</th><th>EMP NAME</th><th>ADDRS</th><th>JOB</th><th>SAL</th><th>STATUS</th></tr>
<c:forEach  var="emp" items="${eList }">
<tr>
<td>${emp.eid}</td>
<td>${emp.ename }</td>
<td>${emp.addrs }</td>
<td>${emp.job}</td>
<td>${emp.salary}</td>
<td>${emp.isVaccinated}</td>
</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise>
<h2>emp no found</h2>
</c:otherwise>
</c:choose>
