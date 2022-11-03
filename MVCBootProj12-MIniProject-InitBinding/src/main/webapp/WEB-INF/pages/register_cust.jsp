<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">



<frm:form modelAttribute="cust">

<h1 class="text-center">Customer Registration Form</h1>
<table class="table table-hover w-25 m-auto table-bordered ">
<tr >
<td>Customer Name::</td>
<td><frm:input  path="cname" class="form-control"  /></td>
</tr> 
<tr>
<td>Customer dob::</td>
<td><frm:input type="date" path="dob" class="form-control" /></td>
</tr>
<tr>
<td>Customer dop::</td>
<td><frm:input type="date" path="dop" class="form-control" /></td>
</tr>
<tr>
<td>Customer Membership::</td>
<td><frm:checkbox path="isHavingMembership" value="true"/>Member</td>
</tr>

<tr>
<td><input class="btn btn-danger" type="submit" value="Register"/></td>
<td><input class="btn btn-danger" type="reset" value="cancel"/></td>
</tr>
</table>
</frm:form>