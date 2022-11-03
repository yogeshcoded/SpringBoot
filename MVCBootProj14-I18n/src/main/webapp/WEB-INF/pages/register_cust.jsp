<%@ page isELIgnored="false" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="sp" %>

<h1 style="text-align: center"><sp:message code="cust.registration.title"/></h1>
<form:form modelAttribute="cust">
<table align="center" border="5" bgcolor="cyan">
<tr>
<td><sp:message code="cust.registration.name"></sp:message></td>
<td><form:input path="cname"/></td>
</tr>
<tr>
<td><sp:message code="cust.registration.addrs"></sp:message></td>
<td><form:input path="addrs"/></td>
</tr>
<tr>
<td><sp:message code="cust.registration.billAmount"></sp:message></td>
<td><form:input path="billAmount"/></td>
</tr>
<tr>
<td><input class="btn btn-register" type="submit" value="<sp:message code="cust.btn.register"/>"/></td>
</tr>
</table>
</form:form>
<br><br><br><br>

<p style="text-align:center;color:blue;">
<a href="?lang=en_US">English</a>          &nbsp;&nbsp;&nbsp;&nbsp;
<a href="?lang=hi_IN">हिन्दी</a> &nbsp;&nbsp;&nbsp;&nbsp;
<a href="?lang=mr_MR">मराठी</a> &nbsp;&nbsp;&nbsp;&nbsp;
<a href="?lang=fr_FR">French</a> &nbsp;&nbsp;&nbsp;&nbsp;
<a href="?lang=de_GR">German</a> &nbsp;&nbsp;&nbsp;&nbsp;
</p>