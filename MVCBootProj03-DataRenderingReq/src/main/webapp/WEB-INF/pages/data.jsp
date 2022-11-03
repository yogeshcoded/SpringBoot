<%@ page isELIgnored="false" import="java.util.*"%>

<h1>model attributes are::</h1><br>
<b>favColor names::<%=Arrays.toString((String[])request.getAttribute("favColor")) %></b><br>
<b>nicknames:: ${nickNames}</b><br>
<b>phoneNo:: ${phoneNo}</b><br>
<b>idDetails:: ${idDetails}</b><br>