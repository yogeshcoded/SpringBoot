<%@ page isELIgnored="false" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:if test="${!empty empinfo}">

<table border="2" style="text-align: center; background-color: cyan" align="center">
<tr>
<td>Emp ID</td>
<td>${empinfo.eid}</td>
</tr>
<tr>
<td>Emp name</td>
<td>${empinfo.ename }</td>
</tr>
<tr>
<td>Emp addrs</td>
<td>${empinfo.addrs }</td>
</tr>
<tr>
<td>Emp job</td>
<td>${empinfo.job}</td>
</tr>
<tr>
<td>status</td>
<td>${empinfo.isVaccinated}</td>
</tr>
</table>
</c:if>
