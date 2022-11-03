<%@ page isELIgnored="false" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

 <h1 style="text-align:center;color:blue;"><s:message code="home.title"/></h1>
<br><br>
<h1 style="text-align:center;color:blue;"><a  href="register"><s:message code="home.link"/></a></h1>
<br>
<h1>Current active local is ::${pageContext.response.locale}</h1>
<fmt:setLocale value="${pageContext.response.locale}"/>

 <jsp:useBean id="dt" class="java.util.Date"/>
<fmt:formatDate var="fdt" value="${dt}" type="date" dateStyle="FULL"/>
<b>Formated date::${fdt}</b><br>

<fmt:formatDate var="ftime" value="${dt}" type="time" dateStyle="FULL"/>
<b>Formated time::${ftime}</b><br>

<fmt:formatNumber var="fnumber" type="number" value="10000"/>
<b>Format Number::${fnumber}</b><br>

<fmt:formatNumber var="fcurrency" type="currency" value="10000"/>
<b>Format Currency::${fcurrency}</b><br>

<fmt:formatNumber var="fpercentage" type="percent" value="10000"/>
<b>Format Percentage::${fpercentage}</b><br>


<p style="text-align:center;color:blue;">
<a href="?lang=en_US">English</a>          &nbsp;&nbsp;&nbsp;&nbsp;
<a href="?lang=hi_IN">हिन्दी</a> &nbsp;&nbsp;&nbsp;&nbsp;
<a href="?lang=mr_MR">मराठी</a> &nbsp;&nbsp;&nbsp;&nbsp;
<a href="?lang=fr_FR">French</a> &nbsp;&nbsp;&nbsp;&nbsp;
<a href="?lang=de_GR">German</a> &nbsp;&nbsp;&nbsp;&nbsp;
</p>