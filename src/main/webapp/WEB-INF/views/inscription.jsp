<head>

 <!-- stylesheet -->
	      <link rel="stylesheet" href="resources/css/inscription.css">

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
            <form class="form-signin">
              <div class="form-label-group">
                <input type="text" id="inputUserame" class="form-control" placeholder="Nom" required autofocus>
                <label for="inputUserame"></label>
              </div>

              <div class="form-label-group">
                <input type="email" id="inputEmail" class="form-control" placeholder="Adresse mail" required>
                <label for="inputEmail"></label>
              </div>
              
              <hr>

              <div class="form-label-group">
                <input type="password" id="inputPassword" class="form-control" placeholder="Mot de passe" required>
                <label for="inputPassword"></label>
              </div>
              
              <div class="form-label-group">
                <input type="password" id="inputConfirmPassword" class="form-control" placeholder="Confirmation Mot de passe" required>
                <label for="inputConfirmPassword"></label>
              </div>

              <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Enregistrer</button>
              <a class="d-block text-center mt-2 small" href="#">Se connecter</a>
              <hr class="my-4">
              <button class="btn btn-lg btn-google btn-block text-uppercase" type="submit"><i class="fab fa-google mr-2"></i> S'enregistrer avec Google</button>
              <button class="btn btn-lg btn-facebook btn-block text-uppercase" type="submit"><i class="fab fa-facebook-f mr-2"></i> S'enregistrer avec Facebook</button>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
