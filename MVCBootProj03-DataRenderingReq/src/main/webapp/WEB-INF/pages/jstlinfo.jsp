
<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 

<h1>model attributes are::</h1>
<b>favColor are ::</b><br>
<c:forEach var="color" items="${favColor}">
     ${color},
</c:forEach>
<br>

<b>nicknames are ::</b><br>
<c:forEach var="name" items="${nickNames}">
     ${name},<br>
</c:forEach>
<br>

<b>phoneNo are ::</b><br>
<c:forEach var="phone" items="${phoneNo}">
     ${phone},<br>
</c:forEach>
<br>

<b>idDetails are ::</b><br>
<c:forEach var="id" items="${idDetails}">
     ${id.key},<br>
     ${id.value}
</c:forEach>

