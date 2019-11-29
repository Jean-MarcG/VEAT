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

	<title>Contact</title>



   <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

 <!-- Custom styles for this template -->
    <link href="resources/css/inscription.css" rel="stylesheet">

  <body>
  	 <div class=".col-6 .col-md-4 mx-auto" style="margin-top: 5%" >


            <!--------------- hero section starts here say hello 👋 --------------->
            <div class="container">               
                                    <h2 class="wow fadeInUp" data-wow-delay="1s">Bienvenue chez VEAT</h2><br>
                                    <p class="wow fadeInUp" data-wow-delay="1.2s">Que pouvons nous faire pour vous ?</p>

            </div>
            <!--------------- hero section ends here --------------->

            <!-- <div class="whitespace"></div> -->

            <!--------------- form section starts here --------------->
            <div class="container-fluid">
                               
                              <form name="contact-form" id="contact-form" method="post" action="">

                              <ul>

                              <li class="wow fadeInUp" data-wow-delay="1.4s">
                                    <label for="contact-name"></label>
                                    <div class="textarea">
                                          <input type="text" placeholder="Nom" name="contact-name" id="contact-name" value="" required>
                                    </div>
                              </li>

                              <li class="wow fadeInUp" data-wow-delay="1.6s">
                                    <label for="contact-email"></label>
                                    <div class="textarea">
                                          <input type="email" placeholder="Email" name="contact-email" id="contact-email" value="" required>
                                    </div>
                              </li>

                              <li class="wow fadeInUp" data-wow-delay="1.6s">
                                    <label for="contact-project"></label>
                                    <div class="textarea">
                                          <textarea type="email" placeholder="Message" name="contact-project" id="contact-project" rows="6" value="" required>
                                          </textarea>
                                    </div>
                              </li>

                              </ul>

                              <button type="submit" name="contact-submit" id="contact-submit" class="send wow fadeInUp">Envoyer</button>

                              </form>
                        </div>
                  </div>
            </div>
  	 </div>
</body>
</html> 