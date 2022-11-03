<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Bootstrap Link -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<h1 class="text-center bg-info">Job Seeker Report</h1>
<div class="container p-3">
	<c:choose>
		<c:when test="${!empty jsInfo}">
			<table class="table table-hover table-bordered table-light">
				<tr class="text-center">
					<th>JID</th>
					<th>NAME</th>
					<th>ADDRESS</th>
					<th>Resume Download</th>
					<th>Photo Download</th>
					<th>Preview</th>
				</tr>
				
				<c:forEach var="js" items="${jsInfo}">
					<tr class="text-center">
						<td>${js.jsId }</td>
						<td>${js.jsName }</td>
						<td>${js.jsAddrs}</td>
					<td><a class="text-decoration-none" href="download?id=${js.jsId }&type=resume">Download</a></td>
				    <td><a class="text-decoration-none" href="download?id=${js.jsId }&type=photo">Download</a>	</td>
			
				<td>${js.getPhotoPath()}</td>
				</tr>
				</c:forEach>
			</table>
		</c:when>
			</c:choose>
	
	<h2><a class="text-decoration-none" href="./">Home</a></h2>
</div>