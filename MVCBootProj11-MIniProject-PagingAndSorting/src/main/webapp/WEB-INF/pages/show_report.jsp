<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
<div class="container-fluid">
<c:choose>
	<c:when test="${!empty empsData.getContent()}">
		<h1 style="color: red; text-align: center;">Employee Report</h1>
		<table class="table table-hover w-50 m-auto table-bordered">
			<tr class="table-primary ">
				<th>EMPNO</th>
				<th>ENAME</th>
				<th>JOB</th>
				<th>SALARY</th>
				<th>DEPTNO</th>
				<th>STATUS</th>
				<th>ACTIONS</th>
			</tr>
		
		<c:forEach var="emp" items="${empsData.getContent()}">
		<tr class="table-success" >
		<td>${emp.empno}</td>
		<td>${emp.ename}</td>
		<td>${emp.job}</td>
		<td>${emp.sal}</td>
		<td>${emp.deptno}</td>
		<td>${emp.status}</td>
		<td><a href="emp_edit?no=${emp.empno}"><i class="bi bi-pencil-fill"></i></a> &nbsp;&nbsp;
		<a href="emp_delete?eno=${emp.empno}" onclick="return confirm('are you sure to delete emp')"><i class="bi bi-trash-fill"></i></a>
		</td>
		</tr>
		</c:forEach>
	
		</table>
		<!-- PAGING AND SORTING LOGIC -->
		<p class="text-center">
		
		<!-- PREVIOUS PAGE -->
		<c:if test="${empsData.hasPrevious()}">
		<a  href="report?page=${empsData.getPageable().getPageNumber()-1}">previous</a>&nbsp;&nbsp;
		</c:if>
		
		<!-- FIRST PAGE -->
		<c:if test="${!empsData.isFirst()}">
		<a  href="report?page=0">first</a>&nbsp;&nbsp;
		</c:if>
		
	<!-- 	GET ALL PAGE NUMBERS -->
		<c:forEach var="i" begin="1" end="${empsData.getTotalPages()}" step="1">  
		<a  href="report?page=${i-1}">${i}</a>&nbsp;&nbsp;
		</c:forEach>
		
			<!-- LAST PAGE -->
		<c:if test="${!empsData.isLast()}">
		<a  href="report?page=${empsData.getTotalPages()-1 }">last</a>&nbsp;&nbsp;
		</c:if>
		
			<!-- NEXT PAGE -->
		<c:if test="${empsData.hasNext()}">
		<a  href="report?page=${empsData.getPageable().getPageNumber()+1}">next</a>&nbsp;&nbsp;
		</c:if>
		</p>
		
	</c:when>
	<c:otherwise>
		<h1 style="color: red; text-align: center;">Employee Not Found</h1>
	</c:otherwise>
</c:choose>
<h2 style="color: green; text-align: center;">${result}</h2>
<a class="btn btn-success" href="emp_add">Add Employee</a>
<a class="btn btn-primary" href="./">Home</a>
<a class="btn btn-warning" onclick="window.print()">Print</a>
<!-- <a class="text-decoration-none" href="emp_add"><img alt="not load" src="images/add.jpg" width="30px" height="30px">Add Employee</a> <br>
<a class="btn btn-primary" href="./"><img alt="not load" src="images/home.jpg" width="40px" height="40px">Home</a> -->

</div>