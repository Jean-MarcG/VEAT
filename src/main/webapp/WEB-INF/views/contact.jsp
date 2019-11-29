<head>

 <!-- stylesheet -->
	      <link rel="stylesheet" href="resources/css/contact.css">
			<link rel="stylesheet" href="resources/imgs/contact.css">
</head>
  
  
  <div class="container">
    <div class="row">
      <div class="col-lg-10 col-xl-9 mx-auto" style="margin-top: 5%">
        <div class="card card-signin flex-row my-5">
          <div class="card-img-left d-none d-md-flex">
             <!-- Background image for card set in CSS! -->
          </div>
          <div class="card-body">
            <h5 class="card-title text-center">Contact</h5>
            <h2 class="wow fadeInUp" data-wow-delay="1s">Bienvenue chez VEAT</h2><br>
            <p class="wow fadeInUp" data-wow-delay="1.2s">Que pouvons nous faire pour vous ?</p> 
            <form class="form-signin" name="contact-form" id="contact-form" method="post" action="">
              <div class="form-label-group">
                <input type="text"  id="inputUserame" class="form-control" placeholder="Nom"  required autofocus>
                <label for="inputUserame"></label>
              </div>

              <div class="form-label-group">
                <input type="email" id="inputEmail" class="form-control" placeholder="Adresse mail" required>
                <label for="inputEmail"></label>
              </div>
              <hr>
				<label for="contact-project"></label> 
                      <div class="textarea"> 
                      <textarea type="email" placeholder="Message" name="contact-project" id="contact-project" rows="6" value="" required>
                       </textarea>
                      </div> 
              <button type="submit" name="contact-submit" id="contact-submit" class="send wow fadeInUp">Envoyer</button>
          
              <hr class="my-4">
             
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>

