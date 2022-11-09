<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>

<frm:form modelAttribute="emp">
<table align="center" bgcolor="cyan" border="1">
<tr>
<td>Employee No::</td>
<td><frm:input path="empno" readonly="true"/></td>
</tr>
<tr>
<td>Employee Name::</td>
<td><frm:input path="ename"/></td>
</tr>
<tr>
<td>Employee job::</td>
<td><frm:input path="job"/></td>
</tr>
<tr>
<td>Employee sal::</td>
<td><frm:input path="sal"/></td>
</tr>
<tr>
<td>Employee deptno::</td>
<td><frm:input path="deptno"/></td>
</tr>
<tr>
<td><input type="submit" value="Update"/></td>
<td><input type="reset" value="cancel"/></td>
</tr>
</table>
</frm:form>