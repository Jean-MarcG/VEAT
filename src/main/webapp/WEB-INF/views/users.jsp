<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<%@ page session="true" %>
<html>
<head>
	<title>Home</title>
	<base href="<%=request.getScheme()+"://"+request.getServerName()
		+":"+request.getServerPort() + request.getContextPath() + "/"%>" />
</head>
<body>
	<h3>Liste des utilisateurs</h3>
	
	<table border="1">
		<tr>
			<td>Nom</td>
			<td>Email</td>
			<td>Actions</td>
		</tr>
		<c:forEach var="u" items="${users}">
			<tr>
				<td>${u.name}</td>
				<td>${u.email}</td>
				<td>
					<a href="users/remove/${u.id}">Supprimer</a>
					Modifier
				</td>
			</tr>
		</c:forEach>
	</table>
	<c:if test="${page>1}">
		<a href="users/${page-1}/${max}">Précédent</a>
	</c:if>
	<span> | ${page} </span>
	<c:if test="${suivExist}">
		<a href="users/${page+1}/${max}">Suivant</a>
	</c:if>
	
</body>
</html>
