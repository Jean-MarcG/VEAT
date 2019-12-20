<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html>
<html lang="UTF-8">

<head>
    <meta charset="utf-8">
    <title>Page liste Restaurant</title>
    <meta name="description" content="Example description">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="resources/css/restoSelec.css">
    <link rel="stylesheet" href="resources/js/restoSelec.js">
    
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>

<body>
    <div class="container">

            
            
        
<!-- 	            <div class="card mb-3" style="max-width: 740px;"> -->
<!-- 	                <div class="row no-gutters"> -->
<!-- 	                    <div class="col-md-4"> -->
<!-- 	                        <img src="https://mk0tarestaurantt3wcn.kinstacdn.com/wp-content/uploads/2018/01/premiumforrestaurants_0.jpg" class="card-img" alt="..."> -->
<!-- 	                    </div> -->
<!-- 	                    <div class="col-md-8"> -->
<!-- 	                        <div class="card-body"> -->
<%-- 	                            <h5 class="card-title">${restaurant.nom}</h5> --%>
<!-- 	                            <div class="stars"> -->
<!-- 	                                <span class="fa fa-star" id="star1" onclick="add(this,1)"></span> -->
<!-- 	                                <span class="fa fa-star" id="star2" onclick="add(this,2)"></span> -->
<!-- 	                                <span class="fa fa-star" id="star3" onclick="add(this,3)"></span> -->
<!-- 	                                <span class="fa fa-star" id="star4" onclick="add(this,4)"></span> -->
<!-- 	                                <span class="fa fa-star" id="star5" onclick="add(this,5)"></span> -->
<!-- 	                            </div> -->
<!-- 	                            <div class="adresse"> -->
<%-- 	                                <p class="card-description">${restaurant.cuisine}</p> --%>
<%-- 	                                <p class="card-adress">${restaurant.coordonnees.voie} ${restaurant.coordonnees.ville}</p> --%>
<%-- 	                                <p class="card-tel">${restaurant.coordonnees.tel} </p> --%>
	                                
<!-- 	                               <button type="button" class="btn btn-outline-success"></button></p> -->
	
<!-- 									<a href="restoSelec" class="btn btn-outline-success" role="button">Afficher</a> -->
<!-- 	                            </div> -->
<!-- 	                        </div> -->
<!-- 	                    </div> -->
<!-- 	                </div> -->
<!-- 	            </div> -->


         
<%--         </form> --%>
       
<!--     </div> -->
 
		  <!--Product Showcase-->
		  <section id="showcase">
			    <div class="container" id='home'>
			      <div class="row">
			        <div class="col-md-6 col-sm-6">
			          <div class="showcase-left">
			            <img src="https://media-cdn.tripadvisor.com/media/photo-s/0e/cc/0a/dc/restaurant-chocolat.jpg" alt="Google Home">
			          </div>
			        </div>
			        <div class="col-md-6 col-sm-6">
			          <div class="showcase-right">
			            <h4>${restaurant.nom}</h4>
			            <p>${restaurant.coordonnees.voie} ${restaurant.coordonnees.ville}</p>
			            <a class="btn btn-light btn-lg showcase-btn">Read More</a>
			          </div>
			        </div>
			      </div>
			  </section>
			
			  <section class="testimonial">
			    <div class="container">
			      <p>"TV and the Internet are good because they keep stupid people from spending too much time out in public."</p>
			      <p class="customer">A Mother</p>
			    </div>
		  </section>
  <hr>
</body>
</html>
