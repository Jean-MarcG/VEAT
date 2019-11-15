<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>

<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="generator" content="Jekyll v3.8.5">
    
	<title>VEAT</title>
	


   <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

 <!-- Custom styles for this template -->
    <link href="resources/css/inscription.css" rel="stylesheet">

  <body>
  <div class="container">
    <div class="row">
      <div class=".col-6 .col-md-4 mx-auto" style="margin-top: 5%">
        <div class="card card-signin flex-row my-5">
          <div class="card-img-left d-none d-md-flex">
             <!-- Background image for card set in CSS! -->
          </div>
          <div class="card-body">
            <h1 class="card-title text-center">Inscription</h1>
            <form class="form-signin">
              <div class="form-label-group">
                <input type="text" id="inputUserame" class="form-control" placeholder="Nom" required autofocus>
                <label for="inputUserame"></label>
              </div>
                <div class="form-label-group">
                <input type="text" id="inputFirstname" class="form-control" placeholder="Prénom" required autofocus>
                <label for="inputFirstname"></label>
              </div>
              <div class="form-label-group">
                <input type="email" id="inputEmail" class="form-control" placeholder="Email" required>
                <label for="inputEmail"></label>
              </div>
              <div class="form-label-group">
                <input type="email" id="inputTel" class="form-control" placeholder="Téléphone" required>
                <label for="inputTel"></label>
              </div>
                <div class="form-label-group">
                <input type="email" id="inputAdress" class="form-control" placeholder="Adresse" required>
                <label for="inputAdress"></label>
              </div>
              <hr>

              <div class="form-label-group">
                <input type="password" id="inputPassword" class="form-control" placeholder="Mot de passe" required>
                <label for="inputPassword"></label>
              </div>
              
              <div class="form-label-group">
                <input type="password" id="inputConfirmPassword" class="form-control" placeholder="Confirmez le mot de passe" required>
                <label for="inputConfirmPassword"></label>
              </div>

              <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Enregistrer</button>
              <a class="d-block text-center mt-2 small" href="connection.jsp">Connexion</a>
              <hr class="my-4">
              <button class="btn btn-lg btn-google btn-block text-uppercase" type="submit"><i class="fab fa-google mr-2"></i> S'enregistrer avec Google</button>
              <button class="btn btn-lg btn-facebook btn-block text-uppercase" type="submit"><i class="fab fa-facebook-f mr-2"></i> S'enregistrer avec Facebook</button>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</body>
</html>