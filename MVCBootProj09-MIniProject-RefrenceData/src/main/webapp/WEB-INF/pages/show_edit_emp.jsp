<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">

<frm:form modelAttribute="emp" >
<h2 class="text-center">Updation Form</h2>
<table class="table table-hover w-25 m-auto table-bordered bg-warning">
<tr>
<td>Employee No::</td>
<td><frm:input path="empno" readonly="true" class="form-control"/></td>
</tr>
<tr>
<td>Employee Name::</td>
<td><frm:input path="ename" class="form-control"/></td>
</tr>
<tr>
<td>Employee job::</td>
<td><frm:input path="job" class="form-control"/></td>
</tr>
<tr>
<td>Employee sal::</td>
<td><frm:input path="sal" class="form-control"/></td>
</tr>
<tr>
<td>Employee deptno::</td>
<td><frm:input path="deptno" class="form-control"/></td>
</tr>
<tr>
<td><input class="btn btn-success" type="submit" value="Update"/></td>
<td><input class="btn btn-success" type="reset" value="cancel"/></td>
</tr>
</table>
</frm:form>