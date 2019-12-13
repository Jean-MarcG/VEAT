<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<head>
	<!-- stylesheet -->
<<<<<<< HEAD
	<link rel="stylesheet" href="../resources/css/connexion.css">
=======
	<link rel="stylesheet" href="resources/css/connexion.css">
>>>>>>> branch 'dev' of https://github.com/Jean-MarcG/veat.git
	<base href="<%=request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/"%>"/>
</head>

 <div class="container">
	<div class="row" style="margin-top: 5em">
		<div class="col-lg-10 col-xl-9 mx-auto" >
			<div class="card card-signin flex-row my-5">
				<div class="card-img-left d-none d-md-flex">
					<!-- Background image for card set in CSS! -->
					<img class="card-img-left d-none d-md-flex" src="resources/img/Tiramisu.jpg" alt="responsive image"/>
				</div>
				<div class="card-body">
					<h5 class="card-title text-center">Connexion</h5>
					
					<form:form class="form-signin" method="post" action="check-login" modelAttribute="login-form">
					
						<div class="form-label-group">
							<form:label path="email" for="inputUserame" >Email :</form:label>
							<form:input path="email" id="inputUserame" class="form-control" placeholder="Email" />
						</div>
						
						<div class="form-label-group">
							<form:label path="pwd" for="inputPassword">Mot de passe : </form:label>
							<form:password path="pwd" id="inputPassword" class="form-control" placeholder="Mot de passe" />
							
						</div>
						
						<button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Se connecter</button>
						<hr class="my-4">
					</form:form>
				</div>
			</div>
		</div>
	</div>
</div>