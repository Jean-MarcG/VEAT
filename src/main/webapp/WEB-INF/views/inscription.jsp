<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<head>

 <!-- stylesheet -->
	      <link rel="stylesheet" href="../resources/css/inscription.css">

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
            
			<c:url value="/inscription/utilisateurs/add" context="/veat" var="urladd" />   
			
			         
            <form:form class="form-signin" method="post" action="save-inscription" modelAttribute="inscription-form" >
            
              <div class="form-label-group">
               <!-- il faut que dans path="" <- le nom corresponde a ce qu'il y a dans la classe  -->
                <form:input path="nom" type="text" id="nom" class="form-control" placeholder="Nom"></form:input>
                <form:label path="nom" for="inputUserame"></form:label>
              </div>
              <div class="form-label-group">
                <form:input path="prenom" type="text" id="prenom" class="form-control" placeholder="Prenom"/>
                <form:label path="prenom" for="inputUserame"/>
              </div>
              <div class="form-label-group">
                <form:input path="coordonnees.voie" type="text" id="voie" class="form-control" placeholder="Voie"/>
                <form:label path="coordonnees.voie" for="inputUserame"/>
                <form:input path="coordonnees.codePostal" type="text" id="codePostal" class="form-control" placeholder="Code Postal"/>
                <form:label path="coordonnees.codePostal" for="inputUserame"/>
                <form:input path="coordonnees.ville" type="text" id="ville" class="form-control" placeholder="Ville"/>
                <form:label path="coordonnees.ville" for="inputUserame"/>
                <form:input path="coordonnees.pays" type="text" id="pays" class="form-control" placeholder="Pays"/>
                <form:label path="coordonnees.pays" for="inputUserame"/>
              </div>
              <div class="form-label-group">
                <form:input path="coordonnees.tel" type="text" id="tel" class="form-control" placeholder="Telephone"/>
                <form:label path="coordonnees.tel" for="tel"/>
              </div>

              <div class="form-label-group">
                <form:input path="email" type="email" id="inputEmail" class="form-control" placeholder="Adresse mail"/>
                <form:label path="email" for="inputEmail"/>
              </div>
              
<!--             <div class="custom-control custom-radio custom-control-inline"> -->
<%-- 				<form:input path="role" type="role" id="inputRole" class="form-control"/> --%>
<%-- 			    <form:label path="role" class="custom-control-label" for="customRadioInline1">CLIENT</form:label> --%>
<!-- 			</div> -->
<!-- 			<div class="custom-control custom-radio custom-control-inline"> -->
<%-- 				<form:input path="role" type="role" id="inputRole" class="form-control"/> --%>
<%-- 			    <form:label path="role" class="custom-control-label" for="customRadioInline1">RESTAURATEUR</form:label> --%>
<!-- 			</div> -->

				<div class="custom-control custom-radio custom-control-inline">
				  <form:radiobutton path="role" id="customRadioInline1" name="customRadioInline1" class="custom-control-input"/>
				  <label class="custom-control-label" for="customRadioInline1">CLIENT</label>
				</div>
				<div class="custom-control custom-radio custom-control-inline">
				  <form:radiobutton path="role" id="customRadioInline2" name="customRadioInline1" class="custom-control-input"/>
				  <label class="custom-control-label" for="customRadioInline2">RESTAURATEUR</label>
				</div>
              
              <hr>

              <div class="form-label-group">
                <form:input path="pwd" type="password" id="inputPassword" class="form-control" placeholder="Mot de passe"/>
                <form:label path="pwd" for="inputPassword"/>
              </div>
              
              <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Enregistrer</button>
              <a class="d-block text-center mt-2 small" href="connexion">Se connecter</a>
<!--               <hr class="my-4"> -->
<!--               <button class="btn btn-lg btn-google btn-block text-uppercase" type="submit"><i class="fab fa-google mr-2"></i> S'enregistrer avec Google</button> -->
<!--               <button class="btn btn-lg btn-facebook btn-block text-uppercase" type="submit"><i class="fab fa-facebook-f mr-2"></i> S'enregistrer avec Facebook</button> -->
            </form:form>
          </div>
        </div>
      </div>
    </div>
  </div>
