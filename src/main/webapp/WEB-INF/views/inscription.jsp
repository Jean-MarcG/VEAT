<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<head>

 <!-- stylesheet -->
	      <link rel="stylesheet" href="resources/css/inscription.css">
			 <base href="<%=request.getScheme()+"://"+request.getServerName() +":"+request.getServerPort() + request.getContextPath() + "/"%>"/>
</head>
  
  
  <div class="container">
    <div class="row">
      <div class="col-lg-10 col-xl-9 mx-auto" style="margin-top: 5%">
        <div class="card card-signin flex-row my-5">
          <div class="card-img-left d-none d-md-flex">
             <!-- Background image for card set in CSS! -->
          </div>
          <div class="card-body">
            <h5 class="card-title text-center">Inscription</h5>
            <form:form class="form-signin" modelAttribute="login-form">
              <div class="form-label-group">
                <form:input  path="nom" type="text"  id="inputUserame" class="form-control" placeholder="Nom" />
                <form:label path="nom" for="inputUserame"></form:label>
              </div>

              <div class="form-label-group">
                <form:input  path="email" input type="email" id="inputEmail" class="form-control" placeholder="Adresse mail" />
                <form:label path="email" for="inputEmail"></form:label>
              </div>
              
              <hr>

              <div class="form-label-group">
                <form:input  path="pwd" type="password" id="inputPassword" class="form-control" placeholder="Mot de passe"/>
                <form:label  path="pwd" for="inputPassword"></form:label>
              </div>
              
              <div class="form-label-group">
                <form:input path="pwd" type="password" id="inputConfirmPassword" class="form-control" placeholder="Confirmation Mot de passe" />
                <form:label path="pwd" for="inputConfirmPassword"></form:label>
              </div>

              <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Enregistrer</button>
              <a class="d-block text-center mt-2 small" href="connection">Se connecter</a>
              <hr class="my-4">
              <button class="btn btn-lg btn-google btn-block text-uppercase" type="submit"><i class="fab fa-google mr-2"></i> S'enregistrer avec Google</button>
              <button class="btn btn-lg btn-facebook btn-block text-uppercase" type="submit"><i class="fab fa-facebook-f mr-2"></i> S'enregistrer avec Facebook</button>
            </form:form>
          </div>
        </div>
      </div>
    </div>
  </div>
