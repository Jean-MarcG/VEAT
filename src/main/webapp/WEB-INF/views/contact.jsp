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
					<h3 class="card-title text-center">Bienvenue chez VEAT</h3>
					<h5  class="card-title text-center">Que pouvons-nous pour vous?</h5>
					<form class="form-signin">
		              <div class="form-label-group">
		                <input path="nom" type="text" id="inputUserame" class="form-control" placeholder="Nom " >
		                <label path="nom" for="inputUserame"></label>
		              </div>
		              
		              <div class="form-label-group">
		                <input path="email" type="text" class="form-control" placeholder="Email" >
		                <label path="email" ></label>
		              </div>
		              <div class="form-label-group">
		                <textarea path="message" type="textarea" class="form-control" placeholder="Votre message" ></textarea>
		                <label path="message" ></label>
		              </div>
		              <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Envoyer</button>
		    
		            </form>

				</div>
			</div>
		</div>
	</div>
</div>