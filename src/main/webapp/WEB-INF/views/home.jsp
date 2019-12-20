<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<!-- stylesheet -->
<link rel="stylesheet" href="resources/css/home.css">
<script src="${pageContext.request.contextPath}/resources/js/recherche.js"></script>
</head>
<body>
<a name="home"></a>


<!-- HERO SECTION STARTS -->
<div class="hero-section">
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-6 hero-left">
				<div class="tagline">
					<p class="wow fadeInUp">
						Bonjour <c:out value="${sessionScope.userName}" />
						Vous trouver <br> VEAT, un restaurant
					</p>
				</div>
				<div class="search-container">
				<!--  voilà la barre de recherche  -->
				<!--  la premiere idee qui me vient c'est avec du js => recuperer la soit la saisie et faire un tri sinon lorsqu'on clique sur le button -->
					<!-- oninput="" c'est un evenement HTML qui se declenche a chaque fois qu'une touche est appuyée, cet evenement appelle la 
						fonction  rechercher() du javascript en lui donnant l'evenement (ou, quand, comment, sur quoi l'utilisateur a appuyée
					 -->
					 <!-- oninput="rechercher(event)" -->
					 <form:form action="listeRestaurants" method="post" modelAttribute="search-form">
						<form:input path="search" type="text" placeholder="une table près de vous...."/>
						<button type="submit"><i class="fas fa-search"></i></button>
					 </form:form>

						
				</div>
				<div class="shipping">
					<p class="wow fadeInUp" data-wow-delay="0.5s">veat@dawan.fr</p>
				</div>
			</div>
			<div class="col-lg-6 hero-right">
				<div class="hero-image">
					<img src="/veat/resources/img/shawn-ang-nmpW_WwwVSc-unsplash.jpg"
						class="img-fluid wow fadeInUp" data-wow-delay="0.3s"
						alt="Responsive image">
				</div>
			</div>
		</div>
	</div>
</div>
<!-- HERO SECTION ENDS -->
<div class="content">
	<!--------------- about section starts here --------------->
	<a name="about"></a>
	<section class="story">
		<div class="container-fluid">
			<div class="section-data">
				<div class="row">
					<div class="col-md-2"></div>
					<div class="col-md-2 section-index wow fadeInUp"
						data-wow-delay="0.3s">01</div>
					<div class="col-md-8 section-heading wow fadeInUp"
						data-wow-delay="0.4s">Une sortie resto réussie</div>
				</div>
				<div class="row">
					<div class="col-md-4"></div>
					<div class="col-md-6 section-subheading wow fadeInUp"
						data-wow-delay="0.5s">
						<h1>Pour un dîner romantique, une adresse exotique ou une
							grande table entre amis....</h1>
					</div>
				</div>
				<div class="row">
					<div class="col-md-4"></div>
					<div class="col-md-6 section-info wow fadeInUp"
						data-wow-delay="0.6s">Avec VEAT vous n'avez que l'embarras
						du choix dans la recherche du restaurant idéal pour chaque moment.</div>
				</div>
				<div class="row">
					<div class="col-md-4"></div>
					<div class="col-md-8 more wow fadeInUp" data-wow-delay="0.7s">
						<button id="btn">Rechercher</button>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--------------- about section ends here --------------->
	<!--------------- services section starts here --------------->
	<a name="services"></a>
	<section class="services">
		<div class="container-fluid">
			<div class="section-data">
				<div class="row">
					<div class="col-md-2"></div>
					<div class="col-md-2 section-index wow fadeInUp"
						data-wow-delay="0.3s">02</div>
					<div class="col-md-8 section-heading wow fadeInUp"
						data-wow-delay="0.4s">Comment fonctionne VEAT</div>
				</div>
				<div class="row service">
					<div class="col-md-4"></div>
					<div class="col-md-3 wow fadeInUp" data-wow-delay="0.5s">
						<div class="icon">
							<ion-icon name="trending-up"></ion-icon>
						</div>
						<div class="icon-title">VEAT permet aux restaurateurs de
							développer leur chiffre d'affaire en augmentant leur visibilité
							sur internet. Via VEAT, ils ont accès à une vitrine consultée par
							des milliers de visiteurs chaque mois.</div>
					</div>
					<div class="col-md-3 wow fadeInUp" data-wow-delay="0.6s">
						<div class="icon">
							<ion-icon name="link"></ion-icon>
						</div>
						<div class="icon-title">Un volume d'affaires en hausse :
							VEAT affiche des informations types pour chaque restaurant :
							photos, horaires d'ouverture, carte, adresse... VEAT est un outil
							efficace permettant aux propriétaires et gérants de restaurants
							de générer de nouvelles opportunités commerciales.</div>
					</div>
				</div>
				<div class="row service">
					<div class="col-md-4"></div>
					<div class="col-md-3 wow fadeInUp" data-wow-delay="0.7s">
						<div class="icon">
							<ion-icon name="cloud-upload"></ion-icon>
						</div>
						<div class="icon-title">Plus de services : VEAT ne se résume
							pas à une solution technologique. L'entreprise accompagne
							également les professionnels dans la gestion de leurs relations
							clients. Un service client est disponible pour aider les
							restaurateurs et améliorer leur présence en ligne.</div>
					</div>
					<div class="col-md-3 wow fadeInUp" data-wow-delay="0.8s">
						<div class="icon">
							<ion-icon name="share"></ion-icon>
						</div>
						<div class="icon-title">FJCW est spécialiste dans la
							création de sites internet et supports de communication digitaux.
							Nous créons des sites vitrines, des sites e-commerce et des
							applications web. Nous assurons des prestations de bout en bout,
							depuis la phase de conception jusqu'à la mise en ligne et
							l'exploitation.</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--------------- services section ends here --------------->
	<!--------------- team section starts here --------------->
	<a name="team"></a>
	<section class="team">
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-2"></div>
				<div class="col-md-2 section-index wow fadeInUp"
					data-wow-delay="0.3s">03</div>
				<div class="col-md-8 section-heading wow fadeInUp"
					data-wow-delay="0.4s">Our team</div>
			</div>
			<div class="row members">
				<div class="col-md-4"></div>
				<div class="col-md-3 wow fadeInUp" data-wow-delay="0.5s">
					<div class="team-member">
						<div class="team-img team-one"></div>
					</div>
					<div class="team-title">
						<h5>Batman</h5>
						<span>Founder & CEO</span>
					</div>
				</div>
				<div class="col-md-3 wow fadeInUp" data-wow-delay="0.6s">
					<div class="team-member">
						<div class="team-img team-two"></div>
					</div>
					<div class="team-title">
						<h5>John Doe</h5>
						<span>Co-founder</span>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--------------- team section ends here --------------->
</body>
</html>