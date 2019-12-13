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
    <link rel="stylesheet" href="resources/css/listeRestaurants.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>

<body>
    <div class="container">
        <form action="#basic-example-9" method="post">
            
            
            
           <c:forEach var="r" items="${restaurants}">
	            <div class="card mb-3" style="max-width: 740px;">
	                <div class="row no-gutters">
	                    <div class="col-md-4">
	                        <img src="https://mk0tarestaurantt3wcn.kinstacdn.com/wp-content/uploads/2018/01/premiumforrestaurants_0.jpg" class="card-img" alt="...">
	                    </div>
	                    <div class="col-md-8">
	                        <div class="card-body">
	                            <h5 class="card-title">${r.nom}</h5>
	                            <div class="stars">
	                                <span class="fa fa-star" id="star1" onclick="add(this,1)"></span>
	                                <span class="fa fa-star" id="star2" onclick="add(this,2)"></span>
	                                <span class="fa fa-star" id="star3" onclick="add(this,3)"></span>
	                                <span class="fa fa-star" id="star4" onclick="add(this,4)"></span>
	                                <span class="fa fa-star" id="star5" onclick="add(this,5)"></span>
	                            </div>
	                            <div class="adresse">
	                                <p class="card-description">${r.cuisine}</p>
	                                <p class="card-adress">${r.coordonnees.voie} ${r.coordonnees.ville}</p>
	                                <p class="card-tel">${r.coordonnees.tel} </p>
	                                
	                               <!--<button type="button" class="btn btn-outline-success"></button></p> -->
	
									<a href="#" class="btn btn-outline-success" role="button">Afficher</a>
	                            </div>
	                        </div>
	                    </div>
	                </div>
	            </div>
           </c:forEach> 

         
        </form>
       
    </div>
 
 
	 	<div class="container">
	 		 <div class="card mb-3" style="max-width: 740px;">
	 		 	<div class="row no-gutters">
		 		 		<div class="col-md-4">
						  	<c:if test="${page>1}">
								<a href="restaurants/${page-1}/${max}" class="btn btn-dark" role="button">Precedent</a>
							</c:if>
							<span>page ${page} </span>
							<c:if test="${suivExist}">
								<a href="restaurants/${page+1}/${max}" class="btn btn-dark" role="button">Suivant</a>
							</c:if>
						</div>
				</div>
			</div>	
		</div>
   
</body>
</html>
