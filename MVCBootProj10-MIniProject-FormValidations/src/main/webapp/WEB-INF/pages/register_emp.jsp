<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script language="JavaScript" src="js/validation.js" ></script>


<frm:form modelAttribute="emp" onsubmit="return doValidations(this)">

<h1 class="text-center">Employee Registration Form</h1>
<table class="table table-hover w-25 m-auto table-bordered ">
<tr >
<td>Employee Name::</td>
<td><frm:input  path="ename" class="form-control"  /><frm:errors path="ename"  class="text-danger"/><span class="text-danger" id="nameErr"></span></td>
</tr> 
<tr>
<td>Employee Job::</td>
<td><frm:input path="job" class="form-control" /><frm:errors path="job" class="text-danger" /><span class="text-danger" id="jobErr"></span></td>
</tr>
<tr>
<td>Employee Salary::</td>
<td><frm:input path="sal" class="form-control" /><frm:errors path="sal" class="text-danger"/><span class="text-danger" id="salErr"></span></td>
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
<frm:hidden path="active"/>
</frm:form>