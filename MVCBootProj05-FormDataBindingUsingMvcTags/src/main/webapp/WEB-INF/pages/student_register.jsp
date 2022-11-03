<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>

<frm:form action="register" method="post" modelAttribute="stud">
<h2 align="center" style="color:blue">Student Registration Form</h2>
<table align="center" bgcolor="cyan" border="2">
<tr>
<td>Student ID</td>
<td><frm:input path="sno"/></td>
</tr>
<tr>
<td>Name</td>
<td><frm:input path="sname"/></td>
</tr>
<tr>
<td>Address</td>
<td><frm:input path="addrs"/></td>
</tr>
<tr>
<td>Avg</td>
<td><frm:input path="avg"/></td>
</tr>

<tr>
<td><input type="submit" value="Register"/></td>
<td><input type="reset" value="Reset"/></td>
</tr>
</table>
</frm:form>