<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %><!DOCTYPE html>
<html lang="UTF-8"><head>
    <meta charset="utf-8">
    <title>Page My Restaurant</title>
    <meta name="description" content="Example description">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="resources/css/listeRestaurants.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head><body>
    <div class="container">
	                    <div class="col-md-4">
	                        <img src="https://mk0tarestaurantt3wcn.kinstacdn.com/wp-content/uploads/2018/01/premiumforrestaurants_0.jpg" class="card-img" alt="...">
	                    </div>
	                    <div class="col-md-8">
	                        <div class="card-body">
	                            <h5 class="card-title">Nom du Restaurant: ${r.nom}</h5>
	                            
	                            <div class="adresse">
	                                <p class="card-description">Type de cuisine : ${r.cuisine}</p>
	                                <p class="card-adress">Adresse : ${r.coordonnees.voie} ${r.coordonnees.codePostal} ${r.coordonnees.ville} ${r.coordonnees.pays}</p>
	                                <p class="card-tel">Téléphone: ${r.coordonnees.tel} </p>	                                <!-- <button type="button" class="btn btn-outline-success">Afficher</button></p> -->	                          
	                                  </div>
	                        </div>
	                         <a class="nav-link" href="restaurateur">Modifier</a>
	                    </div>
	                
	            </div>
   </body>
</html>