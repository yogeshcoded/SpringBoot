<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">

<frm:form modelAttribute="emp" >
<h1 class="text-center">Employee Registration Form</h1>
<table class="table table-hover w-25 m-auto table-bordered bg-info">
<tr >
<td>Employee Name::</td>
<td><frm:input  path="ename" class="form-control"/></td>
</tr>
<tr>
<td>Employee Job::</td>
<td><frm:input path="job" class="form-control"/></td>
</tr>
<tr>
<td>Employee Salary::</td>
<td><frm:input path="sal" class="form-control"/></td>
</tr>
<tr>
<td>Employee DeptNo::</td>
<td><frm:select path="deptno" class="form-select">
<frm:options items="${deptNoInfo }"/>
</frm:select></td>
</tr>
<tr>
<td><input class="btn btn-danger" type="submit" value="Submit"/></td>
<td><input class="btn btn-danger" type="reset" value="cancel"/></td>
</tr>
</table>
</frm:form>