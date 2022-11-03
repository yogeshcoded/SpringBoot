<%@ page language="java" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>

<!-- Bootstrap Link -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script>
 function handleSumit(){
	 alert("submit");
 }
</script>
<frm:form modelAttribute="js" enctype="multipart/form-data">
<h1  class="text-center">Job Seeker Registration Form</h1>
<table class="table table-hover w-25 m-auto table-bordered table-success table-striped-columns">
<tr>
<td>Name</td>
<td><frm:input path="jsName"/></td>
</tr>
<tr>
<td>Address</td>
<td><frm:input path="jsAddrs"/></td>
</tr>
<tr>
<td>Select Resume</td>
<td><frm:input type="file" path="resume"/></td>
</tr>
<tr>
<td>Select Photo</td>
<td><frm:input type="file" path="photo" /></td>
</tr>
<tr>
<td><button class="btn btn-danger" >Register</button></td>
<td><button class="btn btn-danger">Cancel</button></td>
</tr>

</table>
</frm:form>