<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<head>
        <!-- stylesheet -->
        <link rel="stylesheet" href="resources/css/connexion.css">
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
                                        <h5 class="card-title text-center">Connexion</h5>
                                        
                                        <form:form class="form-signin" method="post" action="check-login" modelAttribute="login-form">
                                        
                                                <div class="form-label-group">
                                                        <form:label path="email" for="inputUserame" ></form:label>
                                                        <form:input path="email" id="inputUserame" class="form-control" placeholder="Email" />
                                                </div>
                                                
                                                <div class="form-label-group">
                                                        <form:label path="pwd" for="inputPassword"></form:label>
                                                        <form:password path="pwd" id="inputPassword" class="form-control" placeholder="Mot de passe" />
                                                        
                                                </div>
                                                
                                                <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Se connecter</button>
                                                <hr class="my-4">
                                        </form:form>
                                </div>
                        </div>
                </div>
        </div>
</div>