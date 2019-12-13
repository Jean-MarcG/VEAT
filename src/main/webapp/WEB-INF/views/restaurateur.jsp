<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<head>
	<!-- stylesheet -->
	<link rel="stylesheet" href="../resources/css/connexion.css">
	<base href="<%=request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/"%>"/>
</head>

 <div class="container">
	<div class="row" style="margin-top: 5em">
		<div class="col-lg-10 col-xl-9 mx-auto" >
			<div class="card card-signin flex-row my-5">
				<div class="card-body">
					<h5 class="card-title text-center">Restaurateur</h5>
					
					<form class="form-signin">
		              <div class="form-label-group">
		                <input path="nom" type="text" id="inputUserame" class="form-control" placeholder="Nom du Restaurant" >
		                <label path="nom" for="inputUserame"></label>
		              </div>
		              
		              <div class="form-label-group">
		                <input path="cuisine" type="text" class="form-control" placeholder="Type de cuisine" >
		                <label path="cuisine" ></label>
		              </div>
		              <div class="form-label-group">
		                <input path="tel" type="text" class="form-control" placeholder="Téléphone" >
		                <label path="tel" ></label>
		              </div>
		              <div class="form-label-group">
		                <input path="voie" type="text" class="form-control" placeholder="Voie" >
		                <label path="voie" ></label>
		              </div>
		              <div class="form-label-group">
		                <input path="codePostal" type="text" class="form-control" placeholder="Code postal" >
		                <label path="codePostal" ></label>
		              </div>
		              <div class="form-label-group">
		                <input path="ville" type="text" class="form-control" placeholder="Ville" >
		                <label path="ville" ></label>
		              </div>
					<div class="form-label-group">
		                <input path="pays" type="text" class="form-control" placeholder="Pays" >
		                <label path="pays" ></label>
		              </div>
		              <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Enregistrer</button>
		    
		            </form>

				</div>
			</div>
		</div>
	</div>
</div>