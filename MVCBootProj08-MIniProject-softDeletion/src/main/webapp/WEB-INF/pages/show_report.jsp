<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:choose>
	<c:when test="${!empty empsList}">
		<h1 style="color: red; text-align: center;">Employee Report</h1>
		<table align="center" bgcolor="cyan" border="1">
			<tr style="color: red; text-align: center;">
				<th>EMPNO</th>
				<th>ENAME</th>
				<th>JOB</th>
				<th>SALARY</th>
				<th>DEPTNO</th>
				<th>STATUS</th>
				<th>ACTIONS</th>
			</tr>
		
		<c:forEach var="emp" items="${empsList }">
		<tr style="text-align: center;">
		<td>${emp.empno}</td>
		<td>${emp.ename}</td>
		<td>${emp.job}</td>
		<td>${emp.sal}</td>
		<td>${emp.deptno}</td>
		<td>${emp.status}</td>
		<td><a href="emp_edit?no=${emp.empno}"><img src="images/edit.jpg" width="30px" height="30px"></a>
		<a href="emp_delete?eno=${emp.empno}" onclick="return confirm('are you sure to delete emp')"><img src="images/delete.jpg" width="30px" height="30px"></a>
		</td>
		</tr>
		</c:forEach>
	
		</table>
	</c:when>
	<c:otherwise>
		<h1 style="color: red; text-align: center;">Employee Not Found</h1>
	</c:otherwise>
</c:choose>
<h2 style="color: green; text-align: center;">${result}</h2>
<center><br>
<a href="emp_add"><img alt="not load" src="images/add.jpg" width="30px" height="30px">Add Employee</a> &nbsp;&nbsp;&nbsp;
<a href="./"><img alt="not load" src="images/home.jpg" width="40px" height="40px">Home</a>
</center>