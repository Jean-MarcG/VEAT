// la fonction rechercher() affiche la cible de l'evenement (le champs html input)
function rechercher(event) {
//	on affiche dans la console du navigateur la valeur du champs HTML a chaque evenement declenché
//	event = l'evenement gobale 
//	target = l'element HTML qui declenche l'evenement 
//	value c'est une propriete des balise input  par exemple: <input type="text" value="a"/>  <- ton champ par defaut aura la lettre 'a' dedans.
	console.warn(event);
	console.warn(event.target);
	console.warn(event.target.value);
} 